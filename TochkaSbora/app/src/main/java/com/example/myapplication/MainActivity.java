package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = " <img class=\"img-responsive\" loading=\"lazy\"\n" +
                "src=\"/uploads/items/21756/d3d6e-louisarmstrong-sm.jpg\"\n" +  "src=\"/uploads/items/21756/d3d6e-louisarmstrong-sm.jpg\"\n" +
                "alt=\"Луи Армстронг\"/>";
        Pattern pattern = Pattern.compile("alt=\"(.*?)\"/>");
        Pattern pattern1 = Pattern.compile("src=\"(.*?)\"");
        Matcher matcher = pattern.matcher(str);
        Matcher matcher1 = pattern1.matcher(str);
        while (matcher.find() && matcher1.find())
        {
            Log.i("pattern",matcher.group(1));
            Log.i("pattern",matcher1.group(1));
        }
    }


}