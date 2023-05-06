package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignauxObligation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signaux_obligation);


		WebView webViewverobligation = (WebView)findViewById(R.id.webViewobligation);
    	webViewverobligation.loadUrl("file:///android_asset/panneauxhtml/obligation.html");
		
		
		
		
		
	}

}
