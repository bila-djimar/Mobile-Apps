package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySauge extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sauge);


		WebView webViewverSauge = (WebView)findViewById(R.id.webViewSauge);
		webViewverSauge.loadUrl("file:///android_asset/troublesfemininshtml/Sauge.html");
		
		
		
		
	}

}
