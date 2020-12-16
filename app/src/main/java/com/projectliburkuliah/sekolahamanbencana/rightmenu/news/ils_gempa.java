package com.projectliburkuliah.sekolahamanbencana.rightmenu.news;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService2;

public class ils_gempa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ils_gempa);

        ImageView kaca_btn = (ImageView) findViewById(R.id.btn_kaca);
        kaca_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.txt_desc);
                image.setImageResource(R.drawable.txt_kaca);
                ImageView image2 = (ImageView) findViewById(R.id.btn_kaca);
                image2.setImageResource(R.drawable.tbl_tny_bl);
                ImageView image3 = (ImageView) findViewById(R.id.btn_meja);
                image3.setImageResource(R.drawable.tbl_tny);
                ImageView image4 = (ImageView) findViewById(R.id.btn_lari);
                image4.setImageResource(R.drawable.tbl_tny);
                image.setVisibility(View.VISIBLE);
            }
        });

        ImageView btn_meja = (ImageView) findViewById(R.id.btn_meja);
        btn_meja.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.txt_desc);
                image.setImageResource(R.drawable.txt_meja);
                ImageView image2 = (ImageView) findViewById(R.id.btn_meja);
                image2.setImageResource(R.drawable.tbl_tny_bl);
                ImageView image3 = (ImageView) findViewById(R.id.btn_kaca);
                image3.setImageResource(R.drawable.tbl_tny);
                ImageView image4 = (ImageView) findViewById(R.id.btn_lari);
                image4.setImageResource(R.drawable.tbl_tny);
                image.setVisibility(View.VISIBLE);
            }
        });

        ImageView btn_lari = (ImageView) findViewById(R.id.btn_lari);
        btn_lari.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.txt_desc);
                image.setImageResource(R.drawable.txt_keluar);
                ImageView image2 = (ImageView) findViewById(R.id.btn_lari);
                image2.setImageResource(R.drawable.tbl_tny_bl);
                ImageView image3 = (ImageView) findViewById(R.id.btn_kaca);
                image3.setImageResource(R.drawable.tbl_tny);
                ImageView image4 = (ImageView) findViewById(R.id.btn_meja);
                image4.setImageResource(R.drawable.tbl_tny);
                image.setVisibility(View.VISIBLE);
            }
        });

        ImageView btn_right = (ImageView) findViewById(R.id.btn_right);
        btn_right.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(ils_gempa.this, ils_banjir.class);
                finish();
                startActivity(i);
            }
        });

        ImageView btn_left = (ImageView) findViewById(R.id.btn_left);
        btn_left.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(ils_gempa.this, ils_erupsi.class);
                finish();
                startActivity(i);
            }
        });


        final Intent svc=new Intent(this, MyService.class);
        final Intent svc2=new Intent(this, MyService2.class);
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
