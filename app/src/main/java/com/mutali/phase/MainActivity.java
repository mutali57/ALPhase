package com.mutali.phase;

import android.app.*;
import android.view.View.OnClickListener;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.support.v7.app.*;
import android.support.constraint.ConstraintLayout;



public class MainActivity extends AppCompatActivity implements OnClickListener
{
	
	private Button butt1;
	private Button butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {final ProgressDialog progD=new ProgressDialog(this);
	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		progD.setMessage("Loading Page...");
	    progD.setCancelable(false);
		butt1= (Button) findViewById(R.id.mainButton1);
		butt2=(Button) findViewById(R.id.mainButton2);
		butt1.setOnClickListener(this);
		butt2.setOnClickListener(this);
		
		
		
    }

	@Override
	public void onClick(View v)
	{
		switch(v.getId()){
			
			case R.id.mainButton1:
				
			Intent intent1= new Intent(this,ActivityB.class);
			startActivity(intent1);
			
			
				
				break;
				
			case R.id.mainButton2:
				Intent intent2= new Intent(this,ActivityC.class);
				startActivity(intent2);
				
				
				break;
				
			
		}
		
		// TODO: Implement this method
	}

	
}
