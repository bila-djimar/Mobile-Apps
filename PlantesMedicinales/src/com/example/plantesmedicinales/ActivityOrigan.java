package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityOrigan extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_origan);



		WebView webViewverorigan = (WebView)findViewById(R.id.webViewOrigan);
		webViewverorigan.loadUrl("file:///android_asset/FatiguePhysiqueMentalehtml/origan.html");
		
		
		
		
	}

}
