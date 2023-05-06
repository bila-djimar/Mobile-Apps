package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivitySignauxLumineux extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signaux_lumineux);


		WebView webViewLumineux= (WebView)findViewById(R.id.webViewLumineux);
        webViewLumineux.loadUrl("file:///android_asset/panneauxhtml/Lumineux.html");
		
		
		
		
	}

}
