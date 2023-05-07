package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityOrthosiphon extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orthosiphon);


		WebView webViewverAildesOur = (WebView)findViewById(R.id.webViewOrthosiphon);
		webViewverAildesOur.loadUrl("file:///android_asset/troublesurinairehtml/Orthosiphon.html");
		
		
		
		
		
	}

}
