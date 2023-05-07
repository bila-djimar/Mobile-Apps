package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPropolis extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_propolis);



		WebView webViewverpropolis = (WebView)findViewById(R.id.webViewpropolis);
		webViewverpropolis.loadUrl("file:///android_asset/FatiguePhysiqueMentalehtml/propolis.html");	
		
		
		
		
	}

}
