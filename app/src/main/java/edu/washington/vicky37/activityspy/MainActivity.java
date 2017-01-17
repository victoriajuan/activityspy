package edu.washington.vicky37.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "on onCreate event fired");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "on onStart event fired");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "on onRestart event fired");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "on onResume event fired");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "on onPause event fired");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "on onStop event fired");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "We’re going down, Captain!");
    }
}
