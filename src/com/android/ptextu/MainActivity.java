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

public class MainActivity extends Activity{
	String finalString="";
	EditText et,et2,et3;
	TextView txt;
	public void onCreate(Bundle AddingNames) {
		// TODO Auto generated method stub
		super.onCreate(AddingNames);
		setContentView(R.layout.activity_main);
		et = (EditText) findViewById(R.id.et);
		et2 = (EditText) findViewById(R.id.et2);
		et3 = (EditText) findViewById(R.id.et3);
		txt= (TextView) findViewById(R.id.txt);
		et.addTextChangedListener(new GenericTextWatcher(et));
		et2.addTextChangedListener(new GenericTextWatcher(et2));
		et3.addTextChangedListener(new GenericTextWatcher(et3));
	}
	
	private class GenericTextWatcher implements TextWatcher{

	    private View view;
	    private GenericTextWatcher(View view) {
	        this.view = view;
	    }

	    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
	    public void afterTextChanged(Editable editable) {}
	    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
	    	  switch(view.getId()){
	            case R.id.et:
	                txt.setText(charSequence);
	                break;
	            case R.id.et2:
	                txt.setText(charSequence);
	                break;
	            case R.id.et3:
	                txt.setText(charSequence);
	                break;
	        }
	    }
	}
}
