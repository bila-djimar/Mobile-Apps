package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityTamarin extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tamarin);


		WebView webViewtamarin = (WebView)findViewById(R.id.webViewtamarin);
		webViewtamarin.loadUrl("file:///android_asset/troubledigestiontransithtml/tamarin.html");
		
		
		
		
	}

}
