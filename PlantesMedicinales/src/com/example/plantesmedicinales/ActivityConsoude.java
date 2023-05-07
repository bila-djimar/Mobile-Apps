package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityConsoude extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consoude);


		WebView webViewConsoude = (WebView)findViewById(R.id.webViewConsoude);
		webViewConsoude.loadUrl("file:///android_asset/problemeOsseuxhtml/Consoude.html");
		
		
		
	}

}
