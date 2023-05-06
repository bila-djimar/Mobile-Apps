package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPannonceaux extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pannonceaux);

		WebView webViewPanonceaux= (WebView)findViewById(R.id.webViewPanonceaux);
    	webViewPanonceaux.loadUrl("file:///android_asset/panneauxhtml/Panonceaux.html");

		
		
		
		
		
		
		
	}

}
