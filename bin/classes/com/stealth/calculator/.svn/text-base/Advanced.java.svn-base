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
import android.widget.Toast;

public class Advanced extends Activity {
	
	
		String expr="";
		String result="";
		String mem="";
		
		
		public TextView disp;
		TextView note1;
		Button back;
		Button clear;
		Button sin;
		Button cos;
		Button tan;
		Button DRG;
		Button sinh;
		Button cosh;
		Button tanh;
		Button exp;
		Button invsin;
		Button invcos;
		Button invtan;
		Button ln;
		Button sqrt;
		Button sqr;
		Button log;
		Button fact;
		Button pwr;
		Button pi;
		Button ans;
		Button sum1;
		Button sb1;
		Button eb1;
		Button basic;
		int n;
		LinearLayout l1;
		LinearLayout l2;
		BracketHandler bh = new BracketHandler();
		Global var =  new Global();
		SolveScientific ss = new SolveScientific();
	
		String answer;
		int drg;
		
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.advanced_calculator);
			
			
			
			sin = (Button)findViewById(R.id.sin);
			cos = (Button)findViewById(R.id.cos);
			tan = (Button)findViewById(R.id.tan);
			DRG = (Button)findViewById(R.id.DRG);
			sinh = (Button)findViewById(R.id.sinh);
			cosh = (Button)findViewById(R.id.cosh);
			tanh = (Button)findViewById(R.id.tanh);
			exp = (Button)findViewById(R.id.exp);
			invsin = (Button)findViewById(R.id.invsin);
			invcos = (Button)findViewById(R.id.invcos);
			invtan = (Button)findViewById(R.id.invtan);
			ln = (Button)findViewById(R.id.ln);
			log = (Button)findViewById(R.id.log);
			sqrt = (Button)findViewById(R.id.sqrt);
			sqr = (Button)findViewById(R.id.sqr);
			fact = (Button)findViewById(R.id.fact);
			pwr = (Button)findViewById(R.id.pwr);
			ans = (Button)findViewById(R.id.ans);
			pi = (Button)findViewById(R.id.pi);
			note1 = (TextView)findViewById(R.id.notification1);
			disp = (TextView)findViewById(R.id.display);
			sum1 = (Button)findViewById(R.id.sum1);
			back = (Button)findViewById(R.id.back);
			sb1 = (Button)findViewById(R.id.sb1);
			eb1 = (Button)findViewById(R.id.eb1);
			basic = (Button)findViewById(R.id.basic);
			clear = (Button)findViewById(R.id.clear);
			l1 = (LinearLayout)findViewById(R.id.layout8);
			l2 = (LinearLayout)findViewById(R.id.layout9);
			
			disp.setBackgroundResource(R.drawable.inputview1);
			l1.setBackgroundResource(R.drawable.inputview1);
			l2.setBackgroundResource(R.drawable.inputview1);
			
			back.setBackgroundResource(R.drawable.clearback);
			clear.setBackgroundResource(R.drawable.clearback);
			
			ans.setBackgroundResource(R.drawable.keypadother1);
			sb1.setBackgroundResource(R.drawable.keypadother1);
			eb1.setBackgroundResource(R.drawable.keypadother1);
			sqr.setBackgroundResource(R.drawable.keypadother1);
			
			sqrt.setBackgroundResource(R.drawable.keypad1);
			sin.setBackgroundResource(R.drawable.keypad1);
			cos.setBackgroundResource(R.drawable.keypad1);
			tan.setBackgroundResource(R.drawable.keypad1);
			invsin.setBackgroundResource(R.drawable.keypad1);
			invcos.setBackgroundResource(R.drawable.keypad1);
			invtan.setBackgroundResource(R.drawable.keypad1);
			sinh.setBackgroundResource(R.drawable.keypad1);
			cosh.setBackgroundResource(R.drawable.keypad1);
			tanh.setBackgroundResource(R.drawable.keypad1);
			log.setBackgroundResource(R.drawable.keypad1);
			exp.setBackgroundResource(R.drawable.keypad1);
			pi.setBackgroundResource(R.drawable.keypad1);
			ln.setBackgroundResource(R.drawable.keypad1);
			fact.setBackgroundResource(R.drawable.keypad1);
			pwr.setBackgroundResource(R.drawable.keypad1);
			sum1.setBackgroundResource(R.drawable.keypad1);
			DRG.setBackgroundResource(R.drawable.keypad1);
				
		
			try{
				drg=Global.checkDRG();
				if(drg!=1||drg!=-1)
					drg=-1;
			}catch(Exception e){
				drg=-1;
			}
			
			if(drg==-1)
				note1.setText("D");
			
			disp.setTextSize(25);
			try{
				expr = Global.getVar();
			}catch(Exception e){
				expr="";
			}
			try{
			answer = Global.getAns();
			}catch(Exception e){
				answer="0";
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
			
			
			sin.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"sin(";
					else
						expr=expr+"xsin(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				
				}
			});
			
			cos.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"cos(";
					else
						expr=expr+"xcos(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);			
				}
			});
			
			tan.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"tan(";
					else
						expr=expr+"xtan(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);	
				}
			});
			
			sinh.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"sinh(";
					else
						expr=expr+"xsinh(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);	
				}
			});
			
			cosh.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"cosh(";
					else
						expr=expr+"xcosh(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				}
			});
			
			tanh.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"tanh(";
					else
						expr=expr+"xtanh(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				}
			});
			
			invsin.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"sin-1(";
					else
						expr=expr+"xsin-1(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				}
			});
			
			invcos.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"cos-1(";
					else
						expr=expr+"xcos-1(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				}
			});
			
			invtan.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"tan-1(";
					else
						expr=expr+"xtan-1(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				}
			});
			
			DRG.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					drg=-drg;
					Global.setDRG(drg);
					if(drg==1)
						note1.setText("R");
					else if(drg==-1)
						note1.setText("D");
				}
			});
			
			exp.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"e(";
					else
						expr=expr+"xe(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				}
			});
			
			ln.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"ln(";
					else
						expr=expr+"xln(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				
				}
			});
			
			sqrt.setOnClickListener(
					new View.OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
								expr=expr+"√";
							else
								expr=expr+"x√";
							if(n>=22)
								disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
							else if(expr!="")
								disp.setText(expr);
						}
					});
			
			sqr.setOnClickListener(
					new View.OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr.endsWith("√")||expr=="")
								expr=expr+"X";
							else
								expr=expr+"xX";
							n=expr.length();
							if(n>=22)
								disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
							else if(expr!="")
								disp.setText(expr);
						}
					});
			
			log.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"log(";
					else
						expr=expr+"xlog(";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
					
				}
			});
			
			fact.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					n=expr.length();
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("^")||expr=="")
					{
						
					}
					else
						expr=expr+"!";
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
					else
						disp.setText("0");
				}
			});
			
			pwr.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					n=expr.length();
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("^")||expr=="")
					{
						
					}
					else
						expr=expr+"^";
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
					else
						disp.setText("0");
				}
			});
			
			pi.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"π";
					else
						expr=expr+"xπ";
					n=expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
		
				}
			});
			
			sb1.setOnClickListener(
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
			
			eb1.setOnClickListener(
					new View.OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							n=expr.length();
							if(expr=="" || expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("^"))
							{
								
							}
							else if(bh.checkBracket(expr))
								expr=expr+")";
							if(n>=22)
								disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
							else if(expr!="")
								disp.setText(expr);
							else
								disp.setText("0");
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
			
			back.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
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
		
			ans.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if(expr.endsWith("^")||expr.endsWith("√")||expr.endsWith("x")||expr.endsWith("+")||expr.endsWith("-")||expr.endsWith("÷")||expr.endsWith("(")||expr.endsWith("%")||expr=="")
						expr=expr+"Ans";
					else
						expr=expr+"xAns";
					expr.length();
					if(n>=22)
						disp.setText(expr.substring(0,n-22)+'\n'+expr.substring(n-22));
					else if(expr!="")
						disp.setText(expr);
				}
			});
			
			sum1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					try
					{
						if(expr=="")
							expr="0";
						expr=ss.solveScientific(expr.replace("π",String.valueOf(Math.PI)).replace("Ans", answer));
						answer=expr;
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
			getMenuInflater().inflate(R.menu.advanced_calculator, menu);
			return true;
		}
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item)
		{
			super.onOptionsItemSelected(item);
			int id = item.getItemId();
			switch(id)
			{
			case R.id.basic:
								Intent basic = new Intent(this, Calculator.class);
								if(expr!="")
									Global.setVar(expr);
								Global.setAns(answer);
								Global.setDRG(drg);
								startActivity(basic);
								finish();
								break;
			case R.id.plot:
								try
								{
									Intent graphPlotter = new Intent(this, Variable.class);
									Global.setVar(expr);
									startActivity(graphPlotter);
									expr="";
									disp.setText("0");
								}
								catch(Exception e)
								{
									Toast.makeText(Advanced.this, "Error in plotting!", Toast.LENGTH_LONG).show();
								}
								break;
			case R.id.help: 
								startActivity(new Intent(this,Help.class));
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
