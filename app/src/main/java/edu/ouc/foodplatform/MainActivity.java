package edu.ouc.foodplatform;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mviewPager;
    private PagerAdapter mAdapter;
    private List<View> mViews = new ArrayList<>();

//tabBtn
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
        setContentView(R.layout.mainactivaty);
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

        LayoutInflater mInflater = LayoutInflater.from(this);
        View food_tab = mInflater.inflate(R.layout.tab_food_layout,null);
        View cam_tab = mInflater.inflate(R.layout.tab_cam_layout,null);
        View cus_tab = mInflater.inflate(R.layout.tab_cus_layout,null);

        mViews.add(food_tab);
        mViews.add(cam_tab);
        mViews.add(cus_tab);

        mAdapter = new PagerAdapter() {
            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(mViews.get(position));
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View view = mViews.get(position);
                container.addView(view);
                return view;
            }

            @Override
            public int getCount() {
                return mViews.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }
        };
        mviewPager.setAdapter(mAdapter);
    }
}
