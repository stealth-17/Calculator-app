package com.stealth.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Calculator extends Activity {
	
	
	TextView disp;
	TextView note;
	TextView note1;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button zero;
	Button point;
	Button ans;
	Button memin;
	Button memout;
	Button plus;
	Button minus;
	Button into;
	Button div;
	Button sum; 
	Button back; 
	Button clear;
	Button sb;
	Button eb;
	Button mod;
	Intent data;
	String expr="";
	String result="";
	String mem="";
	String answer;
	LinearLayout l1;
	LinearLayout l2;
	int n;
	
	Global var = new Global();
	BracketHandler bh = new BracketHandler();
	SolveScientific ss= new SolveScientific();
	
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		
		
		disp = (TextView)findViewById(R.id.display);
		note = (TextView)findViewById(R.id.notification);
		one = (Button)findViewById(R.id.one);
		two = (Button)findViewById(R.id.two);
		three = (Button)findViewById(R.id.three);
		four = (Button)findViewById(R.id.four);
		five = (Button)findViewById(R.id.five);
		six = (Button)findViewById(R.id.six);
		seven = (Button)findViewById(R.id.seven);
		eight = (Button)findViewById(R.id.eight);
		nine = (Button)findViewById(R.id.nine);
		zero = (Button)findViewById(R.id.zero);
		point = (Button)findViewById(R.id.point);
		mod = (Button)findViewById(R.id.mod);
		memin = (Button)findViewById(R.id.memin);
		memout = (Button)findViewById(R.id.memout);
		plus = (Button)findViewById(R.id.plus);
		minus = (Button)findViewById(R.id.minus);
		into = (Button)findViewById(R.id.into);
		ans = (Button)findViewById(R.id.ans);
		div = (Button)findViewById(R.id.div);
		sum = (Button)findViewById(R.id.sum);
		back = (Button)findViewById(R.id.back);
		clear = (Button)findViewById(R.id.clear);
		sb = (Button)findViewById(R.id.sb);
		eb = (Button)findViewById(R.id.eb);
		note1 = (TextView)findViewById(R.id.notification1);
		l1 = (LinearLayout) findViewById(R.id.layout8);
		l2 = (LinearLayout) findViewById(R.id.layout9);
		
		
		disp.setTextSize(25);
		Global.setSum(0);
		try{
		answer = Global.getAns();
		}catch(Exception e){
			answer="0";
		}
		int drg;
		try{
			drg= Global.checkDRG();
			if(drg!=1||drg!=-1)
				drg=-1;
		}catch(Exception e){
			drg=-1;
		}
		
		one.setBackgroundResource(R.drawable.keypad1);
		two.setBackgroundResource(R.drawable.keypad1);
		three.setBackgroundResource(R.drawable.keypad1);
		four.setBackgroundResource(R.drawable.keypad1);
		five.setBackgroundResource(R.drawable.keypad1);
		six.setBackgroundResource(R.drawable.keypad1);
		seven.setBackgroundResource(R.drawable.keypad1);
		eight.setBackgroundResource(R.drawable.keypad1);
		nine.setBackgroundResource(R.drawable.keypad1);
		zero.setBackgroundResource(R.drawable.keypad1);
		point.setBackgroundResource(R.drawable.keypad1);
		sum.setBackgroundResource(R.drawable.keypad1);
	
		sb.setBackgroundResource(R.drawable.keypadother1);
		eb.setBackgroundResource(R.drawable.keypadother1);
		memin.setBackgroundResource(R.drawable.keypadother1);
		memout.setBackgroundResource(R.drawable.keypadother1);
		mod.setBackgroundResource(R.drawable.keypadother1);
		plus.setBackgroundResource(R.drawable.keypadother1);
		minus.setBackgroundResource(R.drawable.keypadother1);
		ans.setBackgroundResource(R.drawable.keypadother1);
		into.setBackgroundResource(R.drawable.keypadother1);
		div.setBackgroundResource(R.drawable.keypadother1);
		
		clear.setBackgroundResource(R.drawable.clearback);
		back.setBackgroundResource(R.drawable.clearback);
		
		disp.setBackgroundResource(R.drawable.inputview1);
		l1.setBackgroundResource(R.drawable.inputview1);
		l2.setBackgroundResource(R.drawable.inputview1);
		
		
		if(drg==1)
			note1.setText("R");
		else
			note1.setText("D");
	
		try{
		expr = Global.getVar();
		}catch(Exception e){
		expr="";
		}
		
		n=expr.length();
		
		if(expr=="" || expr == null)
		{
			disp.setText("0");
			expr="";
		}
		else if(n>=22)
			disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
		else
			disp.setText(expr);
		
		
		one.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"1";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else 
							disp.setText(expr);
						
					}
				});
		
		two.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"2";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});

		three.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"3";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		four.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"4";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		five.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"5";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		six.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"6";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		seven.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"7";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		eight.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"8";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		nine.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"9";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		zero.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						if(expr!="")
						{	
						expr=expr+"0";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						}
					}
				});
		
		sb.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith(")")||expr.endsWith("%")||expr=="")
							expr=expr+"(";
						else
							expr=expr+"x(";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else if(expr!="")
							disp.setText(expr);
						
					}
				});
		
		eb.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						if(expr.endsWith("^")|| expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("("))
						{
							
						}
						else if(bh.checkBracket(expr))
						{
							expr=expr+")";
						}
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else if(expr!="")
							disp.setText(expr);
						else
							disp.setText("0");

					}
				});
		
		ans.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				if(expr.endsWith("^")||expr.endsWith("√")||expr.endsWith("x")||expr.endsWith("^")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
					expr=expr+"Ans";
				else
					expr=expr+"xAns";
				n=expr.length();
				if(n>=22)
					disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
				else
					disp.setText(expr);
			}
		});
		
		mod.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				n=expr.length();
				if(expr.endsWith("^")|| expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr=="")
				{
				}
				else
					expr=expr+"%";
				if(n>=22)
					disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
				else if(expr!="")
						disp.setText(expr);
				else
					disp.setText("0");
				
			}
		});
		
		plus.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"+";
						if(expr=="++")
							expr="+";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		minus.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr=expr+"-";
						if(expr=="--")
							expr="-";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else
							disp.setText(expr);
						
					}
				});
		
		into.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						if(expr.endsWith("^")|| expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr=="")
						{
							
						}
						else
							expr=expr+"x";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else if(expr!="")
							disp.setText(expr);
						else
							disp.setText("0");
	 		
					}
				});
		
		div.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						if(expr.endsWith("^")|| expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr=="")
						{
							
						}
						else
							expr=expr+"÷";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else if(expr!="")
								disp.setText(expr);
						else
							disp.setText("0");
					}
				});
		
		point.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						if(expr==""||expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("%")||expr.endsWith("÷")
								||expr.endsWith("sin(")||expr.endsWith("cos(")||expr.endsWith("tan(")||
										expr.endsWith("sinh(")||expr.endsWith("cosh(")||expr.endsWith("tanh(")||
											expr.endsWith("sin-1(")||expr.endsWith("cos-1(")||expr.endsWith("tan-1(")||
												expr.endsWith("log(")||expr.endsWith("ln(")||expr.endsWith("e(")||expr.endsWith("("))
						{
							expr=expr+"0.";
						}
						else if(expr.endsWith(".")||expr.endsWith("Ans")||expr.endsWith(")"))
						{
						}
						else
						 expr=expr+".";
						n=expr.length();
						if(n>=22)
							disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
						else if(expr!="")
							disp.setText(expr);
						
					}
				});
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				n=expr.length();
				if(expr.endsWith("sin(") || expr.endsWith("cos(") || expr.endsWith("tan(") || expr.endsWith("log("))
				{		
					expr=expr.substring(0, expr.length()-4);
					if(expr.length()==0)
					{
						disp.setText("0");
						expr="";
					}
					else
						disp.setText(expr);
				}
				else if(expr.endsWith("sinh(")||expr.endsWith("cosh(")||expr.endsWith("tanh("))
				{
					expr=expr.substring(0, expr.length()-5);
					if(expr.length()==0)
					{
						disp.setText("0");
						expr="";
					}
					else
						disp.setText(expr);
				}
				else if(expr.endsWith("sin-1(")||expr.endsWith("cos-1(")||expr.endsWith("tan-1("))
				{
					expr=expr.substring(0, expr.length()-6);
					if(expr.length()==0)
					{
						disp.setText("0");
						expr="";
					}
					else
						disp.setText(expr);
				}
				else if(expr.endsWith("Ans")||expr.endsWith("ln("))
				{
					expr=expr.substring(0, expr.length()-3);
					if(expr.length()==0)
					{
						disp.setText("0");
						expr="";
					}
					else
						disp.setText(expr);
				}
				else if(expr=="Error")
				{
					expr="";
					disp.setText("0");
				}
				else
				{
					if(expr!="0" && expr.length()>1)
					{
						expr=expr.substring(0,expr.length()-1);
						disp.setText(expr);
					}
					else
					{
						disp.setText("0");
						expr="";
					}
				}
				Global.setVar(expr);
			}
		});	
		
		clear.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						expr="";
						disp.setText("0");
						Global.setVar(expr);
					}
				});
		
		memin.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						if(expr!="")
							mem = expr;
						else
							mem=answer;
						note.setText("M");
					}
				});
		
		memout.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						n=expr.length();
						if(mem.length()>=1 && mem !="0")
						{
							expr = mem;
							disp.setText(expr);
						}
						else
						{
							disp.setText("0");
							expr="";
						}
			
					}
				});
		sum.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try
				{
					if(expr=="")
						expr="0";
					expr=ss.solveScientific(expr.replace("π",String.valueOf(Math.PI)).replace("Ans", answer));
					
					answer=expr.replace("E", "x10^");
					try{
					if(expr.substring(0, expr.indexOf('.')).length()>3 || expr.endsWith(".0"))
						expr = expr.substring(0, expr.indexOf('.'));;
					}catch(Exception e){}
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else
						disp.setText(expr);
						Global.setAns(answer);
				}
				catch(Exception e)
				{
					disp.setText("Error");
				}
				Global.setVar(expr);
				expr="";
			}
		});
	
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_calculator, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		super.onOptionsItemSelected(item);
		int id = item.getItemId();
		switch(id)
		{
		case R.id.advanced:
							Intent advanced = new Intent(this, Advanced.class);
							Global.setAns(answer);
							if(expr!="")
								Global.setVar(expr);
							startActivity(advanced);
							finish();
							break;
		case R.id.about:
							startActivity(new Intent(this,About.class));
							break;
		case R.id.exit:
							Global.setAns("");
							Global.setSum(0);
							Global.setVar("");
							finish();
							break;
		}
		return false;

	}

}
