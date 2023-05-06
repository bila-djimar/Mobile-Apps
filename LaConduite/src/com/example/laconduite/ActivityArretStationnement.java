package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityArretStationnement extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arret_stationnement);


		WebView webViewverArretStationnement = (WebView)findViewById(R.id.webViewArretStationnement);
    	webViewverArretStationnement.loadUrl("file:///android_asset/panneauxhtml/ArretStationnement.html");

		
		
	}

}
