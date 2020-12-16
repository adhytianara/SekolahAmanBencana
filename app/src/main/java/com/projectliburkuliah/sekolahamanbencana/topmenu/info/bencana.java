package com.projectliburkuliah.sekolahamanbencana.topmenu.info;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService3;

public class bencana extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Intent svc3=new Intent(this, MyService3.class);
        setContentView(R.layout.activity_bencana);
        final Button button = (Button) findViewById(R.id.button);
        final Button buttonkedua = (Button) findViewById(R.id.buttonkedua);
        final Button buttonketiga = (Button) findViewById(R.id.buttonketiga);
        final Button buttonkeempat = (Button) findViewById(R.id.buttonkeempat);
        final Button buttonkelima = (Button) findViewById(R.id.buttonkelima);
        final Button pilar1_btntext = (Button) findViewById(R.id.pilar1_btn);
        final Button pilar1_btntext2 = (Button) findViewById(R.id.pilar1_btn2);
        final Button pilar1_btntext3 = (Button) findViewById(R.id.pilar1_btn3);
        final Button pilar1_btntext4 = (Button) findViewById(R.id.pilar1_btn4);
        final Button pilar1_btntext5 = (Button) findViewById(R.id.pilar1_btn5);
        final Button pilar1_btntext6 = (Button) findViewById(R.id.pilar1_btn6);
        final Button pilar2_btn = (Button) findViewById(R.id.pilar2_btn);
        final Button pilar2_btn2 = (Button) findViewById(R.id.pilar2_btn2);
        final Button pilar2_btn3 = (Button) findViewById(R.id.pilar2_btn3);
        final Button pilar2_btn4 = (Button) findViewById(R.id.pilar2_btn4);
        final Button pilar2_btn5 = (Button) findViewById(R.id.pilar2_btn5);
        final Button pilar2_btn6 = (Button) findViewById(R.id.pilar2_btn6);
        final Button pilar3_btn = (Button) findViewById(R.id.pilar3_btn);
        final Button pilar3_btn2 = (Button) findViewById(R.id.pilar3_btn2);
        final Button pilar3_btn3 = (Button) findViewById(R.id.pilar3_btn3);
        final Button pilar3_btn4 = (Button) findViewById(R.id.pilar3_btn4);
        final Button pilar3_btn5 = (Button) findViewById(R.id.pilar3_btn5);
        final ImageView text0 = (ImageView) findViewById(R.id.text0);

        ImageView btn_back = (ImageView) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
                stopService(svc3); //OR stopService(svc);
            }
        });


        ImageView num0 = (ImageView) findViewById(R.id.num0);
        num0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_erupsi);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.erupsi_txt1);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(true);

                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);


                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);

                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi_red);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });

        ImageView text00 = (ImageView) findViewById(R.id.text0);
        text00.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ImageView image = (ImageView) findViewById(R.id.text0);
                image.setImageResource(R.drawable.erupsi_txt3);
                //sekolah aman
                button.setVisibility(View.VISIBLE);
                button.setEnabled(true);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
               
            }
        });
        Button buttonke3 = (Button) findViewById(R.id.button);
        buttonke3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_erupsi);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.erupsi_txt4);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.VISIBLE);
                buttonkedua.setEnabled(true);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);

                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);


                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi_red);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button buttonke4 = (Button) findViewById(R.id.buttonkedua);
        buttonke4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_erupsi);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.erupsi_txt5);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.VISIBLE);
                buttonketiga.setEnabled(true);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol

                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi_red);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });

        Button buttonke5 = (Button) findViewById(R.id.buttonketiga);
        buttonke5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_erupsi);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.erupsi_txt6);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.VISIBLE);
                buttonkeempat.setEnabled(true);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi_red);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button buttonke6 = (Button) findViewById(R.id.buttonkeempat);
        buttonke6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_erupsi);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.erupsi_txt7);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.VISIBLE);
                buttonkelima.setEnabled(true);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi_red);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button buttonketujuh = (Button) findViewById(R.id.buttonkelima);
        buttonketujuh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_erupsi);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.erupsi_txt8);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi_red);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });

        ImageView num1 = (ImageView) findViewById(R.id.num1);
        num1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_banjir);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.banjir_txt1);

                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(true);
                pilar1_btntext.setVisibility(View.VISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });

        Button btn_textpilar1 = (Button) findViewById(R.id.pilar1_btn);
        btn_textpilar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_banjir);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.banjir_txt2);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(true);
                pilar1_btntext2.setVisibility(View.VISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_textpilar2 = (Button) findViewById(R.id.pilar1_btn2);
        btn_textpilar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_banjir);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.banjir_txt3);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(true);
                pilar1_btntext3.setVisibility(View.VISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_textpilar3 = (Button) findViewById(R.id.pilar1_btn3);
        btn_textpilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_banjir);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.banjir_txt4);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(true);
                pilar1_btntext4.setVisibility(View.VISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_textpilar4 = (Button) findViewById(R.id.pilar1_btn4);
        btn_textpilar4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_banjir);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.banjir_txt5);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(true);
                pilar1_btntext5.setVisibility(View.VISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_textpilar5 = (Button) findViewById(R.id.pilar1_btn5);
        btn_textpilar5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_banjir);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.banjir_txt6);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(true);
                pilar1_btntext6.setVisibility(View.VISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol

                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_textpilar6 = (Button) findViewById(R.id.pilar1_btn6);
        btn_textpilar6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_banjir);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.banjir_txt7);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol

                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });

        ImageView num2 = (ImageView) findViewById(R.id.num2);
        num2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_gempa);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.gempa_txt1);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(true);
                pilar2_btn.setVisibility(View.VISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol

                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });

        Button btn_pilar2 = (Button) findViewById(R.id.pilar2_btn);
        btn_pilar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_gempa);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.gempa_txt2);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(true);
                pilar2_btn2.setVisibility(View.VISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);

                //main tombol

                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_pilar3 = (Button) findViewById(R.id.pilar2_btn2);
        btn_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_gempa);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.gempa_txt3);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(true);
                pilar2_btn3.setVisibility(View.VISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol

                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_pilar4 = (Button) findViewById(R.id.pilar2_btn3);
        btn_pilar4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_gempa);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.gempa_txt4);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(true);
                pilar2_btn4.setVisibility(View.VISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_pilar5 = (Button) findViewById(R.id.pilar2_btn4);
        btn_pilar5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_gempa);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.gempa_txt5);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.VISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.VISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(true);
                pilar2_btn5.setVisibility(View.VISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_pilar6 = (Button) findViewById(R.id.pilar2_btn5);
        btn_pilar6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_gempa);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.gempa_txt6);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(true);
                pilar2_btn6.setVisibility(View.VISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        Button btn_pilar7 = (Button) findViewById(R.id.pilar2_btn6);
        btn_pilar7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.back_gempa);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.gempa_txt7);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor);
            }
        });
        ImageView num3 = (ImageView) findViewById(R.id.num3);
        num3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.longsor_back);
                //kurang file drawable longsor

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.longsor_txt1);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(true);
                pilar3_btn.setVisibility(View.VISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor_red);
            }
        });

        Button btnn_pilar3 = (Button) findViewById(R.id.pilar3_btn);
        btnn_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.longsor_back);
                //kurang file drawable longsor
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.longsor_txt2);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(true);
                pilar3_btn2.setVisibility(View.VISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor_red);
            }
        });
        Button btnn2_pilar3 = (Button) findViewById(R.id.pilar3_btn2);
        btnn2_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.longsor_back);

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.longsor_txt3);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(true);
                pilar3_btn3.setVisibility(View.VISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor_red);
            }
        });
        Button btnn3_pilar3 = (Button) findViewById(R.id.pilar3_btn3);
        btnn3_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.longsor_back);
                //kurang file drawable longsor

                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.longsor_txt4);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(true);
                pilar3_btn4.setVisibility(View.VISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor_red);
            }
        });
        Button btnn4_pilar3 = (Button) findViewById(R.id.pilar3_btn4);
        btnn4_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.longsor_back);
                //kurang file drawable longsor
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.longsor_txt5);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.VISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.VISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(true);
                pilar3_btn5.setVisibility(View.VISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor_red);
            }
        });
        Button btnn5_pilar3 = (Button) findViewById(R.id.pilar3_btn5);
        btnn5_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView8);
                image.setImageResource(R.drawable.longsor_back);
                //kurang file drawable longsor
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.longsor_txt6);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                buttonkedua.setVisibility(View.INVISIBLE);
                buttonkedua.setEnabled(false);
                buttonketiga.setVisibility(View.INVISIBLE);
                buttonketiga.setEnabled(false);
                buttonkeempat.setVisibility(View.INVISIBLE);
                buttonkeempat.setEnabled(false);
                buttonkelima.setVisibility(View.INVISIBLE);
                buttonkelima.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                pilar1_btntext3.setEnabled(false);
                pilar1_btntext3.setVisibility(View.INVISIBLE);
                pilar1_btntext4.setEnabled(false);
                pilar1_btntext4.setVisibility(View.INVISIBLE);
                pilar1_btntext5.setEnabled(false);
                pilar1_btntext5.setVisibility(View.INVISIBLE);
                pilar1_btntext6.setEnabled(false);
                pilar1_btntext6.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                pilar2_btn3.setEnabled(false);
                pilar2_btn3.setVisibility(View.INVISIBLE);
                pilar2_btn4.setEnabled(false);
                pilar2_btn4.setVisibility(View.INVISIBLE);
                pilar2_btn5.setEnabled(false);
                pilar2_btn5.setVisibility(View.INVISIBLE);
                pilar2_btn6.setEnabled(false);
                pilar2_btn6.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                pilar3_btn3.setEnabled(false);
                pilar3_btn3.setVisibility(View.INVISIBLE);
                pilar3_btn4.setEnabled(false);
                pilar3_btn4.setVisibility(View.INVISIBLE);
                pilar3_btn5.setEnabled(false);
                pilar3_btn5.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num_erupsi);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num_banjir);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num_gempa);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num_longsor_red);
            }
        });



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
    public void onBackPressed() {
        super.onBackPressed();
        final Intent svc=new Intent(this, MyService.class);
        final Intent svc3=new Intent(this, MyService3.class);

        finish();
        startService(svc); //OR stopService(svc);
        stopService(svc3); //OR stopService(svc);
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
