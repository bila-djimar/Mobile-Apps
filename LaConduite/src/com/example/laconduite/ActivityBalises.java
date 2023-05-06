package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityBalises extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_balises);

		WebView webViewbalise= (WebView)findViewById(R.id.webViewBalise);
    	webViewbalise.loadUrl("file:///android_asset/panneauxhtml/balise.html");

		
		
		
		
		
		
	}

}
