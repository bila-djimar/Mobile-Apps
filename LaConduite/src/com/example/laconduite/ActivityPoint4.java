package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint4 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point4);

		WebView webViewverPoint4 = (WebView)findViewById(R.id.webViewa4);
		webViewverPoint4.loadUrl("file:///android_asset/pointhtml/a4.html");
		
		
		
	}

}
