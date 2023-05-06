package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint20 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point20);

		WebView webViewverPoint20 = (WebView)findViewById(R.id.webViewa20);
		webViewverPoint20.loadUrl("file:///android_asset/pointhtml/a20.html");
		
		
	}

}
