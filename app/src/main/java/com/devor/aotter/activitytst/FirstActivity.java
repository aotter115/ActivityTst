package com.devor.aotter.activitytst;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/1.
 */

public class FirstActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_l);//将按钮实例化
        button1.setOnClickListener(new View.OnClickListener() {//用set方法注册监听器，点击按钮后执行onClick方法
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this,"You clicked Button 1", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
