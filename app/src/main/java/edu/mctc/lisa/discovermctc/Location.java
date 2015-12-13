package edu.mctc.lisa.discovermctc;

/**
 * Created by lisa on 12/9/15.
 */

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

/**
 * Created by lisa on 12/9/15.
 * Data model for a location.
 */

@ParseClassName("Location")
public class Location extends ParseObject {

    public ParseGeoPoint getLocation() {
        return getParseGeoPoint("location");
    }

//    public void setLocation(ParseGeoPoint location) {
//        put() getParseGeoPoint("location");
//    }

    public void setText(String value) {
        put("text", value);

//    public static ParseQuery<Location> getQuery() {
//        return ParseQuery.getQuery(Location.class);
//    }
//}
    }}
