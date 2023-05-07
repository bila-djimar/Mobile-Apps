package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityRadisNoire extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radis_noire);


		WebView webViewRadisNoire = (WebView)findViewById(R.id.webViewradisnoire);
		webViewRadisNoire.loadUrl("file:///android_asset/troubledigestiontransithtml/radisnoire.html");
		
		
		
	}

}
