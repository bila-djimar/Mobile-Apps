package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint32 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point32);

		WebView webViewverPoint32 = (WebView)findViewById(R.id.webViewa32);
		webViewverPoint32.loadUrl("file:///android_asset/pointhtml/a32.html");

		
		
		
	}

}
