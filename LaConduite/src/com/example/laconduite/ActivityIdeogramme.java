package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityIdeogramme extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ideogramme);

		WebView webViewIdeogramme= (WebView)findViewById(R.id.webViewIdeogramme);
		webViewIdeogramme.loadUrl("file:///android_asset/panneauxhtml/Ideomgramme.html");


		
		
		
		
		
		
	}

}
