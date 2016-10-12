package com.cc.startactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button previous;
    private Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        previous = (Button) findViewById(R.id.previous);
        close = (Button) findViewById(R.id.close);
        // 为previous绑定按钮监听事件
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 获取启动当前Activity的上一个Intent
                Intent intent = new Intent(SecondActivity.this,
                        MainActivity.class);
                //启动intent对应的Activity
                startActivity(intent);
            }
        });
        // 为close绑定按钮监听事件
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 获取启动当前Activity的上一个Intent
                Intent intent = new Intent(SecondActivity.this,
                        MainActivity.class);
                //启动intent对应的Activity
                startActivity(intent);
                //结束当前Activity
                finish();
            }
        });

    }
}
