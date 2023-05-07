package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityFenouil extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fenouil);



		WebView webViewFenouil = (WebView)findViewById(R.id.webViewFenouil);
		webViewFenouil.loadUrl("file:///android_asset/troubledigestiontransithtml/Fenouil.html");
		
		
		
	}

}
