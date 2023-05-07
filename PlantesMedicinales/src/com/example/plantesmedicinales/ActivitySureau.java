package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySureau extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sureau);


		WebView webViewverPrele = (WebView)findViewById(R.id.webViewSureau);
		webViewverPrele.loadUrl("file:///android_asset/troublesurinairehtml/Sureau.html");
		
		
		
		
		
		
	}

}
