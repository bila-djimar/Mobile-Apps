package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityBourrache extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bourrache);


		WebView webViewBourrache = (WebView)findViewById(R.id.webViewBourrache);
		webViewBourrache.loadUrl("file:///android_asset/bautepeauhtml/Bourrache.html");
		
		
		
	}

}
