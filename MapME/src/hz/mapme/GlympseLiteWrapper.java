package hz.mapme;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import com.glympse.android.lite.GGlympseLite;
import com.glympse.android.lite.LiteFactory;
public class GlympseLiteWrapper
{
	 public static final String BASE_URL = "sandbox.glympse.com";
	 public static final String API_KEY = "<< Your API key >>";

	    private static GGlympseLite _glympse = null; 
public void start(Context context)
 {
 if ( null == _glympse )
 {
 _glympse = LiteFactory. createGlympse(context, BASE_URL, API_KEY); 
 _glympse. start();
 }
 }
	 public void stop()
 {
 if ( null != _glympse )
 {
 _glympse. stop();
 _glympse = null;
 }
 }
 public GGlympseLite getGlympse() { return _glympse; }
 private static GlympseLiteWrapper _instance;
 public static synchronized GlympseLiteWrapper instance()
 {
     if (null == _instance)
     {
         _instance = new GlympseLiteWrapper();
     }
     return _instance;
 } 
}