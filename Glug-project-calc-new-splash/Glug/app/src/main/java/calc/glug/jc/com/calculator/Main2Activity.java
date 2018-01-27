package calc.glug.jc.com.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//this is the splash screen activity
public class Main2Activity extends AppCompatActivity {

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);

            }
        },1400);


    }

    @Override
    public void onBackPressed() {
        Main2Activity.this.finish();
        System.exit(0);
    }
}
