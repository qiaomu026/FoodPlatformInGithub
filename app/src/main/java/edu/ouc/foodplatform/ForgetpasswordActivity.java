package edu.ouc.foodplatform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetpasswordActivity extends AppCompatActivity {

    private Button rtnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpassword_layout);

        rtnBtn = (Button) findViewById(R.id.return_button);

        rtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ForgetpasswordActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}