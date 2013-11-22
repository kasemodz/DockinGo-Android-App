package com.example.dockngo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;


public class MapsActivity extends Fragment {
	
	private GoogleMap mMaps;
	//public ActionBar ActionBar; 

    private static View v;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //super.onCreateView(inflater, container, savedInstanceState);
    	//View v = inflater.inflate(R.layout.lin1,container, false);
        if (v != null) {
        	ViewGroup parent = (ViewGroup) v.getParent();
        	if (parent != null){
        		parent.removeView(v);
        	}
            // The Map is verified. It is now safe to manipulate the map.
        }
        try{
        	v = inflater.inflate(R.layout.lin1, container, false);
        }catch (InflateException e){
        }
        
//      ActionBar = getActionBar();
//      ActionBar.setSubtitle("DockNGo");
//      ActionBar.setTitle("Diy-Create.com");
      setUpMapIfNeeded();  
      mMaps.setMyLocationEnabled(true);
      //UiSettings.setMyLocationButtonEnabled(true);
  // mMaps =  ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
     // mMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        
        
        return v;
        
    }
    
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMaps == null) {
            mMaps = ((SupportMapFragment) getFragmentManager().findFragmentById(R.id.map))
                                .getMap();
        }
            // Check if we were successful in obtaining the map.
            if (mMaps != null) {
            	
                // The Map is verified. It is now safe to manipulate the map.

            }

            
            
        }
    }
