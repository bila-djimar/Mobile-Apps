package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint12 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point12);


		WebView webViewverPoint12 = (WebView)findViewById(R.id.webViewa12);
		webViewverPoint12.loadUrl("file:///android_asset/pointhtml/a12.html");
		
		
		
		
	}

}
