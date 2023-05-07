package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityArnica extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arnica);


		WebView webViewArnica = (WebView)findViewById(R.id.webViewArnica);
		webViewArnica.loadUrl("file:///android_asset/problemeOsseuxhtml/Arnica.html");
		
		
		
		
	}

}
