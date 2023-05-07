package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPissenlit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pissenlit);


		WebView webViewverPissenlit = (WebView)findViewById(R.id.webViewPissenlit);
		webViewverPissenlit.loadUrl("file:///android_asset/troublesurinairehtml/Pissenlit.html");
		
		
		
	}

}
