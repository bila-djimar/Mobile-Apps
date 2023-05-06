package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignauxDirection extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signaux_direction);

		 WebView webViewsignauxdirection = (WebView)findViewById(R.id.webViewsignauxdirection);
	    webViewsignauxdirection.loadUrl("file:///android_asset/panneauxhtml/signauxdirection.html");

		
		
		
		
		
		
	}

}
