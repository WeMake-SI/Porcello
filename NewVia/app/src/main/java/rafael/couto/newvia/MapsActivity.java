package rafael.couto.newvia;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;


import com.directions.route.AbstractRouting;
import com.directions.route.Route;
import com.directions.route.RouteException;
import com.directions.route.Routing;
import com.directions.route.RoutingListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, RoutingListener {

    private GoogleMap mMap;
    private static LatLng prev = new LatLng(0, 0);
    private byte flag = 0;
    private double longitude;
    private double latitude;
    private LatLng via;
    private LatLng via2;
    private LatLng meuLocal;
    private LocationManager lm;
    private Location myLocation;
    private Location netLocation;
    private LocationListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        myLocation = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        netLocation = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

        if(myLocation!=null){
            longitude = myLocation.getLongitude();
            latitude = myLocation.getLatitude();
        }else{
            longitude = netLocation.getLongitude();
            latitude = netLocation.getLatitude();
        }


        meuLocal = new LatLng(latitude, longitude);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        via = new LatLng(-29.91960039, -51.1800873);
        mMap.addMarker(new MarkerOptions().position(via).title("Entrada 1"));

        via2 = new LatLng(-29.9194702, -51.18166444);
        mMap.addMarker(new MarkerOptions().position(via2).title("Entrada 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(meuLocal));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(17));
        mMap.setMyLocationEnabled(true);

        Routing routing = new Routing.Builder()
                .travelMode(Routing.TravelMode.DRIVING)
                .withListener(this)
                .waypoints(meuLocal, via2)
                .build();
        routing.execute();
    }

    @Override
    public void onRoutingFailure(RouteException e) {
        Toast.makeText(getBaseContext(), R.string.erro, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRoutingStart() {

    }

    public void onRoutingSuccess(ArrayList<Route> route, int shortestRouteIndex) {
        ArrayList<Polyline> polylines = new ArrayList<>();
        //add route(s) to the map.
        for (int i = 0; i < route.size(); i++) {

            PolylineOptions polyOptions = new PolylineOptions();
            polyOptions.width(10 + i * 3);
            polyOptions.color(R.color.blue);
            polyOptions.addAll(route.get(i).getPoints());
            Polyline polyline = mMap.addPolyline(polyOptions);
            polylines.add(polyline);
        }

        Toast.makeText(
                getApplicationContext(),
                R.string.rota,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRoutingCancelled() {

    }
}
