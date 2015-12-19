package vn.techmaster.happywedding;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //load layout config from activity_main.xml -> inflate
        //1-load config
        //2-parse, convert object
        //3-render
        setContentView(R.layout.test);
    }

    public void toggleSound(View view) {
        Toast.makeText(this, "Click on Sound", Toast.LENGTH_SHORT).show();
    }
}
