package edu.mctc.lisa.discovermctc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    private void uploadLocationObjects() {
//
//        String[] libraryDetails = {"Library", "Whitney Hall XXXX", "44.972375, -93.284757"};
//        String[] computerLabDetails = {"Computer Lab", "T Building XXXX", "44.972949, -93.283128"};
//        String[] healthClinicDetails = {"Student Health Clinic", "H Building XXXX", "44.972250, -93.282917"};
//
//        ArrayList locations = new ArrayList();
//        locations.add(libraryDetails);
//        locations.add(computerLabDetails);
//        locations.add(healthClinicDetails);
//
//        String detailText = "Disrupt viral hella meh, plaid cupidatat magna art party. Literally narwhal. Craft beer forage cornhole. Locavore ex vinyl tote bag chillwave swag occaecat. Sed banh mi foodie freegan ethical mixtape blog, umami nulla skateboard.";
//
//        for (int x = 0; x<locations.size(); x++) {
//            Location newLocation = new Location();
////            newLocation.
//
//        }
//    }

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
