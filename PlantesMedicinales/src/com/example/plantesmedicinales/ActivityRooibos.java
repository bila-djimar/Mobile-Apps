package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityRooibos extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rooibos);


		WebView webViewRooibos = (WebView)findViewById(R.id.webViewRooibos);
		webViewRooibos.loadUrl("file:///android_asset/MauxEsprithtm/Rooibos.html");
		
		
		
	}

}
