package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityFenugrec extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fenugrec);

		WebView webViewFenugrec = (WebView)findViewById(R.id.webViewFenugrec);
		webViewFenugrec.loadUrl("file:///android_asset/troubledigestiontransithtml/Fenugrec.html");

	}

}
