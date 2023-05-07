package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityMaca extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maca);


		WebView webViewverMaca = (WebView)findViewById(R.id.webViewMaca);
		webViewverMaca.loadUrl("file:///android_asset/FatiguePhysiqueMentalehtml/maca.html");
		
		
		
		
	}

}
