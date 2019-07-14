package com.mutali.phase;
import android.app.*;
import android.os.*;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.support.v7.app.*;
import android.webkit.*;
import android.net.http.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class ActivityB extends AppCompatActivity
{
	private WebView web;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
		final ProgressDialog progD= new ProgressDialog(this);
		WebView web= (WebView) findViewById(R.id.activitybWebView1);
	    progD.setMessage("Loading Andela...");

	    progD.setCancelable(false);
		 web.setInitialScale(getScalenum());
		WebSettings webSetting=web.getSettings();
		web.requestFocus();
		webSetting.setLightTouchEnabled(true);
		webSetting.setJavaScriptEnabled(true);
		webSetting.setGeolocationEnabled(true);
		web.setSoundEffectsEnabled(true);
		webSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
		webSetting.setUseWideViewPort(true);
		webSetting.setLoadWithOverviewMode(true);
		webSetting.setUseWideViewPort(true);
		
		webSetting.setUseWideViewPort(true);
	    web.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
		web.setScrollbarFadingEnabled(false);
		

		
		web.setWebViewClient(new WebViewClient(){
			@Override
		public void	onReceivedError(WebView web,int error,String des,String urlfail){
				
			}
			@Override
		public void onReceivedSslError(WebView web,SslErrorHandler handler, SslError error){
				handler.proceed();
			}
		});
		web.loadUrl("https://www.andela.com/alc/");
		web.setWebChromeClient(new WebChromeClient(){
			@Override
			public void onProgressChanged(WebView web, int progress){
				
				//Toast.makeText(getApplicationContext(),""+progress,Toast.LENGTH_SHORT).show();
				if (progress <100){
					
					progD.show();
				}
				
					
					
					if(progress==100){
					
					progD.dismiss();
					
				}
				
			}
		});
		
		
		
	
	}
	
	
	public int getScalenum(){
		Display dis= ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
		int w=dis.getWidth();
		Double val=new Double(w/new Double(327));
		val=val*100d;
		return val.intValue();
	}
}
