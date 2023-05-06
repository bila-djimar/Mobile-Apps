package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint6 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point6);


		WebView webViewverPoint6 = (WebView)findViewById(R.id.webViewa6);
		webViewverPoint6.loadUrl("file:///android_asset/pointhtml/a6.html");
		
		
		
	}

}
