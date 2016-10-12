package com.cc.startactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn = (Button) findViewById(R.id.bn);
        // 为bn按钮绑定事件监听器
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建需要启动的Activity对应的Intent
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                // 启动intent对应的Activity
                startActivity(intent);
            }
        });
    }
}
