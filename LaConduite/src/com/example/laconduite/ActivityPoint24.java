package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPoint24 extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point24);


		WebView webViewverPoint24 = (WebView)findViewById(R.id.webViewa24);
		webViewverPoint24.loadUrl("file:///android_asset/pointhtml/a24.html");
		
		
		
		
	}

}
