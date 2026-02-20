package com.nella.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Nella extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello! This is my first app.");
        setContentView(tv);
    }
}
