
package com.mutali.phase;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.support.v7.app.*;
import android.text.*;
import android.text.style.*;
import android.graphics.*;
import android.view.*;
import android.content.res.*;

import android.support.v4.app.*;
import android.annotation.*;
public class ActivityC extends AppCompatActivity
{  private TextView title,infoTxt;
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		// TODO: Implement this method.

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_c);

		title = (TextView) findViewById(R.id.activity_cTitle);
		infoTxt = (TextView) findViewById(R.id.activityc_track);
		
String info="";
		int viewOrient=ActivityC.this.getResources().getConfiguration().orientation;

		if (Configuration.ORIENTATION_LANDSCAPE==viewOrient){
	
			info="\n\tTrack: Android"
				+"\n\tCountry: South Africa"+
				"\n\tEmail: mutali.nepfumbada@gmail.com"+
				"\n\tPhone Number: 0768249462"+
				"\n\tSlack Username: @Mutali Nepfumbada\n";
}

else{
	 info= "\n\tTrack: Android"
		+"\n\n\tCountry: South Africa"+
		"\n\n\tEmail: mutali.nepfumbada@gmail.com"+
		"\n\n\tPhone Number: 0768249462"+
		"\n\n\tSlack Username: @Mutali Nepfumbada\n";
}

		

		infoTxt.setText(info);
		
		title.setText("\t\t\t\t\t\t"+getString(R.string.name)+"\t\t\t\t\t\t");

		
	}
}
	
