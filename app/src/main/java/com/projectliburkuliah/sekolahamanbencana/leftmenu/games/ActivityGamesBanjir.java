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
import android.widget.ImageView;
import android.widget.TextView;

import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService3;
import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.leftmenu.kiri;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityGamesBanjir extends AppCompatActivity implements View.OnClickListener {
    private ImageView  iv_tv, iv_tv_false, iv_meja, iv_meja_false, iv_uang, iv_uang_true, iv_dokumen, iv_dokumen_true,
                iv_pakaian, iv_pakaian_true, iv_rumah, iv_rumah_true, iv_boneka, iv_boneka_false, iv_srngtgn, iv_srngtgn_false,
                iv_makanan, iv_makanan_true;
    private int counterBarangBenar = 0 ;
    private TextView tv_deskripsi;
    private ArrayList<ImageView> barang;
    private ArrayList<ImageView> status;
    private String[] deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_banjir);

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc3=new Intent(this, MyService3.class);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        tv_deskripsi = findViewById(R.id.tv_desripsi);
        iv_tv = findViewById(R.id.iv_tv);               iv_tv_false = findViewById(R.id.iv_tv_false);
        iv_meja = findViewById(R.id.iv_meja);           iv_meja_false = findViewById(R.id.iv_meja_false);
        iv_uang = findViewById(R.id.iv_uang);           iv_uang_true = findViewById(R.id.iv_uang_true);
        iv_dokumen = findViewById(R.id.iv_dokumen);     iv_dokumen_true = findViewById(R.id.iv_dokumen_true);
        iv_pakaian = findViewById(R.id.iv_pakaian);     iv_pakaian_true = findViewById(R.id.iv_pakaian_true);
        iv_rumah = findViewById(R.id.iv_rumah);         iv_rumah_true = findViewById(R.id.iv_rumah_true);
        iv_boneka = findViewById(R.id.iv_boneka);       iv_boneka_false = findViewById(R.id.iv_boneka_false);
        iv_srngtgn = findViewById(R.id.iv_sarungtangan);iv_srngtgn_false = findViewById(R.id.iv_sarungtangan_false);
        iv_makanan = findViewById(R.id.iv_makanan);     iv_makanan_true = findViewById(R.id.iv_makanan_true);

        deskripsi = getResources().getStringArray(R.array.deskripsigame3banjir);
        status = new ArrayList<>(Arrays.asList(iv_tv_false, iv_meja_false, iv_dokumen_true, iv_uang_true, iv_pakaian_true, iv_rumah_true, iv_boneka_false, iv_srngtgn_false, iv_makanan_true));
        barang = new ArrayList<>(Arrays.asList(iv_tv, iv_meja, iv_dokumen, iv_uang, iv_pakaian, iv_rumah, iv_boneka, iv_srngtgn, iv_makanan));
        for (ImageView brng: barang){
            brng.setOnClickListener(this);

            ImageView btn_back = (ImageView) findViewById(R.id.btn_back);
            btn_back.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v){
                    finish();
                    startService(svc); //OR stopService(svc);
                    stopService(svc3); //OR stopService(svc);


                }
            });
        }
    }

    @Override
    public void onClick(View v) {
        for (ImageView brng: barang){
            if (v.getId() == brng.getId()){
                int index = barang.indexOf(brng);
                brng.setEnabled(false);
                status.get(index).setVisibility(View.VISIBLE);
                tv_deskripsi.setText(deskripsi[index]);
                if (index == 2 || index == 3 || index == 4 || index == 5 || index == 8){
                    counterBarangBenar++;
                    MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesBanjir.this,R.raw.backsoundtrue);
                    mediaPlayer.start();
                    if (counterBarangBenar == 5){
                        for (ImageView setbarang: barang){
                            setbarang.setEnabled(false);
                        }
                        kiri. kunciGame4 = true;
                        tv_deskripsi.setText("Kamu benar! Itulah barang-barang yang perlu kamu bawa saat terjadi bencana banjir");
                    }
                } else {MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesBanjir.this,R.raw.backsoundfalse);
                    mediaPlayer.start();}

                return;
            }
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Intent svc=new Intent(this, MyService.class);
        final Intent svc3=new Intent(this, MyService3.class);

        finish();
        startService(svc); //OR stopService(svc);
        stopService(svc3); //OR stopService(svc);
    }

    @Override
    public void onTrimMemory(int level) {
        final Intent svc3=new Intent(this, MyService3.class);
        super.onTrimMemory(level);
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            if(svc3 != null){
                stopService(svc3);
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent svc3=new Intent(this, MyService3.class);
        startService(svc3); //OR stopService(svc);
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Intent svc3=new Intent(this, MyService3.class);
        PowerManager mPowerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);

        if (!mPowerManager.isScreenOn())
            if (svc3!= null)
                stopService(svc3);
    }
}
