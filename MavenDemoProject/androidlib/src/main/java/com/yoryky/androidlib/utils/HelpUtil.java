package com.yoryky.androidlib.utils;


import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;

/**
 * create by yoryky
 */
public class HelpUtil {
    public static void showToast(Context context, String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }

    public static String objToString(Object object){
        String retStr = new Gson().toJson(object);
        return retStr;
    }
}
