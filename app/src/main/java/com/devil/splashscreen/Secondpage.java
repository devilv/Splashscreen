package com.devil.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by devil on 11/26/2016.
 */

public class Secondpage extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.secondpage);
    }
}