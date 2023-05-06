package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPanneauLocalisation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_panneau_localisation);


		WebView webViewLocalisation= (WebView)findViewById(R.id.webViewLocalisation);
		webViewLocalisation.loadUrl("file:///android_asset/panneauxhtml/Localisation.html");
		
		
		
	}

}
