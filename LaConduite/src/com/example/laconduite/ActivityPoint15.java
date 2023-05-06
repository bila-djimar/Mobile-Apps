package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint15 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point15);

		WebView webViewverPoint15 = (WebView)findViewById(R.id.webViewa15);
		webViewverPoint15.loadUrl("file:///android_asset/pointhtml/a15.html");

		
		
		
		
		
	}

}
