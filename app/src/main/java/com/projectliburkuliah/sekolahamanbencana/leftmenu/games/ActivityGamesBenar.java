package com.projectliburkuliah.sekolahamanbencana.leftmenu.games;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService4;
import com.projectliburkuliah.sekolahamanbencana.R;

public class ActivityGamesBenar extends AppCompatActivity implements View.OnClickListener {
    Button btn_back;
    ImageView cl_benar;
    ConstraintLayout cl_benar2;
    public static final String GAMES = "game";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_benar);

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc4=new Intent(this, MyService4.class);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        cl_benar = findViewById(R.id.imageView9);
        cl_benar2 = findViewById(R.id.cl_benar);


        String games = getIntent().getStringExtra(GAMES);
        pilihanGame(games);

        Button selesai = (Button) findViewById(R.id.button4);
        selesai.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
                startService(svc); //OR stopService(svc);
                stopService(svc4); //OR stopService(svc);
            }
        });
    }

    private void pilihanGame(String games) {
        switch (games){
            case "Gempa":
                cl_benar.setImageResource(R.drawable.game2_jawaban);
                break;
            case "Longsor":
                cl_benar.setImageResource(R.drawable.game4_benar);
                cl_benar2.setBackgroundColor(Color.WHITE);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back:
                finish();
                break;
        }
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
