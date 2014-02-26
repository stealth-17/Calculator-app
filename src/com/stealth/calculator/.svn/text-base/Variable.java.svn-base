package com.stealth.calculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class Variable extends Activity{
	
	LayoutInflater layout;
	EditText begin,end,stp;
	
	double start,lim,step;
	String exp;
	Global g;
	int flag=0;
	AlertDialog dlg;
	


	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.variable);

		dlg = dialog(this);

	}
	
	public void ok(View view){
		

		begin = (EditText) findViewById(R.id.start);
		end = (EditText) findViewById(R.id.end);
		stp = (EditText) findViewById(R.id.step);
		
		start = Double.parseDouble(begin.getText().toString());
		lim = Double.parseDouble(end.getText().toString());
		step = Double.parseDouble(stp.getText().toString());
		
		Global.setstart(start);
		Global.setstep(step);
		Global.setend(lim);
		
		dlg.show();
		Intent in = new Intent(this, Plotter.class);
		startActivity(in);
		finish();
		
	}
	
	public void cancel(View view){
		
		exp=Global.getVar();
		  if(exp.indexOf("sin-1")!=-1||exp.indexOf("cos-1")!=-1)
	        {
	        	lim=1;
	        	step=0.1;
	        	start = -1;
	        }
	        else if(exp.indexOf("sin")!=-1||exp.indexOf("cos")!=-1||exp.indexOf("tan")!=-1
	        		||exp.indexOf("sinh")!=-1||exp.indexOf("cosh")!=-1||exp.indexOf("tanh")!=-1||exp.indexOf("tan-1")!=-1)
	        {
	        	lim=360;
	        	step=10;
	        	start=-360;
	        }
	        else if(exp.indexOf("log")!=-1||exp.indexOf("ln")!=-1)
	        {
	        	start=1;
	        	lim=50;
	        	step=2;
	        }
	        else if(exp.indexOf("√")!=-1)
	        {
	        	start=0;
	        	lim= 20;
	        	step=2;
	        }
	        else
	        {
	        	lim=8;
	        	step=1;
	        	start=-8;
	        }
		  
		  	Global.setstart(start);
			Global.setstep(step);
			Global.setend(lim);
	
			
			dlg.show();
			Intent in = new Intent(this, Plotter.class);
			startActivity(in);
			finish();
			
		
	}
	
	public AlertDialog dialog(Context context)
	{
		AlertDialog.Builder load = new AlertDialog.Builder(context);
		load.setTitle("Loading");
		load.setIcon(R.drawable.spinner);
		load.setMessage("Graph is Loading...");
		load.setCancelable(false);
		final AlertDialog dlg = load.create();
		return dlg;
	}

}
