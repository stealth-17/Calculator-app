package com.stealth.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends Activity{

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		WebView wv = new WebView(this);
		setContentView(wv);
		wv.loadUrl("file:///android_asset/about.html");
		
		
	}
}
