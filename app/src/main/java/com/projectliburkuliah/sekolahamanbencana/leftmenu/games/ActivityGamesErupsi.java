package com.projectliburkuliah.sekolahamanbencana.leftmenu.games;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService2;
import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.leftmenu.kiri;

public class ActivityGamesErupsi extends AppCompatActivity implements View.OnClickListener {
    private int counterRespon = 0;


    TextView tv_laki, tv_perempuan, tv_benar, tv_salah, tv_deskripsi;
    ImageView background;
    Button btn_ulang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        inisialisasi();


    }

    private void inisialisasi() {

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc2=new Intent(this, MyService2.class);
        setContentView(R.layout.activity_games_erupsi);

        background = findViewById(R.id.background);
        tv_perempuan = findViewById(R.id.tv_perempuan);
        tv_laki = findViewById(R.id.tv_laki);
        tv_benar = findViewById(R.id.tv_jawabanbenar);
        tv_salah = findViewById(R.id.tv_jawabansalah);
        tv_deskripsi = findViewById(R.id.tv_deskripsi);
        btn_ulang = findViewById(R.id.btn_ulang);

        background.setOnClickListener(this);

        tv_deskripsi.setOnClickListener(this);
        btn_ulang.setOnClickListener(this);
        tv_benar.setOnClickListener(this);
        tv_salah.setOnClickListener(this);
        ImageView btn_back = (ImageView) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
                startService(svc); //OR stopService(svc);
                stopService(svc2); //OR stopService(svc);
            }
        });
    }

    @Override
    public void onClick(View v) {

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc2=new Intent(this, MyService2.class);

        switch (v.getId()){
            case R.id.tv_jawabanbenar:
                setResponses(true);
                counterRespon++;
                break;
            case R.id.tv_jawabansalah:
                setResponses(false);
                counterRespon = 0;
                tv_deskripsi.setEnabled(false);
                btn_ulang.setVisibility(View.VISIBLE);
                break;
            case R.id.tv_deskripsi:
                setResponses(false);
                counterRespon++;
                break;
            case R.id.btn_ulang:
                if (counterRespon == 9){
                    finish();
                    startService(svc); //OR stopService(svc);
                    stopService(svc2); //OR stopService(svc);
                    break;


                }
                inisialisasi();
                break;
        }
    }

    private void setResponses(boolean jawabanBenar) {
        switch (counterRespon){
            case 0:
                tv_laki.setVisibility(View.VISIBLE);
                break;
            case 1:
                tv_benar.setVisibility(View.VISIBLE);
                tv_salah.setVisibility(View.VISIBLE);
                tv_deskripsi.setVisibility(View.INVISIBLE);
                tv_perempuan.setText(". . . . .");
                break;
            case 2:
                tv_benar.setVisibility(View.INVISIBLE);
                tv_salah.setVisibility(View.INVISIBLE);
                tv_deskripsi.setVisibility(View.VISIBLE);
                if (jawabanBenar){
                    tv_deskripsi.setText("Benar sekali. Zona Ring of Fire adalah daerah yang sering mengalami bencana gempa bumi dan letusan gunung berapi");
                    tv_perempuan.setText(tv_benar.getText().toString());
                    MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesErupsi.this,R.raw.backsoundtrue);
                    mediaPlayer.start();
                } else {
                    tv_deskripsi.setText("Jawaban kamu kurang tepat, zona Ring of Fire adalah daerah yang sering mengalami bencana gempa bumi dan letusan gurung berapi");
                    tv_perempuan.setText(tv_salah.getText().toString());
                    MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesErupsi.this,R.raw.backsoundfalse);
                    mediaPlayer.start();
                }
                break;
            case 3:
                tv_deskripsi.setText("");
                tv_laki.setText(" ");
                tv_perempuan.setText("Pada saat terjadi erupsi, biasanya terdapat cairan berwarna merah yang keluar dari gunung");
                break;
            case 4:
                tv_perempuan.setText("Apakah kamu tau nama cairan tersebut?");
                tv_laki.setText(". . . . .");
                tv_benar.setVisibility(View.VISIBLE);
                tv_salah.setVisibility(View.VISIBLE);
                tv_deskripsi.setVisibility(View.INVISIBLE);
                tv_benar.setText("Lava");
                tv_salah.setText("Lahar");
                break;
            case 5:
                tv_benar.setVisibility(View.INVISIBLE);
                tv_salah.setVisibility(View.INVISIBLE);
                tv_deskripsi.setVisibility(View.VISIBLE);
                tv_laki.setText("Ya, cairan itu bernama . . . . .");
                if (jawabanBenar){
                    tv_deskripsi.setText("Benar! Lava adalah materi erupsi gunung api berupa zat cair yang umumnya keluar secara meleleh dan berwarna merah");
                    tv_laki.setText(tv_benar.getText().toString());
                    MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesErupsi.this,R.raw.backsoundtrue);
                    mediaPlayer.start();
                } else {
                    tv_deskripsi.setText("Jawaban kamu kurang tepat. Lahar adalah materi erupsi gunung api yang berbentuk padat dan telah bercampur dengan air.");
                    tv_laki.setText(tv_salah.getText().toString());
                    MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesErupsi.this,R.raw.backsoundfalse);
                    mediaPlayer.start();
                }
                break;
            case 6:
                tv_deskripsi.setText("");
                tv_laki.setText(" ");
                tv_perempuan.setText("Saat terjadi erupsi, apa yang sebaiknya kamu lakukan?");
                tv_laki.setText(". . . . .");
                tv_benar.setVisibility(View.VISIBLE);
                tv_salah.setVisibility(View.VISIBLE);
                tv_deskripsi.setVisibility(View.INVISIBLE);
                tv_benar.setText("Pergi ke tempat yang aman");
                tv_salah.setText("Melihat lebih dekat tempat terjadinya erupsi");
                break;
            case 7:
                tv_benar.setVisibility(View.INVISIBLE);
                tv_salah.setVisibility(View.INVISIBLE);
                tv_deskripsi.setVisibility(View.VISIBLE);
                if (jawabanBenar){
                    tv_deskripsi.setText("Benar sekali. Kita sebaiknya berada di dalam rumah dan tidak mendekati daerah bencana. Jika erupsi menjadi lebih parah, kita harus mengungsi ke tempat yang lebih aman.");
                    tv_laki.setText(tv_benar.getText().toString());
                    MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesErupsi.this,R.raw.backsoundtrue);
                    mediaPlayer.start();
                } else {
                    tv_deskripsi.setText("Jawaban kamu salah. Saat terjadi bencana erupsi, jangan mendekati wilayah tersebut ya. Berlindunglah di dalam rumah atau pergi ke tempat evakuasi");
                    tv_laki.setText(tv_salah.getText().toString());
                    MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesErupsi.this,R.raw.backsoundfalse);
                    mediaPlayer.start();
                }
                break;
            case 8:
                btn_ulang.setVisibility(View.VISIBLE);
                tv_perempuan.setText("Kamu hebat!");
                tv_laki.setText("TerimaKasih ^_^");
                btn_ulang.setText("Selesai");
                tv_deskripsi.setVisibility(View.INVISIBLE);
                kiri. kunciGame2 = true;
                break;
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Intent svc=new Intent(this, MyService.class);
        final Intent svc2=new Intent(this, MyService2.class);

        finish();
        startService(svc); //OR stopService(svc);
        stopService(svc2); //OR stopService(svc);
    }

    @Override
    public void onTrimMemory(int level) {
        final Intent svc2=new Intent(this, MyService2.class);
        super.onTrimMemory(level);
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            if(svc2 != null){
                stopService(svc2);
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent svc2=new Intent(this, MyService2.class);
        startService(svc2); //OR stopService(svc);
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Intent svc2=new Intent(this, MyService2.class);
        PowerManager mPowerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);

        if (!mPowerManager.isScreenOn())
            if (svc2!= null)
                stopService(svc2);
    }
}
