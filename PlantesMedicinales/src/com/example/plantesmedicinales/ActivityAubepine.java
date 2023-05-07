package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityAubepine extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aubepine);



		WebView webViewAubepine = (WebView)findViewById(R.id.webViewAubepine);
		webViewAubepine.loadUrl("file:///android_asset/MauxEsprithtm/Aubepine.html");
		
		
	}

}
