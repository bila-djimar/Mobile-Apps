package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint7 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point7);


		WebView webViewverPoint7 = (WebView)findViewById(R.id.webViewa7);
		webViewverPoint7.loadUrl("file:///android_asset/pointhtml/a7.html");
		
		
		
	}

}
