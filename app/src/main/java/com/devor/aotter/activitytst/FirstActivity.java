package com.devor.aotter.activitytst;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        requestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);//隐藏标题栏

        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_l);//将按钮实例化
        button1.setOnClickListener(new View.OnClickListener() {//用set方法注册监听器，点击按钮后执行onClick方法
                @Override
                public void onClick(View view) {
                    Toast.makeText(FirstActivity.this,"You clicked Button 1", Toast.LENGTH_SHORT).show();//makeText需要传入的三个参数：context，Toast显示的文本内容，Toast显示的时长
                }
        });
    }

    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);//inflate()方法接收两个参数。一个用于指定资源文件，另一个用来指定传入的对象
        return true;//true表示创建的菜单允许显示出来
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "You  clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
