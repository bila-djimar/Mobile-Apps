package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityTilleul extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tilleul);



		WebView webViewTilleul = (WebView)findViewById(R.id.webViewTilleul);
		webViewTilleul.loadUrl("file:///android_asset/MauxEsprithtm/Tilleul.html");
		
		
		
	}

}
