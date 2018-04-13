package edu.ouc.foodplatform;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager mviewPager;

    private LinearLayout mTabfood;
    private LinearLayout mTabcam;
    private LinearLayout mTabcus;
    private ImageButton mfoodbtn;
    private ImageButton mcambtn;
    private ImageButton mcusbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mviewPager = findViewById(R.id.id_viewpager);
        //tabs
        mTabcam = findViewById(R.id.tab_cam);
        mTabcus = findViewById(R.id.tab_cus);
        mTabfood = findViewById(R.id.tab_food);
        //imagebutton
        mfoodbtn = findViewById(R.id.btn_food);
        mcambtn = findViewById(R.id.btn_cam);
        mcusbtn = findViewById(R.id.btn_cus);
    }
}
