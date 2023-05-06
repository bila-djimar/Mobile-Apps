package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignalisationInterdictionZone extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signalisation_interdiction_zone);


		WebView webViewverSignauxIntediction = (WebView)findViewById(R.id.webViewSignauxIntediction);
    	webViewverSignauxIntediction.loadUrl("file:///android_asset/panneauxhtml/SignauxIntediction.html");
		
		
		
		
		
		
		
	}

}
