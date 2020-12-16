package com.projectliburkuliah.sekolahamanbencana.topmenu.info;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.projectliburkuliah.sekolahamanbencana.R;
import com.projectliburkuliah.sekolahamanbencana.services.MyService;
import com.projectliburkuliah.sekolahamanbencana.services.MyService3;

public class sekolah_aman extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekolah_aman);
        final ImageView anton = (ImageView) findViewById(R.id.anton);
        final ImageView ayu = (ImageView) findViewById(R.id.ayu);
        final Button button = (Button) findViewById(R.id.button);
        button.setEnabled(false);
        final Button pilar1_btntext = (Button) findViewById(R.id.pilar1_btn);
        final Button pilar1_btntext2 = (Button) findViewById(R.id.pilar1_btn2);
        final Button btnpilar1_benar = (Button) findViewById(R.id.btnpilar1_benar);
        final Button btnpilar1_salah = (Button) findViewById(R.id.btnpilar1_salah);
        final Button pilar2_btn = (Button) findViewById(R.id.pilar2_btn);
        final Button pilar2_btn2 = (Button) findViewById(R.id.pilar2_btn2);
        final Button pilar3_btn = (Button) findViewById(R.id.pilar3_btn);
        final Button pilar3_btn2 = (Button) findViewById(R.id.pilar3_btn2);
        final Button btnpilar2_salah = (Button) findViewById(R.id.btnpilar2_salah);
        final Button btnpilar3_salah = (Button) findViewById(R.id.btnpilar3_salah);
        final Button btnpilar3_benar = (Button) findViewById(R.id.btnpilar3_benar);
        final Button btnpilar2_benar = (Button) findViewById(R.id.btnpilar2_benar);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final ImageView text0 = (ImageView) findViewById(R.id.text0);
        final ImageView imgtrue = (ImageView) findViewById(R.id.imgtrue);
        final ImageView imgfalse = (ImageView) findViewById(R.id.imgfalse);




        final Intent svc=new Intent(this, MyService.class);
        final Intent svc3=new Intent(this, MyService3.class);
        ImageView btn_back = (ImageView) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
                startService(svc); //OR stopService(svc);
                stopService(svc3); //OR stopService(svc);
            }
        });

        ImageView num0 = (ImageView) findViewById(R.id.num0);
        num0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.back_atas1);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.sekolah_aman_txt1);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                imgtrue.setImageResource(R.drawable.ic_check_black_24dp);
                imgfalse.setImageResource(R.drawable.ic_clear_black_24dp);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                button2.setVisibility(View.INVISIBLE);
                button2.setEnabled(false);
                button3.setVisibility(View.INVISIBLE);
                button3.setEnabled(false);
                text0.setEnabled(true);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                btnpilar1_benar.setEnabled(false);
                btnpilar1_benar.setVisibility(View.INVISIBLE);
                btnpilar1_salah.setEnabled(false);
                btnpilar1_salah.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                btnpilar2_benar.setEnabled(false);
                btnpilar2_benar.setVisibility(View.INVISIBLE);
                btnpilar2_salah.setEnabled(false);
                btnpilar2_salah.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                btnpilar3_benar.setEnabled(false);
                btnpilar3_benar.setVisibility(View.INVISIBLE);
                btnpilar3_salah.setEnabled(false);
                btnpilar3_salah.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num0_red);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num1);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num2);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num3);
            }
        });

        ImageView text00 = (ImageView) findViewById(R.id.text0);
        text00.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.text0);
                image.setImageResource(R.drawable.sekolah_aman_txt2);
                //sekolah aman
                button.setVisibility(View.VISIBLE);
                button.setEnabled(true);
                button2.setVisibility(View.INVISIBLE);
                button2.setEnabled(false);
                button3.setVisibility(View.INVISIBLE);
                button3.setEnabled(false);
                text0.setEnabled(false);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
            }
        });

        Button quis1 = (Button) findViewById(R.id.button);
        quis1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis1);
                anton.setVisibility(View.VISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis1_txt);
                imgtrue.setImageResource(R.drawable.ic_check_black_24dp);
                imgfalse.setImageResource(R.drawable.ic_clear_black_24dp);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                button2.setVisibility(View.VISIBLE);
                button2.setEnabled(true);
                button3.setVisibility(View.VISIBLE);
                button3.setEnabled(true);
                text0.setEnabled(false);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
            }
        });

        Button benar = (Button) findViewById(R.id.button2);
        benar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis1);
                anton.setVisibility(View.VISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis1_benar);
                imgtrue.setVisibility(View.VISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                button2.setVisibility(View.VISIBLE);
                button2.setEnabled(true);
                button3.setVisibility(View.VISIBLE);
                button3.setEnabled(true);
                text0.setEnabled(false);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundtrue);
                mediaPlayer.start();
            }
        });

        Button salah = (Button) findViewById(R.id.button3);
        salah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis1);
                anton.setVisibility(View.VISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis1_salah);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                button2.setVisibility(View.VISIBLE);
                button2.setEnabled(true);
                button3.setVisibility(View.VISIBLE);
                button3.setEnabled(true);
                text0.setEnabled(false);
                imgfalse.setVisibility(View.VISIBLE);
                imgtrue.setVisibility(View.INVISIBLE);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundfalse);
                mediaPlayer.start();
            }
        });


        ImageView num1 = (ImageView) findViewById(R.id.num1);
        num1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.pilar1_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar1_text1);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                imgtrue.setImageResource(R.drawable.ic_check_black_24dp);
                imgfalse.setImageResource(R.drawable.ic_clear_black_24dp);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                button2.setVisibility(View.INVISIBLE);
                button2.setEnabled(false);
                button3.setVisibility(View.INVISIBLE);
                button3.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(true);
                pilar1_btntext.setVisibility(View.VISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                btnpilar1_benar.setEnabled(false);
                btnpilar1_benar.setVisibility(View.INVISIBLE);
                btnpilar1_salah.setEnabled(false);
                btnpilar1_salah.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                btnpilar2_benar.setEnabled(false);
                btnpilar2_benar.setVisibility(View.INVISIBLE);
                btnpilar2_salah.setEnabled(false);
                btnpilar2_salah.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                btnpilar3_benar.setEnabled(false);
                btnpilar3_benar.setVisibility(View.INVISIBLE);
                btnpilar3_salah.setEnabled(false);
                btnpilar3_salah.setVisibility(View.INVISIBLE);

                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num0_2);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num1_red);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num2);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num3);
            }
        });

        Button btn_textpilar1 = (Button) findViewById(R.id.pilar1_btn);
        btn_textpilar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.pilar1_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar1_text2);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(true);
                pilar1_btntext2.setVisibility(View.VISIBLE);
                btnpilar1_benar.setEnabled(false);
                btnpilar1_benar.setVisibility(View.INVISIBLE);
                btnpilar1_salah.setEnabled(false);
                btnpilar1_salah.setVisibility(View.INVISIBLE);
            }
        });

        Button btn_textpilar2 = (Button) findViewById(R.id.pilar1_btn2);
        btn_textpilar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis2_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.VISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis_pilar1);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);

                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                btnpilar1_benar.setEnabled(true);
                btnpilar1_benar.setVisibility(View.VISIBLE);
                btnpilar1_salah.setEnabled(true);
                btnpilar1_salah.setVisibility(View.VISIBLE);
            }
        });

        Button benar_pilar1 = (Button) findViewById(R.id.btnpilar1_benar);
        benar_pilar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis2_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.VISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar1_benar);
                imgtrue.setVisibility(View.VISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                btnpilar1_benar.setEnabled(true);
                btnpilar1_benar.setVisibility(View.VISIBLE);
                btnpilar1_salah.setEnabled(true);
                btnpilar1_salah.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundtrue);
                mediaPlayer.start();
            }
        });
        Button salah_pilar1 = (Button) findViewById(R.id.btnpilar1_salah);
        salah_pilar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis2_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.VISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis2_salah);
                imgfalse.setVisibility(View.VISIBLE);
                imgtrue.setVisibility(View.INVISIBLE);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                btnpilar1_benar.setEnabled(true);
                btnpilar1_benar.setVisibility(View.VISIBLE);
                btnpilar1_salah.setEnabled(true);
                btnpilar1_salah.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundfalse);
                mediaPlayer.start();
            }
        });

        ImageView num2 = (ImageView) findViewById(R.id.num2);
        num2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.pilar2_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar2_txt1);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                imgtrue.setImageResource(R.drawable.ic_check_black_24dp);
                imgfalse.setImageResource(R.drawable.ic_clear_black_24dp);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                button2.setVisibility(View.INVISIBLE);
                button2.setEnabled(false);
                button3.setVisibility(View.INVISIBLE);
                button3.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                btnpilar1_benar.setEnabled(false);
                btnpilar1_benar.setVisibility(View.INVISIBLE);
                btnpilar1_salah.setEnabled(false);
                btnpilar1_salah.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(true);
                pilar2_btn.setVisibility(View.VISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                btnpilar2_benar.setEnabled(false);
                btnpilar2_benar.setVisibility(View.INVISIBLE);
                btnpilar2_salah.setEnabled(false);
                btnpilar2_salah.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                btnpilar3_benar.setEnabled(false);
                btnpilar3_benar.setVisibility(View.INVISIBLE);
                btnpilar3_salah.setEnabled(false);
                btnpilar3_salah.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num0_2);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num1);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num2_red);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num3);
            }
        });

        Button btn_pilar2 = (Button) findViewById(R.id.pilar2_btn);
        btn_pilar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.pilar2_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar2_text2);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(true);
                pilar2_btn2.setVisibility(View.VISIBLE);
                btnpilar2_benar.setEnabled(false);
                btnpilar2_benar.setVisibility(View.INVISIBLE);
                btnpilar2_salah.setEnabled(false);
                btnpilar2_salah.setVisibility(View.INVISIBLE);
            }
        });

        Button btn2_pilar2 = (Button) findViewById(R.id.pilar2_btn2);
        btn2_pilar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis3_back);
                anton.setVisibility(View.VISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis_pilar2);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                btnpilar2_benar.setEnabled(true);
                btnpilar2_benar.setVisibility(View.VISIBLE);
                btnpilar2_salah.setEnabled(true);
                btnpilar2_salah.setVisibility(View.VISIBLE);
            }
        });
        Button benar_pilar2 = (Button) findViewById(R.id.btnpilar2_benar);
        benar_pilar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis3_back);
                anton.setVisibility(View.VISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis3_salah);
                imgtrue.setVisibility(View.VISIBLE);
                imgtrue.setImageResource(R.drawable.ic_clear_black_24dp);
                imgfalse.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                btnpilar2_benar.setEnabled(true);
                btnpilar2_benar.setVisibility(View.VISIBLE);
                btnpilar2_salah.setEnabled(true);
                btnpilar2_salah.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundfalse);
                mediaPlayer.start();
            }
        });
        Button salah_pilar2 = (Button) findViewById(R.id.btnpilar2_salah);
        salah_pilar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis3_back);
                anton.setVisibility(View.VISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar2_benar);
                imgfalse.setVisibility(View.VISIBLE);
                imgfalse.setImageResource(R.drawable.ic_check_black_24dp);
                imgtrue.setVisibility(View.INVISIBLE);

                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                btnpilar2_benar.setEnabled(true);
                btnpilar2_benar.setVisibility(View.VISIBLE);
                btnpilar2_salah.setEnabled(true);
                btnpilar2_salah.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundtrue);
                mediaPlayer.start();
            }
        });


        ImageView num3 = (ImageView) findViewById(R.id.num3);
        num3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.pilar3_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar3_text1);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                imgtrue.setImageResource(R.drawable.ic_check_black_24dp);
                imgfalse.setImageResource(R.drawable.ic_clear_black_24dp);
                //sekolah aman
                button.setVisibility(View.INVISIBLE);
                button.setEnabled(false);
                button2.setVisibility(View.INVISIBLE);
                button2.setEnabled(false);
                button3.setVisibility(View.INVISIBLE);
                button3.setEnabled(false);
                text0.setEnabled(false);
                //pilar 1
                pilar1_btntext.setEnabled(false);
                pilar1_btntext.setVisibility(View.INVISIBLE);
                pilar1_btntext2.setEnabled(false);
                pilar1_btntext2.setVisibility(View.INVISIBLE);
                btnpilar1_benar.setEnabled(false);
                btnpilar1_benar.setVisibility(View.INVISIBLE);
                btnpilar1_salah.setEnabled(false);
                btnpilar1_salah.setVisibility(View.INVISIBLE);
                //pilar 2
                pilar2_btn.setEnabled(false);
                pilar2_btn.setVisibility(View.INVISIBLE);
                pilar2_btn2.setEnabled(false);
                pilar2_btn2.setVisibility(View.INVISIBLE);
                btnpilar2_benar.setEnabled(false);
                btnpilar2_benar.setVisibility(View.INVISIBLE);
                btnpilar2_salah.setEnabled(false);
                btnpilar2_salah.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(true);
                pilar3_btn.setVisibility(View.VISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                btnpilar3_benar.setEnabled(false);
                btnpilar3_benar.setVisibility(View.INVISIBLE);
                btnpilar3_salah.setEnabled(false);
                btnpilar3_salah.setVisibility(View.INVISIBLE);
                //main tombol
                ImageView num0 = (ImageView) findViewById(R.id.num0);
                num0.setImageResource(R.drawable.num0_2);
                ImageView num1 = (ImageView) findViewById(R.id.num1);
                num1.setImageResource(R.drawable.num1);
                ImageView num2 = (ImageView) findViewById(R.id.num2);
                num2.setImageResource(R.drawable.num2);
                ImageView num3 = (ImageView) findViewById(R.id.num3);
                num3.setImageResource(R.drawable.num3_red);
            }
        });

        Button btn_pilar3 = (Button) findViewById(R.id.pilar3_btn);
        btn_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.pilar3_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.INVISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.pilar3_text2);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(true);
                pilar3_btn2.setVisibility(View.VISIBLE);
                btnpilar3_benar.setEnabled(false);
                btnpilar3_benar.setVisibility(View.INVISIBLE);
                btnpilar3_salah.setEnabled(false);
                btnpilar3_salah.setVisibility(View.INVISIBLE);
            }
        });

        Button btn2_pilar3 = (Button) findViewById(R.id.pilar3_btn2);
        btn2_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis4_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.VISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis_pilar3);
                imgtrue.setVisibility(View.INVISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);

                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                btnpilar3_benar.setEnabled(true);
                btnpilar3_benar.setVisibility(View.VISIBLE);
                btnpilar3_salah.setEnabled(true);
                btnpilar3_salah.setVisibility(View.VISIBLE);
            }
        });
        Button benar_pilar3 = (Button) findViewById(R.id.btnpilar3_benar);
        benar_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis4_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.VISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis4_benar);
                imgtrue.setVisibility(View.VISIBLE);
                imgfalse.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                btnpilar3_benar.setEnabled(true);
                btnpilar3_benar.setVisibility(View.VISIBLE);
                btnpilar3_salah.setEnabled(true);
                btnpilar3_salah.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundtrue);
                mediaPlayer.start();
            }
        });
        Button salah_pilar3 = (Button) findViewById(R.id.btnpilar3_salah);
        salah_pilar3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.imageView6);
                image.setImageResource(R.drawable.quis4_back);
                anton.setVisibility(View.INVISIBLE);
                ayu.setVisibility(View.VISIBLE);
                ImageView desc = (ImageView) findViewById(R.id.text0);
                desc.setImageResource(R.drawable.quis4_salah);;
                imgfalse.setVisibility(View.VISIBLE);
                imgtrue.setVisibility(View.INVISIBLE);
                //pilar 3
                pilar3_btn.setEnabled(false);
                pilar3_btn.setVisibility(View.INVISIBLE);
                pilar3_btn2.setEnabled(false);
                pilar3_btn2.setVisibility(View.INVISIBLE);
                btnpilar3_benar.setEnabled(true);
                btnpilar3_benar.setVisibility(View.VISIBLE);
                btnpilar3_salah.setEnabled(true);
                btnpilar3_salah.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayer= MediaPlayer.create(sekolah_aman.this,R.raw.backsoundfalse);
                mediaPlayer.start();
            }
        });

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
