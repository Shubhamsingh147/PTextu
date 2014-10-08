package com.android.Ptextu;


import com.example.ptextu.R;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	EditText et;
	TextView txt;
	public void onCreate(Bundle AddingNames) {
		// TODO Auto generated method stub
		super.onCreate(AddingNames);
		setContentView(R.layout.activity_main);
		et = (EditText) findViewById(R.id.et);
		txt= (TextView) findViewById(R.id.txt);
	}
	
	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

	
}
