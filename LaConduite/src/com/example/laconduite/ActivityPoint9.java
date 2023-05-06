package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint9 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point9);


		WebView webViewverPoint9 = (WebView)findViewById(R.id.webViewa9);
		webViewverPoint9.loadUrl("file:///android_asset/pointhtml/a9.html");
		
		
		
		
	}

}
