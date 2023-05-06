package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point3);


		WebView webViewverPoint3 = (WebView)findViewById(R.id.webViewa3);
		webViewverPoint3.loadUrl("file:///android_asset/pointhtml/a3.html");
		
		
		
		
	}

}
