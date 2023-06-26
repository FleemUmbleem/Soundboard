package com.home.andy.calebsounboard2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button lol1Btn;
    private Button lol2Btn;
    private Button lol3Btn;
    private Button lol5Btn;
    private Button lelBtn;
    private Button yoloBtn;
    private Button spazBtn;
    private Button nubBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lol1Btn = findViewById(R.id.btnLol1);
        lol2Btn = findViewById(R.id.btnLol2);
        lol3Btn = findViewById(R.id.btnLol3);
        lol5Btn = findViewById(R.id.btnLol5);
        lelBtn = findViewById(R.id.btnLel);
        yoloBtn = findViewById(R.id.btnYolo);
        spazBtn = findViewById(R.id.btnSpaz);
        nubBtn = findViewById(R.id.btnNub);

        lol1Btn.setOnClickListener(this);
        lol2Btn.setOnClickListener(this);
        lol3Btn.setOnClickListener(this);
        lol5Btn.setOnClickListener(this);
        lelBtn.setOnClickListener(this);
        yoloBtn.setOnClickListener(this);
        spazBtn.setOnClickListener(this);
        nubBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLol1:

                final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.caleblol1);
                mp1.start();
                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp1) {
                        mp1.release();
                    }
                });

                break;

            case R.id.btnLol2:

                final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.caleblol2);
                mp2.start();
                mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp2) {
                        mp2.release();
                    }
                });

                break;

            case R.id.btnLol3:

                final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.caleblol3);
                mp3.start();
                mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp3) {
                        mp3.release();
                    }
                });

                break;

            case R.id.btnLol5:

                final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.caleblol5);
                mp4.start();
                mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp4) {
                        mp4.release();
                    }
                });

                break;

            case R.id.btnSpaz:

                final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.spaz);
                mp5.start();
                mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp5) {
                        mp5.release();
                    }
                });

                break;

            case R.id.btnLel:

                final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.lelelelelelelel);
                mp6.start();
                mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp6) {
                        mp6.release();
                    }
                });

                break;

            case R.id.btnYolo:

                final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.yolo);
                mp7.start();
                mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp7) {
                        mp7.release();
                    }
                });

                break;

            case R.id.btnNub:

                final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.nub);
                mp8.start();
                mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp8) {
                        mp8.release();
                    }
                });

                break;
        }
    }
}

