package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint28 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point28);

		WebView webViewverPoint28 = (WebView)findViewById(R.id.webViewa28);
		webViewverPoint28.loadUrl("file:///android_asset/pointhtml/a28.html");

		
		
		
	}

}
