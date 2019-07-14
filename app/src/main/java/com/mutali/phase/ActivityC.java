
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
{  private TextView title,track,country,email,phone,slack;
	private String named="";
	private SpannableString tdata;


	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		// TODO: Implement this method.

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_c);

		title = (TextView) findViewById(R.id.activity_cTitle);
		track = (TextView) findViewById(R.id.activityc_track);
		country = (TextView) findViewById(R.id.activityc_country);
		email = (TextView) findViewById(R.id.activityc_email);
		phone = (TextView) findViewById(R.id.activityc_phone);
		slack = (TextView) findViewById(R.id.activityc_slackusername);


		int orientation= ActivityC.this.getResources().getConfiguration().orientation;

		if (Configuration.ORIENTATION_LANDSCAPE == orientation)
		{
			named = "ccccccccccccccccccccccccccccccccccc" + getString(R.string.name) + "cccccccccccccccccccccccccccccccccc";
			tdata = new SpannableString(named.replace("c", " "));

		}
		else
		{
			named = "cccccccccc" + getString(R.string.name) + "cccccccccc";
			tdata = new SpannableString(named.replace("c", " "));
		}

		String strTrack= "Track: Android";
		String strcountry= "Country: South Africa";
		String strEmail= "Email: mutali.nepfumbada@gmail.com";
		String strPhone= "Phone Number: 0768249462";
		String strSlack= "Slack Username: @Mutali Nepfumbada";


		tdata.setSpan(new UnderlineSpan(), 0, named.length(), 0);

		track.setText(strTrack);
		country.setText(strcountry);
		email.setText(strEmail);
		phone.setText(strPhone);
		slack.setText(strSlack);



		title.setText(tdata);

		;
	}
}
	
