package com.projectliburkuliah.sekolahamanbencana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        final int screenDisplay = 3000;
        Thread welcomeThread = new Thread() {

            int wait = 0;

            @Override
            public void run(){
                try{
                    super.run();
                    while(wait <screenDisplay){
                        sleep(100);
                        wait+=100;
                    }
                }catch (Exception e){
                    System.out.print("Error"+e);
                }finally {
                    Intent intent = new Intent(Opening.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };
        welcomeThread.start();
    }
}
