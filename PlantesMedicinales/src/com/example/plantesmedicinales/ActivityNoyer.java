package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityNoyer extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_noyer);


		WebView webViewNoyer = (WebView)findViewById(R.id.webViewNoyer);
		webViewNoyer.loadUrl("file:///android_asset/bautepeauhtml/Noyer.html");
		
		
		
	}

}
