package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint14 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point14);


		WebView webViewverPoint14 = (WebView)findViewById(R.id.webViewa14);
		webViewverPoint14.loadUrl("file:///android_asset/pointhtml/a14.html");
		
		
		
		
	}

}
