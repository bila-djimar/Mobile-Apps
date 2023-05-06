package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint27 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point27);


		WebView webViewverPoint27 = (WebView)findViewById(R.id.webViewa27);
		webViewverPoint27.loadUrl("file:///android_asset/pointhtml/a27.html");
		
		
		
	}

}
