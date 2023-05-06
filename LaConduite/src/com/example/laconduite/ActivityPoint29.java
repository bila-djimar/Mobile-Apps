package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint29 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point29);

		WebView webViewverPoint29 = (WebView)findViewById(R.id.webViewa29);
		webViewverPoint29.loadUrl("file:///android_asset/pointhtml/a29.html");

		
		
	}

}
