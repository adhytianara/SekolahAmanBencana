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

public class ils_erupsi extends AppCompatActivity {
    Intent svc2,svc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ils_erupsi);

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc2=new Intent(this, MyService2.class);

        ImageView txt_kacamata = (ImageView) findViewById(R.id.kacamata_btn);
        txt_kacamata.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.txt_desc);
                image.setImageResource(R.drawable.kacamata_txt);
                ImageView image2 = (ImageView) findViewById(R.id.kacamata_btn);
                image2.setImageResource(R.drawable.tbl_tny_bl);
                ImageView image3 = (ImageView) findViewById(R.id.erupsi_btn);
                image3.setImageResource(R.drawable.tbl_tny);
                ImageView image4 = (ImageView) findViewById(R.id.masker_btn);
                image4.setImageResource(R.drawable.tbl_tny);
                ImageView image5 = (ImageView) findViewById(R.id.tas_btn);
                image5.setImageResource(R.drawable.tbl_tny);
                image.setVisibility(View.VISIBLE);
            }
        });

        ImageView masker_btn = (ImageView) findViewById(R.id.masker_btn);
        masker_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.txt_desc);
                image.setImageResource(R.drawable.masker_txt);
                ImageView image2 = (ImageView) findViewById(R.id.masker_btn);
                image2.setImageResource(R.drawable.tbl_tny_bl);
                ImageView image3 = (ImageView) findViewById(R.id.erupsi_btn);
                image3.setImageResource(R.drawable.tbl_tny);
                ImageView image4 = (ImageView) findViewById(R.id.kacamata_btn);
                image4.setImageResource(R.drawable.tbl_tny);
                ImageView image5 = (ImageView) findViewById(R.id.tas_btn);
                image5.setImageResource(R.drawable.tbl_tny);
                image.setVisibility(View.VISIBLE);
            }
        });

        ImageView tas_btn = (ImageView) findViewById(R.id.tas_btn);
        tas_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.txt_desc);
                image.setImageResource(R.drawable.tas_txt);
                ImageView image2 = (ImageView) findViewById(R.id.tas_btn);
                image2.setImageResource(R.drawable.tbl_tny_bl);
                ImageView image3 = (ImageView) findViewById(R.id.erupsi_btn);
                image3.setImageResource(R.drawable.tbl_tny);
                ImageView image4 = (ImageView) findViewById(R.id.masker_btn);
                image4.setImageResource(R.drawable.tbl_tny);
                ImageView image5 = (ImageView) findViewById(R.id.kacamata_btn);
                image5.setImageResource(R.drawable.tbl_tny);
                image.setVisibility(View.VISIBLE);
            }
        });

        ImageView erupsi_btn = (ImageView) findViewById(R.id.erupsi_btn);
        erupsi_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.txt_desc);
                image.setImageResource(R.drawable.erupsi_txt);
                ImageView image2 = (ImageView) findViewById(R.id.erupsi_btn);
                image2.setImageResource(R.drawable.tbl_tny_bl);
                ImageView image3 = (ImageView) findViewById(R.id.kacamata_btn);
                image3.setImageResource(R.drawable.tbl_tny);
                ImageView image4 = (ImageView) findViewById(R.id.masker_btn);
                image4.setImageResource(R.drawable.tbl_tny);
                ImageView image5 = (ImageView) findViewById(R.id.tas_btn);
                image5.setImageResource(R.drawable.tbl_tny);
                image.setVisibility(View.VISIBLE);
            }
        });

        ImageView btn_right = (ImageView) findViewById(R.id.btn_right);
        btn_right.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(ils_erupsi.this, ils_gempa.class);
                finish();
                startActivity(i);
            }
        });

        ImageView btn_left = (ImageView) findViewById(R.id.btn_left);
        btn_left.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(ils_erupsi.this, ils_banjir.class);
                finish();
                startActivity(i);
            }
        });

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
