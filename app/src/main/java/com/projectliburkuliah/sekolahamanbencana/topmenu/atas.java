package com.projectliburkuliah.sekolahamanbencana.topmenu;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.topmenu.info.bencana;
import com.projectliburkuliah.sekolahamanbencana.topmenu.info.sekolah_aman;
import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService3;

public class atas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atas);

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc3=new Intent(this, MyService3.class);

        Button btn_kanan = (Button) findViewById(R.id.btn_sekolah);
        btn_kanan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(atas.this, sekolah_aman.class);
                startActivity(i);

                stopService(svc); //OR stopService(svc);
            }
        });

        Button btn_bencana = (Button) findViewById(R.id.btn_bencana);
        btn_bencana.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(atas.this, bencana.class);
                startActivity(i);

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
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent svc=new Intent(this, MyService.class);
        startService(svc); //OR stopService(svc);
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
