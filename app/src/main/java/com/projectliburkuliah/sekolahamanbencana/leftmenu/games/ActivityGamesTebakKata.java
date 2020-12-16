package com.projectliburkuliah.sekolahamanbencana.leftmenu.games;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService4;
import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.leftmenu.kiri;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityGamesTebakKata extends AppCompatActivity implements View.OnClickListener {
    public static final String jawaban = "SKALARICHTER";
    private int counter = 0;
    private Button AA,BB,CC,DD,EE,FF,GG,HH,II,JJ,KK,LL,MM,NN,OO,PP,QQ,RR,SS,TT,UU,VV,WW,XX,YY,ZZ, btn_back;
    private TextView jw_S, jw_K, jw_A, jw_L, jw_A2, jw_R, jw_I, jw_C, jw_H, jw_T, jw_E, jw_R2;
    private ImageView benar,nyawa1,nyawa2,nyawa3;
    TextView nyawa;
    int nyawabenar = 3;
    private ArrayList<Button> al_button;
    private ArrayList<TextView> al_jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_tebak_kata);


        final Intent svc=new Intent(this, MyService.class);
        final Intent svc4=new Intent(this, MyService4.class);

        nyawa = findViewById(R.id.nyawa);
        nyawa.setText(String.valueOf(nyawabenar));
        ImageView btn_back = (ImageView) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
                startService(svc); //OR stopService(svc);
                stopService(svc4); //OR stopService(svc);
            }
        });

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        benar = findViewById(R.id.benar);
        benar.setVisibility(View.INVISIBLE);

        AA = findViewById(R.id.A);          BB = findViewById(R.id.B);          CC = findViewById(R.id.C);
        DD = findViewById(R.id.D);          EE = findViewById(R.id.E);          FF = findViewById(R.id.F);
        GG = findViewById(R.id.G);          HH = findViewById(R.id.H);          II = findViewById(R.id.I);
        JJ = findViewById(R.id.J);          KK = findViewById(R.id.K);          LL = findViewById(R.id.L);
        MM = findViewById(R.id.M);          NN = findViewById(R.id.N);          OO = findViewById(R.id.O);
        PP = findViewById(R.id.P);          QQ = findViewById(R.id.Q);          RR = findViewById(R.id.R);
        SS = findViewById(R.id.S);          TT = findViewById(R.id.T);          UU = findViewById(R.id.U);
        VV = findViewById(R.id.V);          WW = findViewById(R.id.W);          XX = findViewById(R.id.X);
        YY = findViewById(R.id.Y);          ZZ = findViewById(R.id.Z);

        jw_S = findViewById(R.id.jw_S);     jw_K = findViewById(R.id.jw_K);     jw_A = findViewById(R.id.jw_A);
        jw_L = findViewById(R.id.jw_L);     jw_A2 = findViewById(R.id.jw_A2);   jw_R = findViewById(R.id.jw_R);
        jw_I = findViewById(R.id.jw_I);     jw_C = findViewById(R.id.jw_C);     jw_H = findViewById(R.id.jw_H);
        jw_T = findViewById(R.id.jw_T);     jw_E = findViewById(R.id.jw_E);     jw_R2 = findViewById(R.id.jw_R2);

        al_button = new ArrayList<>(Arrays.asList(AA,BB,CC,DD,EE,FF,GG,HH,II,JJ,KK,LL,MM,NN,OO,PP,QQ,RR,SS,TT,UU,VV,WW,XX,YY,ZZ));
        al_jawaban = new ArrayList<>(Arrays.asList(jw_S, jw_K, jw_A, jw_L, jw_A2, jw_R, jw_I, jw_C, jw_H, jw_T, jw_E, jw_R2));
        for (Button a: al_button){
            a.setOnClickListener(this);
        }

        nyawa1 = findViewById(R.id.nyawa1);nyawa2 = findViewById(R.id.nyawa2); nyawa3 = findViewById(R.id.nyawa3);

    }

    @Override
    public void onClick(View v) {
        String huruf = ((Button) v).getText().toString();
        if (v.getId() == R.id.btn_back){
            finish();
            return;
        }
        if (jawaban.contains(huruf)){
            al_button.get(((int)huruf.charAt(0))-65).setBackgroundResource(R.drawable.game2_buttontrue);
            al_button.get(((int)huruf.charAt(0))-65).setTextColor(Color.parseColor("#bbbbbb"));
            al_button.get(((int)huruf.charAt(0))-65).setEnabled(false);
            int index = jawaban.indexOf(huruf);
            al_jawaban.get(index).setText(huruf);

            counter++;
            if (huruf.equals("A") || huruf.equals("R")){
                index = jawaban.indexOf(huruf, index+1);
                al_jawaban.get(index).setText(huruf);
                counter++;
            }
        } else {
            al_button.get(((int)huruf.charAt(0))-65).setBackgroundResource(R.drawable.game2_buttonfalse);
            al_button.get(((int)huruf.charAt(0))-65).setTextColor(Color.parseColor("#bbbbbb"));
            jawabSalah();
        }
        if (counter == 12){
            for (Button a: al_button){
                a.setEnabled(false);
            }
            kiri. kunciGame3= true;
            jawabanBenar();
        }
    }

    private void jawabanBenar() {
        benar.setImageResource(R.drawable.ic_check_black_24dp);
        benar.setVisibility(View.VISIBLE);
        MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesTebakKata.this,R.raw.backsoundtrue);
        mediaPlayer.start();
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
                    Intent benarIntent = new Intent(ActivityGamesTebakKata.this, ActivityGamesBenar.class);
                    benarIntent.putExtra(ActivityGamesBenar.GAMES, "Gempa");
                    startActivity(benarIntent);
                    finish();

                }
            }
        };
        welcomeThread.start();
    }

    private void jawabSalah(){
        final Intent svc=new Intent(this, MyService.class);
        final Intent svc4=new Intent(this, MyService4.class);
        nyawabenar--;
        nyawa.setText(String.valueOf(nyawabenar));
        MediaPlayer mediaPlayer= MediaPlayer.create(ActivityGamesTebakKata.this,R.raw.backsoundfalse);
        mediaPlayer.start();
        if(nyawabenar==2){
            nyawa1.setVisibility(View.INVISIBLE);
        } if(nyawabenar==1){
            nyawa2.setVisibility(View.INVISIBLE);
        } if(nyawabenar==3){
        nyawa3.setVisibility(View.INVISIBLE);}


        if (nyawabenar==0){
            finish();
            startService(svc); //OR stopService(svc);
            stopService(svc4); //OR stopService(svc);
            Toast.makeText(this, "Kesempatan kamu habis", Toast.LENGTH_SHORT).show();
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
