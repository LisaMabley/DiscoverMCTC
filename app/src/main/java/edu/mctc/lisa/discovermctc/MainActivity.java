package edu.mctc.lisa.discovermctc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.parse.ParseGeoPoint;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private static final LatLng MCTC = new LatLng(44.9728, -93.2837);
    protected static GoogleMap mMap;
    protected static List<Location> allLocations;

    private static final String TAG = "MCTC.main";

    // TODO: use different marker for locations user has found
    // TODO: add admin activity that allows admin to add/edit locations and map focal point

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allLocations = Location.getAllLocations();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(MainActivity.this);

        Button logoutButton = (Button) findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log out current user
                User.logOut();

                // Exit app
                System.exit(1);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Display map
        mMap = googleMap;
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(MCTC, 17));

        for (int x = 0; x < allLocations.size(); x ++) {
            // Add map marker for each location
            Location locationInstance = allLocations.get(x);
            ParseGeoPoint parseCoordinates = locationInstance.getLocation();
            Double longitude = parseCoordinates.getLongitude();
            Double latitude = parseCoordinates.getLatitude();

            // Convert Parse GeoPoint to Google Maps LatLng coordinates
            LatLng coordinates = new LatLng(latitude, longitude);

            // Add marker on map
            MainActivity.mMap.addMarker(new MarkerOptions()
                    .position(coordinates)
                    .title(locationInstance.getString("Name"))
                    .snippet(locationInstance.getString("RoomNum")));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
