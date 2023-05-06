package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint25 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point25);


		WebView webViewverPoint25 = (WebView)findViewById(R.id.webViewa25);
		webViewverPoint25.loadUrl("file:///android_asset/pointhtml/a25.html");
		
		
		
		
	}

}
