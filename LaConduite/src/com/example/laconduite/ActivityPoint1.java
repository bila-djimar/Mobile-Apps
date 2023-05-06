package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point1);


		WebView webViewverPoint1 = (WebView)findViewById(R.id.webViewa1);
		webViewverPoint1.loadUrl("file:///android_asset/pointhtml/a1.html");
		
		
		
	}

}
