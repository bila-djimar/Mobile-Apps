package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint22 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point22);


		WebView webViewverPoint22 = (WebView)findViewById(R.id.webViewa22);
		webViewverPoint22.loadUrl("file:///android_asset/pointhtml/a22.html");
		
		
		
		
	}

}
