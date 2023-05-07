package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPersil extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_persil);



		WebView webViewverMyrtille = (WebView)findViewById(R.id.webViewMyrtille);
		webViewverMyrtille.loadUrl("file:///android_asset/troublesfemininshtml/Myrtille.html");
		
		
		
	}

}
