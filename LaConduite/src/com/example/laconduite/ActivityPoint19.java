package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint19 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point19);


		WebView webViewverPoint19 = (WebView)findViewById(R.id.webViewa19);
		webViewverPoint19.loadUrl("file:///android_asset/pointhtml/a19.html");
		
		
		
		
		
	}

}
