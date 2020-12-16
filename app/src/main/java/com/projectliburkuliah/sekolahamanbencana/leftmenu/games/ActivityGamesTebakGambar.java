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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService4;
import com.projectliburkuliah.sekolahamanbencana.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityGamesTebakGambar extends AppCompatActivity implements View.OnClickListener {
    private final String jawaban = "KARENATANDUS";
    private String posisi = "pertama";
    private Button AA,BB,CC,DD,EE,FF,GG,HH,II,JJ,KK,LL,MM,NN,OO,PP,QQ,RR,SS,TT,UU,VV,WW,XX,YY,ZZ;
    private Boolean show = true;
    Button btn_cek, btn_show, btn_delete;
    ImageView iv_back, iv_correct;
    TextView tv_jawab, tv_disini;
    LinearLayout ll_huruf;

    private ArrayList<Button> al_button;
    Intent svc;
    Intent svc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_tebak_gambar);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        svc=new Intent(this, MyService.class);
        svc4=new Intent(this, MyService4.class);

//        btn_show = findViewById(R.id.btn_show);
        iv_correct = findViewById(R.id.iv_corret);
        btn_cek = findViewById(R.id.btn_cek);
        tv_jawab = findViewById(R.id.tv_jawab);
        tv_disini = findViewById(R.id.tv_disini);
        ll_huruf = findViewById(R.id.ll_huruf);
        iv_back = findViewById(R.id.iv_back);

        iv_correct.setVisibility(View.INVISIBLE);
//
//        btn_show.setOnClickListener(this);
        btn_cek.setOnClickListener(this);
        tv_disini.setOnClickListener(this);
        tv_jawab.setOnClickListener(this);
        iv_back.setOnClickListener(this);
        iv_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
                startService(svc); //OR stopService(svc);
                stopService(svc4); //OR stopService(svc);
            }
        });

        AA = findViewById(R.id.A);          BB = findViewById(R.id.B);          CC = findViewById(R.id.C);
        DD = findViewById(R.id.D);          EE = findViewById(R.id.E);          FF = findViewById(R.id.F);
        GG = findViewById(R.id.G);          HH = findViewById(R.id.H);          II = findViewById(R.id.I);
        JJ = findViewById(R.id.J);          KK = findViewById(R.id.K);          LL = findViewById(R.id.L);
        MM = findViewById(R.id.M);          NN = findViewById(R.id.N);          OO = findViewById(R.id.O);
        PP = findViewById(R.id.P);          QQ = findViewById(R.id.Q);          RR = findViewById(R.id.R);
        SS = findViewById(R.id.S);          TT = findViewById(R.id.T);          UU = findViewById(R.id.U);
        VV = findViewById(R.id.V);          WW = findViewById(R.id.W);          XX = findViewById(R.id.X);
        YY = findViewById(R.id.Y);          ZZ = findViewById(R.id.Z);          btn_delete = findViewById(R.id.btn_delete);

        al_button = new ArrayList<>(Arrays.asList(AA,BB,CC,DD,EE,FF,GG,HH,II,JJ,KK,LL,MM,NN,OO,PP,QQ,RR,SS,TT,UU,VV,WW,XX,YY,ZZ, btn_delete));
        for (Button a: al_button){
            a.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button){
            String huruf = ((Button) v).getText().toString();
            if (huruf.length() == 1) {
                iv_correct.setVisibility(View.INVISIBLE);
                if (posisi.equals("pertama")) {
                    String jawabanBaru = tv_jawab.getText() + huruf;
                    if (jawabanBaru.length() <= 6 ){
                        tv_jawab.setText(jawabanBaru);
                    } else {
                        tv_jawab.setText(jawabanBaru.substring(0, tv_jawab.getText().length()-1) + huruf);
                    }
                } else if (posisi.equals("kedua")) {
                    String jawabanBaru = tv_disini.getText() + huruf;
                    if (jawabanBaru.length() <= 6 ){
                        tv_disini.setText(jawabanBaru);
                    } else {
                        tv_disini.setText(jawabanBaru.substring(0, tv_jawab.getText().length()-1) + huruf);
                    }
                }
            }
        }

        switch (v.getId()){
            case R.id.btn_cek:
                String jawab = tv_jawab.getText().toString().trim();
                String disini = tv_disini.getText().toString().trim();
                if ((jawab + disini).equals(this.jawaban)){
                    jawabanBenar();
                } else {
                    jawabanSalah();
                }
                break;
            case R.id.btn_delete:
                iv_correct.setVisibility(View.INVISIBLE);
                if (this.posisi.equals("pertama")){
                    String jawaban = tv_jawab.getText().toString();
                    if (jawaban.isEmpty()){
                        break;
                    }
                    String jawabanBaru = jawaban.substring(0, jawaban.length()-1);
                    tv_jawab.setText(jawabanBaru);
                } else {
                    String jawaban = tv_disini.getText().toString();
                    if (jawaban.isEmpty()){
                        break;
                    }
                    String jawabanBaru = jawaban.substring(0, jawaban.length() -1 );
                    tv_disini.setText(jawabanBaru);
                }
                break;
            case R.id.tv_jawab:
                tv_jawab.setBackgroundResource(R.drawable.rounded_rectangle_bluegreen);
                tv_disini.setBackgroundResource(R.drawable.rounded_rectangle_normalblue);
                this.posisi = "pertama";
                break;
            case R.id.tv_disini:
                tv_disini.setBackgroundResource(R.drawable.rounded_rectangle_bluegreen);
                tv_jawab.setBackgroundResource(R.drawable.rounded_rectangle_normalblue);
                this.posisi = "kedua";
                break;
//            case R.id.btn_show:
//                if (this.show){
//                    this.show = false;
//                    btn_show.setText("TAMPIL");
//                    ll_huruf.setVisibility(View.INVISIBLE);
//                } else {
//                    this.show = true;
//                    btn_show.setText("SEMBUNYI");
//                    ll_huruf.setVisibility(View.VISIBLE);
//                }
//                break;
        }
    }

    private void jawabanSalah() {
        iv_correct.setVisibility(View.VISIBLE);
        iv_correct.setImageResource(R.drawable.ic_false_red);
        MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesTebakGambar.this,R.raw.backsoundfalse);
        mediaPlayer.start();
    }


    private void jawabanBenar() {
        iv_correct.setVisibility(View.VISIBLE);
        iv_correct.setImageResource(R.drawable.ic_check_green);
        timer(true);
        MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesTebakGambar.this,R.raw.backsoundtrue);
        mediaPlayer.start();
    }

    private void timer(final boolean status) {
        final int screenDisplay = 1000;
        Thread welcomeThread = new Thread(){
            int wait = 0;

            @Override
            public void run() {
                try{
                    super.run();
                    while(wait < screenDisplay){
                        sleep(100);
                        wait+=100;
                    }
                } catch (Exception e){
                    System.out.println("Error: " + e);
                } finally {
                    if (status){
                        Intent benarIntent = new Intent(ActivityGamesTebakGambar.this, ActivityGamesBenar.class);
                        benarIntent.putExtra(ActivityGamesBenar.GAMES, "Longsor");
                        startActivity(benarIntent);
                        finish();
                    }
                }
            }
        };
        welcomeThread.start();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Intent svc=new Intent(this, MyService.class);
        final Intent svc4=new Intent(this, MyService4.class);

        finish();
        startService(svc); //OR stopService(svc);
        stopService(svc4); //OR stopService(svc);
    }

    @Override
    public void onTrimMemory(int level) {
        final Intent svc4=new Intent(this, MyService4.class);
        super.onTrimMemory(level);
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            if(svc4 != null){
                stopService(svc4);
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent svc4=new Intent(this, MyService4.class);
        startService(svc4); //OR stopService(svc);
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Intent svc4=new Intent(this, MyService4.class);
        PowerManager mPowerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);

        if (!mPowerManager.isScreenOn())
            if (svc4!= null)
                stopService(svc4);
    }
}
