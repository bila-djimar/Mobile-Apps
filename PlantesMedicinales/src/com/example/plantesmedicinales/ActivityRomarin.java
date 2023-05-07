package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityRomarin extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_romarin);


		WebView webViewRomarin = (WebView)findViewById(R.id.webViewRomarin);
		webViewRomarin.loadUrl("file:///android_asset/MauxEsprithtm/Romarin.html");
		
		
	}

}
