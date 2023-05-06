package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignalisationTemporaire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signalisation_temporaire);

		WebView webViewTemporaire= (WebView)findViewById(R.id.webViewSignalisatiotemporaire);
    	webViewTemporaire.loadUrl("file:///android_asset/panneauxhtml/Temporaire.html");


		
		
		
		
	}

}
