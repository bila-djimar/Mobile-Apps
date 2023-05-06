package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignauxDanger extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signaux_danger);

		
		WebView webViewversignausDanger = (WebView)findViewById(R.id.webViewSignauxDanger);
		webViewversignausDanger.loadUrl("file:///android_asset/panneauxhtml/SignauxDanger.html");

		
		
		
		
		
	}

}
