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

public class ActivityPoint18 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point18);

		WebView webViewverPoint18 = (WebView)findViewById(R.id.webViewa18);
		webViewverPoint18.loadUrl("file:///android_asset/pointhtml/a18.html");

		
		
	}

}
