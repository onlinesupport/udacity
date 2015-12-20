package com.n9xkun.iziroi.happywedding;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class WeddingActivity extends AppCompatActivity {

    private MediaPlayer player;
    private ImageButton btnSound;
    private boolean flagSound = true;
    private int length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //parse xml layout -> java -> render
        setContentView(R.layout.activity_wedding);

        //init player
        player = MediaPlayer.create(WeddingActivity.this, R.raw.vonguoita);

        //bind imagebutton to variable
        btnSound = (ImageButton) findViewById(R.id.btnSound);
    }

    @Override
    protected void onStart() {
        super.onStart();
        player.setLooping(true); //restart playback end reached
        player.start();
    }

    public void playPause(View v){
        if(flagSound){ //state = playing
            player.pause();
            btnSound.setImageResource(R.drawable.soundoff);             //change image
            flagSound = false; //change flag
            length = player.getCurrentPosition();
        } else { //state = pause
            player.seekTo(length);
            player.start();

            btnSound.setImageResource(R.drawable.soundon);             //change image
            flagSound = true; //change flag
        }
    }
}
