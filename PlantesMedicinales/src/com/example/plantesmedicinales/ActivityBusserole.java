package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityBusserole extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_busserole);

		WebView webViewverAildesOur = (WebView)findViewById(R.id.webViewbusserole);
		webViewverAildesOur.loadUrl("file:///android_asset/troublesurinairehtml/busserole.html");

		
		
		
	}

}
