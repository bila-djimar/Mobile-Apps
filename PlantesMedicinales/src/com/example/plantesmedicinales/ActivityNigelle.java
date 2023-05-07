package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityNigelle extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nigelle);


		WebView webViewverNigelle = (WebView)findViewById(R.id.webViewNigelle);
		webViewverNigelle.loadUrl("file:///android_asset/MauxQuotidienhtml/Nigelle.html");
		
		
		
		
	}

}
