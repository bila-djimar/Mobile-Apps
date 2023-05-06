package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint33 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point33);


		WebView webViewverPoint33 = (WebView)findViewById(R.id.webViewa33);
		webViewverPoint33.loadUrl("file:///android_asset/pointhtml/a33.html");
		
		
		
	}

}
