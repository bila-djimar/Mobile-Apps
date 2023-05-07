package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityGeleeroyale extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_geleeroyale);


		WebView webViewverDesmodium = (WebView)findViewById(R.id.webViewgeleeroyale);
		webViewverDesmodium.loadUrl("file:///android_asset/MauxQuotidienhtml/geleeroyale.html");
		
		
		
		
		
	}

}
