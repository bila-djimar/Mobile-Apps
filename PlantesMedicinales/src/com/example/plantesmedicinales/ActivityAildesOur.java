package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityAildesOur extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aildes_our);


		WebView webViewverAildesOur = (WebView)findViewById(R.id.webViewAilDesOur);
		webViewverAildesOur.loadUrl("file:///android_asset/MauxQuotidienhtml/ailour.html");
		
		
		
		
		
	}

}
