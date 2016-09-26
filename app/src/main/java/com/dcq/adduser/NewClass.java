package com.dcq.adduser;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
public class NewClass extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(NewClass.this ,"这样提交一次试试",Toast.LENGTH_SHORT).show();
    }
}
