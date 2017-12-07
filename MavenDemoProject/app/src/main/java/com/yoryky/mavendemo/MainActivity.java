package com.yoryky.mavendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.yoryky.androidlib.utils.FileUtil;
import com.yoryky.androidlib.utils.HelpUtil;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelpUtil.showToast(this,"hello world");
        Gson gson = new Gson();
        try{
            FileUtil.writeExternal(this,"hello.txt","测试写入一点东西");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
