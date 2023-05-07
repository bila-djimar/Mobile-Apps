package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityKonjac extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_konjac);

		WebView webViewverAildesOur = (WebView)findViewById(R.id.webViewKonjac);
		webViewverAildesOur.loadUrl("file:///android_asset/minceurhtml/Konjac.html");

		
		
		
		
		
		
	}

}
