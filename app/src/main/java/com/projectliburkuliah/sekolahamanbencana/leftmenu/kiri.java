package com.projectliburkuliah.sekolahamanbencana.leftmenu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.leftmenu.games.ActivityGamesBanjir;
import com.projectliburkuliah.sekolahamanbencana.leftmenu.games.ActivityGamesErupsi;
import com.projectliburkuliah.sekolahamanbencana.leftmenu.games.ActivityGamesTebakGambar;
import com.projectliburkuliah.sekolahamanbencana.leftmenu.games.ActivityGamesTebakKata;
import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService2;
import com.projectliburkuliah.sekolahamanbencana.services.MyService3;
import com.projectliburkuliah.sekolahamanbencana.services.MyService4;

public class kiri extends AppCompatActivity {
    public static boolean kunciGame2;
    public static boolean kunciGame3;
    public static boolean kunciGame4;
    private boolean kunciGame = false;

    ImageView iv_lock1, iv_lock2, iv_lock3, iv_lock4;
    Button game1, game2, game3, game4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiri);

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc3=new Intent(this, MyService3.class);
        final Intent svc2=new Intent(this, MyService2.class);
        final Intent svc4=new Intent(this, MyService4.class);

        iv_lock1 = findViewById(R.id.iv_lock1);
        iv_lock2 = findViewById(R.id.iv_lock2);
        iv_lock3 = findViewById(R.id.iv_lock3);
        iv_lock4 = findViewById(R.id.iv_lock4);

        game1 = (Button) findViewById(R.id.game1);
        game1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(kiri.this, ActivityGamesErupsi.class);
                startActivity(i);
                startService(svc2); //OR stopService(svc);
                stopService(svc); //OR stopService(svc);
            }
        });

        game2 = (Button) findViewById(R.id.game2);
        game2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(kiri.this, ActivityGamesTebakKata.class);
                startActivity(i);
                startService(svc4); //OR stopService(svc);
                stopService(svc); //OR stopService(svc);
            }
        });

        game3 = (Button) findViewById(R.id.game3);
        game3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(kiri.this, ActivityGamesBanjir.class);
                startActivity(i);
                startService(svc3); //OR stopService(svc);
                stopService(svc); //OR stopService(svc);
            }
        });

        game4 = (Button) findViewById(R.id.game4);
        game4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(kiri.this, ActivityGamesTebakGambar.class);
                startActivity(i);
                startService(svc4); //OR stopService(svc);
                stopService(svc); //OR stopService(svc);
            }
        });

        ImageView btn_back = (ImageView) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
            }
        });

        SharedPreferences mSettings = this.getSharedPreferences("KunciGames", Context.MODE_PRIVATE);
        kunciGame2 = mSettings.getBoolean("kuncigame2", false);
        kunciGame3 = mSettings.getBoolean("kuncigame3", false);
        kunciGame4 = mSettings.getBoolean("kuncigame4", false);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Intent svc=new Intent(this, MyService.class);
        startService(svc); //OR stopService(svc);

        if (kunciGame2){
            iv_lock2.setVisibility(View.INVISIBLE);
            game2.setEnabled(true);
        }
        if (kunciGame3){
            iv_lock3.setVisibility(View.INVISIBLE);
            game3.setEnabled(true);
        }
        if (kunciGame4){
            iv_lock4.setVisibility(View.INVISIBLE);
            game4.setEnabled(true);
        }

        if (!kunciGame){
            SharedPreferences mSettings = this.getSharedPreferences("KunciGames", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = mSettings.edit();
            editor.putBoolean("kuncigame2", kunciGame2);
            editor.putBoolean("kuncigame3", kunciGame3);
            editor.putBoolean("kuncigame4", kunciGame4);
            editor.apply();
            boolean statusGame4 = mSettings.getBoolean("kuncigame4", false);
            if (statusGame4){
                this.kunciGame = true;
            }
        }
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Intent svc=new Intent(this, MyService.class);
        PowerManager mPowerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);

        if (!mPowerManager.isScreenOn())
            if (svc!= null)
                stopService(svc);
    }
}
