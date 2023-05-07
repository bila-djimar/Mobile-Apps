package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityNopalFiguedeBarbarie extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nopal_figuede_barbarie);


		WebView webViewverNopalFiguedeBarbarie = (WebView)findViewById(R.id.webViewNopalFiguedeBarbarie);
		webViewverNopalFiguedeBarbarie.loadUrl("file:///android_asset/minceurhtml/Nopal.html");
		
		
		
		
	}

}
