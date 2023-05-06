package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint13 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point13);

		WebView webViewverPoint13 = (WebView)findViewById(R.id.webViewa13);
		webViewverPoint13.loadUrl("file:///android_asset/pointhtml/a13.html");
		
		
		
	}

}
