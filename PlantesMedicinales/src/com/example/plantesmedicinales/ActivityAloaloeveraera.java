package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityAloaloeveraera extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_aloaloeveraera);


		WebView webViewAloaloeveraera = (WebView)findViewById(R.id.webViewaloevera);
		webViewAloaloeveraera.loadUrl("file:///android_asset/bautepeauhtml/Aloevera.html");
		
		
	}

}
