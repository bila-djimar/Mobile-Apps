package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint35 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point35);


		WebView webViewverPoint35 = (WebView)findViewById(R.id.webViewa35);
		webViewverPoint35.loadUrl("file:///android_asset/pointhtml/a35.html");
		
		
		
		
		
	}

}
