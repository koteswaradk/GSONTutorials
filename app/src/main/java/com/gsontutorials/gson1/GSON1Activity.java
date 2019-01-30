package com.gsontutorials.gson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gsontutorials.R;

public class GSON1Activity extends AppCompatActivity {
    private String TAG=getClass().getSimpleName();
    String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson1);

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);

        jsonString = gson.toJson(student);
        Log.i(TAG,jsonString);
        Log.i(TAG,student.getName());
        Log.i(TAG,""+student.getAge());


    }
}
