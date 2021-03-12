package com.example.sec30_266;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getLifecycle().addObserver(new DemoAppComponent("SecondActivity"));
        Log.i(TAG, "***************    SecondActivity onCreate() ");
    }
}
