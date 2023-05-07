package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityVergeOr extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_verge_or);

		WebView webViewverVergeOr = (WebView)findViewById(R.id.webViewVergeOr);
		webViewverVergeOr.loadUrl("file:///android_asset/troublesurinairehtml/verge.html");

		
		
		
		
	}

}
