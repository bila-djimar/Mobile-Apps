package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPassiflore extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_passiflore);



		WebView webViewPassiflore = (WebView)findViewById(R.id.webViewPassiflore);
		webViewPassiflore.loadUrl("file:///android_asset/MauxEsprithtm/Passiflore.html");
		
		
		
	}

}
