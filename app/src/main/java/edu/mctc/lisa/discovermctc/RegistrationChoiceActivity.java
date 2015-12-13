package edu.mctc.lisa.discovermctc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by lisa on 12/6/15.
 * Displays registration screen with option to sign up or log in.
 * Adapted from Parse Anywall app
 */

public class RegistrationChoiceActivity extends Activity {
    private static final String TAG = "MCTC.regChoice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_choice);

        Log.d(TAG, "onCreate");

        // Log in button click handler
        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent of the log in activity
                startActivity(new Intent(RegistrationChoiceActivity.this, LoginActivity.class));
            }
        });

        // Sign up button click handler
        Button signupButton = (Button) findViewById(R.id.signup_button);
        signupButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(RegistrationChoiceActivity.this, SignUpActivity.class));
            }
        });
    }
}
