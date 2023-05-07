package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPsyllium extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_psyllium);


		WebView webViewPsyllium = (WebView)findViewById(R.id.webViewPsyllium);
		webViewPsyllium.loadUrl("file:///android_asset/troubledigestiontransithtml/Psyllium.html");
		
		
		
		
	}

}
