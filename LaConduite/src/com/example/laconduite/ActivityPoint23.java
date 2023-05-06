package com.example.laconduite;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.os.Build;

public class ActivityPoint23 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point23);


		WebView webViewverPoint23 = (WebView)findViewById(R.id.webViewa23);
		webViewverPoint23.loadUrl("file:///android_asset/pointhtml/a23.html");
		
		
		
		
	}

}
