package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint36 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point36);

		WebView webViewverPoint36 = (WebView)findViewById(R.id.webViewa36);
		webViewverPoint36.loadUrl("file:///android_asset/pointhtml/a36.html");

		
		
		
		
		
	}

}
