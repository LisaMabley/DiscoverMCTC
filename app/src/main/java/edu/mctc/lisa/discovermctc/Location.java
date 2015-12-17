package edu.mctc.lisa.discovermctc;

/**
 * Created by lisa on 12/9/15.
 */

import android.util.Log;

import com.parse.ParseClassName;
import com.parse.ParseException;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

/**
 * Created by lisa on 12/9/15.
 * Data model for a location.
 */

@ParseClassName("Location")
public class Location extends ParseObject {
    private static final String TAG = "MCTC.location";

    public static List<Location> getAllLocations() {
        ParseQuery<Location> query = new ParseQuery<>("Location");
        List<Location> allLocations;

        try {
            return query.find();

        } catch(ParseException e){
            Log.e(TAG, "Error fetching Locations. " + e);
            return null;
        }
    }

    public ParseGeoPoint getLocation() {
        // TODO: Rename parse column to something that makes more sense
        // Esp since the data in the GeoPoint is Lat Long, not Long Lat
        return getParseGeoPoint("LongLat");
    }
}
