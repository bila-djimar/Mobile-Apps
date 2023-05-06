package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint30 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point30);


		WebView webViewverPoint30 = (WebView)findViewById(R.id.webViewa30);
		webViewverPoint30.loadUrl("file:///android_asset/pointhtml/a30.html");
		
		
		
	}

}
