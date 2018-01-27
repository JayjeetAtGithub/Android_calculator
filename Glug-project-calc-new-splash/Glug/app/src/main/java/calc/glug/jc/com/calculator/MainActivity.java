package calc.glug.jc.com.calculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
   public static TextView ScreenAns, ScreenMath;
   public static StringBuilder textMath = new StringBuilder("0+");
   public static StringBuilder textAns = new StringBuilder("0");
   public  static  StringBuilder screenTextMath = new StringBuilder("");
   public static double num1 = 0, num2 = 0, ans = 0;
    //char mask = ' ';
    public static int checkSubmit = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
        setContentView(R.layout.activity_main);

         pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        ScreenAns = (TextView)findViewById(R.id.result);
        ScreenMath = (TextView)findViewById(R.id.cal);

    }



    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {

            Fragment fragment = null;
            if(pos == 0)
            {
                fragment = new Normal();
            }
            else
            {
                fragment = new Scientific();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


    @Override
    public void onBackPressed() {        //pauses the activity but remains open in background(doesnt get back to the splash screen again)
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
