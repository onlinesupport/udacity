package vn.techmaster.happywedding;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    private MediaPlayer player;
    private ImageButton btnSound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //load layout config from activity_main.xml -> inflate
        //1-load config
        //2-parse, convert object
        //3-render
        setContentView(R.layout.activity_main);

        //init UI
        btnSound = (ImageButton) findViewById(R.id.btnSound);


        //init music
        player = MediaPlayer.create(MainActivity.this, R.raw.vonguoita);
    }

    @Override
    protected void onStart() {
        super.onStart();
        player.start();
    }

    boolean flagSoundOn = true;
    private int length;

    public void toggleSound(View view) {
        Toast.makeText(this, "Click on Sound", Toast.LENGTH_SHORT).show();

        if(flagSoundOn){
            player.pause();

            //change image
            btnSound.setBackgroundResource(R.drawable.soundoff);
            flagSoundOn = false;

            length = player.getCurrentPosition();
        } else {
            player.seekTo(length);
            player.start();

            //change image
            btnSound.setBackgroundResource(R.drawable.soundon);
            flagSoundOn = true;
        }
    }
}
