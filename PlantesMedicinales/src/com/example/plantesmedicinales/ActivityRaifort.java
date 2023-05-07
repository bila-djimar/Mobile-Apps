package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityRaifort extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_raifort);


		WebView webViewverRaifort = (WebView)findViewById(R.id.webViewRaifort);
		webViewverRaifort.loadUrl("file:///android_asset/MauxQuotidienhtml/Raifort.html");
		
		
		
	}

}
