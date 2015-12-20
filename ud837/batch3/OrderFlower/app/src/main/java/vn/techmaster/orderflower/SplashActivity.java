package vn.techmaster.orderflower;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void goFlower(View view) {
        Intent i = new Intent(this, FlowerActivity.class);
        startActivity(i);
    }
}
