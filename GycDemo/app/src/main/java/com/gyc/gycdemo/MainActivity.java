package com.gyc.gycdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    private Button mBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBt = (Button)findViewById(R.id.main_bt);

        mBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("main/testactivity").navigation();
            }
        });
    }
}
