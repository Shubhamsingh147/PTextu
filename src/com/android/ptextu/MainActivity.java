package com.android.ptextu;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ptextu.R;

public class MainActivity extends Activity implements OnClickListener {
	String finalString="";
	EditText et;
	TextView txt;
	public void onCreate(Bundle AddingNames) {
		// TODO Auto generated method stub
		super.onCreate(AddingNames);
		setContentView(R.layout.activity_main);
		et = (EditText) findViewById(R.id.et);
		txt= (TextView) findViewById(R.id.txt);
		et.addTextChangedListener(watcher);
		
	}
	TextWatcher watcher= new TextWatcher() {
		
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count) {
			// TODO Auto-generated method stub
			
			txt.setText(s);
		}
		
		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			
		}
	};
	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

	
}
