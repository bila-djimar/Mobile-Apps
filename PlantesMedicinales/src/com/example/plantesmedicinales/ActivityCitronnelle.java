package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityCitronnelle extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_citronnelle);


		WebView webViewverCitronnelle = (WebView)findViewById(R.id.webViewCitronnelle);
		webViewverCitronnelle.loadUrl("file:///android_asset/MauxQuotidienhtml/Citronnelle.html");
		
		
		
		
		
		
	}

}
