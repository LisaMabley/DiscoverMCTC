package edu.mctc.lisa.discovermctc;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by lisa on 12/15/15.
 */

public class MapFragment extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    // TODO: use different marker for locations user has found

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);

//        mapFragment.getMapAsync(MapFragment.this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Display map
        mMap = googleMap;
        LatLng mctc = new LatLng(44.972806, -93.283678);
        CameraUpdate mctcCloseup = CameraUpdateFactory.newLatLngZoom(mctc, 9);
        mMap.animateCamera(mctcCloseup);

//        mMap.addMarker(new MarkerOptions().position(mctc).title("Marker in Minneapolis"));
    }

    private void placeFragment(int containerViewId, Fragment fragment) {

        // Create new fragment transaction
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(containerViewId, fragment);

        // Add the transaction to the back stack
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }
}


