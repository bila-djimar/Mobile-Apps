package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityCurcuma extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_curcuma);


		WebView webViewCurcuma = (WebView)findViewById(R.id.webViewCurcuma);
		webViewCurcuma.loadUrl("file:///android_asset/troubledigestiontransithtml/Curcuma.html");
		
		
		
		
		
		
	}

}
