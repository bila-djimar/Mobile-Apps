package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint34 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point34);

		WebView webViewverPoint34 = (WebView)findViewById(R.id.webViewa34);
		webViewverPoint34.loadUrl("file:///android_asset/pointhtml/a34.html");

		
		
	}

}
