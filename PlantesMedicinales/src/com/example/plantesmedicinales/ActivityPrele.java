package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPrele extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prele);



		WebView webViewverPrele = (WebView)findViewById(R.id.webViewPrele);
		webViewverPrele.loadUrl("file:///android_asset/troublesurinairehtml/Prele.html");
		
		
		
		
	}

}
