package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignauxIndication extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signaux_indication);

		WebView webViewSignauxIndication = (WebView)findViewById(R.id.webViewSignauxIndication);
		webViewSignauxIndication.loadUrl("file:///android_asset/panneauxhtml/SignauxIndication.html");


		
		
		
		
	}

}
