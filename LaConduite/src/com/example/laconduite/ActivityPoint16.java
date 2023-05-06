package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint16 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point16);

		WebView webViewverPoint16 = (WebView)findViewById(R.id.webViewa16);
		webViewverPoint16.loadUrl("file:///android_asset/pointhtml/a16.html");

		
		
		
		
	}

}
