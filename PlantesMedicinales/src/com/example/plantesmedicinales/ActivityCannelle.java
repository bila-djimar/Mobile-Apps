package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityCannelle extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cannelle);


		WebView webViewCannelle = (WebView)findViewById(R.id.webViewCannelle);
		webViewCannelle.loadUrl("file:///android_asset/troubledigestiontransithtml/cannelle.html");
		
		
		
		
	}

}
