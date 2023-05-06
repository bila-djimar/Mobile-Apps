package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point2);


		WebView webViewverPoint2 = (WebView)findViewById(R.id.webViewa2);
		webViewverPoint2.loadUrl("file:///android_asset/pointhtml/a2.html");
		
		
		
		
		
	}

}
