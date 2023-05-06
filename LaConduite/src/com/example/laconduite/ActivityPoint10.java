package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint10 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point10);

		WebView webViewverPoint10 = (WebView)findViewById(R.id.webViewa10);
		webViewverPoint10.loadUrl("file:///android_asset/pointhtml/a10.html");

		
		
		
		
	}

}
