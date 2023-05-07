package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityVerveine extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_verveine);

		WebView webViewVerveine = (WebView)findViewById(R.id.webViewVerveine);
		webViewVerveine.loadUrl("file:///android_asset/problemeOsseuxhtml/Verveine.html");

		
		
	}

}
