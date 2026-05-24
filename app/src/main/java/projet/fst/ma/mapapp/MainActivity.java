package projet.fst.ma.mapapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

// Imports nécessaires pour Google Maps
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupérer le SupportMapFragment et être notifié quand la carte est prête
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Ajouter un marqueur (ex: Marrakech) et déplacer la caméra
        LatLng fstGueliz = new LatLng(31.646, -8.020);
        mMap.addMarker(new MarkerOptions().position(fstGueliz).title("Marker à la FST"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fstGueliz, 15));
    }
}