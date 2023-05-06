package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint5 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point5);


		WebView webViewverPoint5 = (WebView)findViewById(R.id.webViewa5);
		webViewverPoint5.loadUrl("file:///android_asset/pointhtml/a5.html");
		
		
		
		
	}

}
