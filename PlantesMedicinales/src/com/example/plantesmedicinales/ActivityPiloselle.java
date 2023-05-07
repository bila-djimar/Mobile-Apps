package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPiloselle extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_piloselle);



		WebView webViewverAildesOur = (WebView)findViewById(R.id.webViewPiloselle);
		webViewverAildesOur.loadUrl("file:///android_asset/troublesurinairehtml/Piloselle.html");
		
		
	}

}
