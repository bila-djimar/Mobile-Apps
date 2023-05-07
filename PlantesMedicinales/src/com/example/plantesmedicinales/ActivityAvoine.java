package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityAvoine extends   Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_avoine);


		WebView webViewAvoine = (WebView)findViewById(R.id.webViewAvoine);
		webViewAvoine.loadUrl("file:///android_asset/bautepeauhtml/Avoine.html");
		
		
		
	}

}
