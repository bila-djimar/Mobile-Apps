package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint11 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point11);


		WebView webViewverPoint11 = (WebView)findViewById(R.id.webViewa11);
		webViewverPoint11.loadUrl("file:///android_asset/pointhtml/a11.html");
		
		
		
	}

}
