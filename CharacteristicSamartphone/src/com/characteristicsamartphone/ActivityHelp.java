package com.characteristicsamartphone;



import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityHelp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);

		WebView help = (WebView)findViewById(R.id.webView1);
		help.loadUrl("file:///android_asset/help.html");
	}

}
