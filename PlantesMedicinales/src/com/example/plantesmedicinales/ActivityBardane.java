package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityBardane extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bardane);

		WebView webViewBardane = (WebView)findViewById(R.id.webViewBardane);
		webViewBardane.loadUrl("file:///android_asset/bautepeauhtml/Bardane.html");

		
		
		
	}

}
