package edu.mctc.lisa.discovermctc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.parse.ParseUser;

/**
 * Created by lisa on 12/9/15.
 * Adapted from Parse Anywall app
 */

public class DispatchActivity extends Activity {
    private static final String TAG = "MCTC.dispatch";

    public DispatchActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate");

//      Check if there is current user info
        if (ParseUser.getCurrentUser() != null) {

            // Start an intent for the logged in activity
            startActivity(new Intent(this, MainActivity.class));

        } else {
            // Start and intent for the logged out activity
            startActivity(new Intent(this, RegistrationChoiceActivity.class));
        }
    }
}
