package com.projectliburkuliah.sekolahamanbencana.rightmenu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.rightmenu.news.ils_erupsi;
import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService2;

public class kanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanan);

        final Intent svc=new Intent(this, MyService.class);
        final Intent svc2=new Intent(this, MyService2.class);

        Button pntu = (Button) findViewById(R.id.pntu);
        pntu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(kanan.this, ils_erupsi.class);
                startActivity(i);

                stopService(svc); //OR stopService(svc);
                startService(svc2); //OR stopService(svc);
            }
        });

        Button bttn1 =(Button)findViewById(R.id.btn_banjir);
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/search?q=sekolah+banjir&rlz=1C1CHBF_enID839ID839&oq=sekolah+banjir&aqs=chrome..69i57.12392j0j7&sourceid=chrome&ie=UTF-8";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Button bttn2 =(Button)findViewById(R.id.btn_erupsi);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/search?safe=strict&rlz=1C1CHBF_enID839ID839&ei=YJRwXdafJIjVvAT_26ngCQ&q=erupsi+ganggu+aktivitas+sekolah&oq=erupsi+ganggu+aktivitas+sekolah&gs_l=psy-ab.3..33i160.70339.85898..86309...0.0..0.105.2697.27j4......0....1..gws-wiz.......35i39j0i131j0j0i67j0i203j0i22i30j0i22i10i30j0i8i13i30j33i21.CV3CUWw4_5o&ved=0ahUKEwjWz7ug8bjkAhWIKo8KHf9tCpwQ4dUDCAs&uact=5";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Button bttn3 =(Button)findViewById(R.id.btn_gempa);
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/search?safe=strict&rlz=1C1CHBF_enID839ID839&ei=PZVwXfu9HMTfz7sP4O6IiAo&q=gempa+saat+sekolah&oq=gempa+saat+sekolah&gs_l=psy-ab.3..35i39j0i8i30l2.2630.2917..3367...0.0..0.94.180.2......0....1..gws-wiz.Q7sQcbzd77A&ved=0ahUKEwi70OSJ8rjkAhXE73MBHWA3AqEQ4dUDCAs&uact=5";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
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
