package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint31 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point31);

		WebView webViewverPoint31 = (WebView)findViewById(R.id.webViewa31);
		webViewverPoint31.loadUrl("file:///android_asset/pointhtml/a31.html");

		
		
		
	}

}
