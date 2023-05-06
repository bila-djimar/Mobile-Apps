package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint26 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point26);

		WebView webViewverPoint26 = (WebView)findViewById(R.id.webViewa26);
		webViewverPoint26.loadUrl("file:///android_asset/pointhtml/a26.html");

		
		
		
		
	}

}
