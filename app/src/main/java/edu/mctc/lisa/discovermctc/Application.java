package edu.mctc.lisa.discovermctc;

import android.util.Log;

import com.parse.Parse;

/**
 * Created by lisa on 12/11/15.
 */

public class Application extends android.app.Application {
    private static final String TAG = "MCTC.application";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
        Parse.enableLocalDatastore(this);
        Parse.initialize(this);
    }
}
