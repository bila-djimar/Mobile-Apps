package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityCardamome extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cardamome);



		WebView webViewCardamome = (WebView)findViewById(R.id.webViewcardamome);
		webViewCardamome.loadUrl("file:///android_asset/troubledigestiontransithtml/cardamome.html");
		
		
		
	}

}
