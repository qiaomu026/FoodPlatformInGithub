package edu.ouc.foodplatform;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity implements View.OnClickListener {


//tabBtn
    private LinearLayout mTabfood;
    private LinearLayout mTabcam;
    private LinearLayout mTabcus;
    private ImageButton mfoodbtn;
    private ImageButton mcambtn;
    private ImageButton mcusbtn;

    private Fragment foodFragment;
    private Fragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mainactivaty);
        initView();
        initEvent();
        setSelect(0);
    }

    private void setSelect(int i) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        hideFragment(transaction);
        switch (i){
            case 0:
                if(foodFragment == null){
                    foodFragment = new foodFragment();
                    transaction.add(R.id.main_content,foodFragment);
                }else {
                    transaction.show(foodFragment);
                }
                mfoodbtn.setImageResource(R.drawable.homepage_press);
                break;
            case 1:
                if (settingFragment == null) {
                    settingFragment = new settingFragment();
                }else {
                    transaction.show(settingFragment);
                    transaction.add(R.id.main_content,settingFragment);
                }
                mcusbtn.setImageResource(R.drawable.customer_press);
                break;
            default:
                break;

        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (foodFragment != null)
        {
            transaction.hide(foodFragment);
        }
        if (settingFragment != null)
        {
            transaction.hide(settingFragment);
        }

    }

    private void initEvent() {
        mfoodbtn.setOnClickListener(this);
        mcambtn.setOnClickListener(this);
        mcusbtn.setOnClickListener(this);
    }

    private void initView() {
        //tabs
        mTabcam = findViewById(R.id.tab_cam);
        mTabcus = findViewById(R.id.tab_cus);
        mTabfood = findViewById(R.id.tab_food);
        //imagebutton
        mfoodbtn = findViewById(R.id.btn_food);
        mcambtn = findViewById(R.id.btn_cam);
        mcusbtn = findViewById(R.id.btn_cus);

    }

    @Override
    public void onClick(View view) {
        resetImgs();
        switch(view.getId()){
            case R.id.btn_food:
                setSelect(0);
                break;
            case R.id.btn_cam:
                break;
            case R.id.btn_cus:
                setSelect(1);
                break;
            default:
                break;
        }
    }

    private void resetImgs() {
        mcusbtn.setImageResource(R.drawable.customer);
        mfoodbtn.setImageResource(R.drawable.homepage);
    }
}
