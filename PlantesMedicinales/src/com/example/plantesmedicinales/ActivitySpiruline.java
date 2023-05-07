package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySpiruline extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spiruline);



		WebView webViewverspiruline = (WebView)findViewById(R.id.webViewSpiruline);
		webViewverspiruline.loadUrl("file:///android_asset/FatiguePhysiqueMentalehtml/spiruline.html");
		
		
		
	}

}
