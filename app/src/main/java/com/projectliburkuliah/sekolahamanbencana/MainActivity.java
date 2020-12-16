package com.projectliburkuliah.sekolahamanbencana;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.projectliburkuliah.sekolahamanbencana.services.MyService;

public class MainActivity extends AppCompatActivity {

    Intent svc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn_kanan = (ImageButton) findViewById(R.id.btn_kanan);

        btn_kanan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent kanan = new Intent(MainActivity.this, com.projectliburkuliah.sekolahamanbencana.rightmenu.kanan.class);
                startActivity(kanan);
            }
        });

        ImageButton btn_kiri = (ImageButton) findViewById(R.id.btn_kiri);
        btn_kiri.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent kiri = new Intent(MainActivity.this, com.projectliburkuliah.sekolahamanbencana.leftmenu.kiri.class);
                startActivity(kiri);
            }
        });

        ImageButton btn_atas = (ImageButton) findViewById(R.id.btn_atas);
        btn_atas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent atas = new Intent(MainActivity.this, com.projectliburkuliah.sekolahamanbencana.topmenu.atas.class);
                startActivity(atas);

            }
        });

        svc=new Intent(this, MyService.class);
        startService(svc); //OR stopService(svc);

    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            if(svc != null){
                stopService(svc);
            }


        }
    }

    @Override
    public void onPause()
    {
        super.onPause();
        svc=new Intent(this, MyService.class);
        PowerManager mPowerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);

        if (!mPowerManager.isScreenOn())
            if (svc!= null)
                stopService(svc);
    }

    @Override
    protected void onResume() {
        super.onResume();
        startService(svc); //OR stopService(svc);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Intent svc=new Intent(this, MyService.class);

        finish();
        stopService(svc); //OR stopService(svc);
    }

}
