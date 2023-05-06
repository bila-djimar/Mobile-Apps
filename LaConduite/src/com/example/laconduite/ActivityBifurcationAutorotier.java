package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityBifurcationAutorotier extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bifurcation_autorotier);

		WebView webViewbiffurcation = (WebView)findViewById(R.id.webViewbifurcation);
		webViewbiffurcation.loadUrl("file:///android_asset/panneauxhtml/bifurcation.html");

		
		
		
		
	}

}
