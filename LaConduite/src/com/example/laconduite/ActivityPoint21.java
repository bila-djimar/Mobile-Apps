package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint21 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point21);

		WebView webViewverPoint21 = (WebView)findViewById(R.id.webViewa21);
		webViewverPoint21.loadUrl("file:///android_asset/pointhtml/a21.html");
		

		
		
	}

}
