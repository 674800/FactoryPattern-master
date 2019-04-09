package com.factory.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                FgtActivity.startActivity(MainActivity.this, FragmentID.FIRST_FRAGMENT);
                break;
            case R.id.btn_2:
                FgtActivity.startActivity(MainActivity.this, FragmentID.SECOND_FRAGMENT);
                break;
            case R.id.btn_3:
                Bundle bundle = new Bundle();
                bundle.putString("msg", "I form MainActivity");
                FgtActivity.startActivity(MainActivity.this, FragmentID.THIRD_FRAGMENT, bundle);
                break;
        }
    }
}
