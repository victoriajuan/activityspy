package edu.washington.vicky37.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String onCreateMessage = "on onCreate event fired";
    private final String onStartMessage = "on onStart event fired";
    private final String onRestartMessage = "on onRestart event fired";
    private final String onResumeMessage = "on onResume event fired";
    private final String onPauseMessage = "on onPause event fired";
    private final String onStopMessage = "on onStop event fired";
    private final String onDestroyMessage = "We’re going down, Captain!”";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", onCreateMessage);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", onStartMessage);
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("onRestart", onRestartMessage);
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("onResume", onResumeMessage);
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("onPause", onPauseMessage);
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("onStop", onStopMessage);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("onDestroy", onDestroyMessage);
    }


}
