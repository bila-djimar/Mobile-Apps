package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint8 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point8);


		WebView webViewverPoint8 = (WebView)findViewById(R.id.webViewa8);
		webViewverPoint8.loadUrl("file:///android_asset/pointhtml/a8.html");
		
		
		
	}

}
