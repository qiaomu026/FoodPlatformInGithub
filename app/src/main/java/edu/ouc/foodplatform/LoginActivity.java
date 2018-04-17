package edu.ouc.foodplatform;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2018/4/12.
 */

public class LoginActivity extends AppCompatActivity {

    private Button forgetPwdBtn;
    private Button rgtBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        forgetPwdBtn = (Button) findViewById(R.id.forgetPassword_button);
        rgtBtn = (Button) findViewById(R.id.register_button);

        forgetPwdBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, ForgetpasswordActivity.class);
                startActivity(i);
            }
        });

        rgtBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }

}