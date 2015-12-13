package edu.mctc.lisa.discovermctc;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseUser;

import java.util.ArrayList;

/**
 * Created by lisa on 12/9/15.
 */

@ParseClassName("User")
public class User extends ParseUser {

    private ArrayList<Location> foundLocations = new ArrayList<>();

    public String getText() {
        return getString("text");
    }

    public void setText(String value) {
        put("text", value);
    }

    public ParseUser getUser() {
        return getParseUser("user");
    }

    public void setUser(ParseUser value) {
        put("user", value);
    }

    public ParseGeoPoint getLocation() {
        return getParseGeoPoint("location");
    }

    public void setLocation(ParseGeoPoint value) {
        put("location", value);
    }


}
