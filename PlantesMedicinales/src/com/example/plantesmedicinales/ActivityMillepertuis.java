package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityMillepertuis extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_millepertuis);



		WebView webViewMillepertuis = (WebView)findViewById(R.id.webViewMillepertuis);
		webViewMillepertuis.loadUrl("file:///android_asset/MauxEsprithtm/Millepertuis.html");
		
		
	}

}
