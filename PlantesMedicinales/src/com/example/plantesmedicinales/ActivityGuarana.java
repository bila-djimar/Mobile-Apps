package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityGuarana extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guarana);

		WebView webViewverguarana = (WebView)findViewById(R.id.webViewGuarana);
		webViewverguarana.loadUrl("file:///android_asset/FatiguePhysiqueMentalehtml/guarana.html");

		
		
		
	}

}
