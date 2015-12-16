package edu.mctc.lisa.discovermctc;

import com.parse.ParseClassName;
import com.parse.ParseUser;

import java.util.ArrayList;

/**
 * Created by lisa on 12/9/15.
 */

@ParseClassName("User")
public class User extends ParseUser {

    private ArrayList<Location> foundLocations;
    private static final String TAG = "MCTC.user";

    public User() {

        super();
        foundLocations = new ArrayList<>();
    }
}
