package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint17 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point17);

		WebView webViewverPoint17 = (WebView)findViewById(R.id.webViewa17);
		webViewverPoint17.loadUrl("file:///android_asset/pointhtml/a17.html");

		
		
		
		
	}

}
