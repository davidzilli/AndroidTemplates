package com.a2b.bikeos_base.fragments;

import com.a2b.bikeos_base.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTemplate extends A2BFragmentWrapper {
	
	/*********************************************************************************
     * Member Variables
     *********************************************************************************/
	
	/*********************************************************************************
     * Lifecycle
     *********************************************************************************/
	
	/** Activity: Created */
	
	@Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
	
	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        
		View view = inflater.inflate(R.layout.activity_a2b, container, false);
		return view;
    }
	
	@Override
	public void onActivityCreated (Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	/** Activity: Started */
	
	@Override
	public void onStart() {
		super.onStart();
	}
	
	/** Activity: Resumed */
	
	@Override
	public void onResume() {
		super.onResume();
	}
	
	/** Activity: Paused */
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	/** Activity: Stopped */
	
	@Override
	public void onStop() {
		super.onStop();
	}
	
	/** Activity: Destroy */
	
	@Override
	public void onDestroyView () {
		super.onDestroyView();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
	}
}
