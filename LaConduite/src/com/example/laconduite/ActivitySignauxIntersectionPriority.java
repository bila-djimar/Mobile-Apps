package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignauxIntersectionPriority extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signaux_intersection_priority);

		WebView webViewversignauxIntersectionPriorite = (WebView)findViewById(R.id.webViewIntersectionPriorite);
    	webViewversignauxIntersectionPriorite.loadUrl("file:///android_asset/panneauxhtml/IntersectionPriorite.html");	
		
		
		
		
		
		
	}
}
