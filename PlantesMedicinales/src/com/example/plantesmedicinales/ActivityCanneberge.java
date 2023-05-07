package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityCanneberge extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_canneberge);


		WebView webViewverAildesOur = (WebView)findViewById(R.id.webViewCanneberge);
		webViewverAildesOur.loadUrl("file:///android_asset/troublesurinairehtml/canneberge.html");
		
		
	}

}
