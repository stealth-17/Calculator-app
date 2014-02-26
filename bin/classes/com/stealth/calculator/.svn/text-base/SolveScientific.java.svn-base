package com.stealth.calculator;

import java.text.DecimalFormat;

public class SolveScientific {
	
	
	public SolveScientific()
	{
		
	}
	
	DecimalFormat df = new DecimalFormat("#.#########");
	Infix2Postfix i2p = new Infix2Postfix();
	Evaluate eval = new Evaluate();
	Global val= new Global();
	BracketHandler bh = new BracketHandler();
	int drg;
	boolean error;
	String temp;
	
	public String solveScientific(String exp)
	{
		int sno,si;
		String exp1;
		drg=Global.checkDRG();
		exp=bh.putBracket(exp);
		while(exp.indexOf("sin(")!=-1)
		{
			si=exp.indexOf("sin(");
			sno=bh.solveBracket(si,exp);
			
			if(sno!=-1)
			{
				exp1=exp.substring(si+4,sno+si);
				if(drg==1)
					exp=exp.replace("sin("+exp1+")",String.valueOf(df.format(Math.sin(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("sin("+exp1+")",String.valueOf(df.format(Math.sin(Double.parseDouble(solveScientific(exp1))*Math.PI/180))));
			}
			else
			{
				return "Error";
			}
		
		}
		while(exp.indexOf("cos(")!=-1)
		{
			si=exp.indexOf("cos(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+4,sno+si);
				if(drg==1)
					exp=exp.replace("cos("+exp1+")",String.valueOf(df.format(Math.cos(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("cos("+exp1+")",String.valueOf(df.format(Math.cos(Double.parseDouble(solveScientific(exp1))*Math.PI/180))));
			}
			else
			{
				return "Error";
			}
			
		}
		while(exp.indexOf("tan(")!=-1)
		{
			if(exp.startsWith("+"))
			{	
				exp=exp.substring(1);
				exp="1x("+exp+")";
				
			}
			else if(exp.startsWith("-"))
			{	
				exp=exp.substring(1);
				exp="-1x("+exp+")";
				
			}
			si=exp.indexOf("tan(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+4,sno+si);
				temp=solveScientific(exp1);
				if(drg==1)
				{
					if(Double.parseDouble(temp)*2%Math.PI==0 && Double.parseDouble(temp)%Math.PI!=0)
						if(temp.startsWith("-"))
							exp=exp.replace("tan("+exp1+")", "n");
						else
							exp=exp.replace("tan("+exp1+")", "p");
					else
						exp=exp.replace("tan("+exp1+")",String.valueOf(df.format(Math.tan(Double.parseDouble(solveScientific(exp1))))));
				}
				else
				{
					if(Double.parseDouble(temp)%90==0 && Double.parseDouble(temp)%180!=0)
						if(temp.startsWith("-"))
							exp=exp.replace("tan("+exp1+")", "n");
						else
							exp=exp.replace("tan("+exp1+")", "p");
					else
						exp=exp.replace("tan("+exp1+")",String.valueOf(df.format(Math.tan(Double.parseDouble(solveScientific(exp1))*Math.PI/180))));
				}
			}
			else
			{
				return "Error";
			}
			
		}
		while(exp.indexOf("sinh(")!=-1)
		{
			si=exp.indexOf("sinh(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+5,sno+si);
				if(drg==1)
					exp=exp.replace("sinh("+exp1+")",String.valueOf(df.format(Math.sinh(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("sinh("+exp1+")",String.valueOf(df.format(Math.sinh(Double.parseDouble(solveScientific(exp1))*Math.PI/180))));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("cosh(")!=-1)
		{
			si=exp.indexOf("cosh(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+5,sno+si);
				if(drg==1)
					exp=exp.replace("cosh("+exp1+")",String.valueOf(df.format(Math.cosh(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("cosh("+exp1+")",String.valueOf(df.format(Math.cosh(Double.parseDouble(solveScientific(exp1))*Math.PI/180))));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("tanh(")!=-1)
		{
			si=exp.indexOf("tanh(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+5,sno+si);
				if(drg==1)
					exp=exp.replace("tanh("+exp1+")",String.valueOf(df.format(Math.tanh(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("tanh("+exp1+")",String.valueOf(df.format(Math.tanh(Double.parseDouble(solveScientific(exp1))*Math.PI/180))));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("log(")!=-1)
		{
			si=exp.indexOf("log(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+4,sno+si);
				temp=solveScientific(exp1);
				//exp=temp;
				if(Double.parseDouble(temp)==0.0)
					exp=exp.replace("log("+exp1+")","n");
				else
					exp=exp.replace("log("+exp1+")",String.valueOf(df.format(Math.log10(Double.parseDouble(solveScientific(exp1))))));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("ln(")!=-1)
		{
			si=exp.indexOf("ln(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+3,sno+si);
				temp=solveScientific(exp1);
				if(Double.parseDouble(temp)==0.0)
					exp=exp.replace("ln("+exp1+")","n");
				else
					exp=exp.replace("ln("+exp1+")",String.valueOf(df.format(Math.log(Double.parseDouble(solveScientific(exp1))))));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("e(")!=-1)
		{
			si=exp.indexOf("e(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+2,sno+si);
				exp=exp.replace("e("+exp1+")",String.valueOf(df.format(Math.exp(Double.parseDouble(solveScientific(exp1))))));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("sin-1(")!=-1)
		{
			si=exp.indexOf("sin-1(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+6,sno+si);
				if(drg==1)
					exp=exp.replace("sin-1("+exp1+")",String.valueOf(df.format(Math.asin(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("sin-1("+exp1+")",String.valueOf(df.format(Math.asin(Double.parseDouble(solveScientific(exp1)))*180/Math.PI)));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("cos-1(")!=-1)
		{
			si=exp.indexOf("cos-1(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+6,sno+si);
				if(drg==1)
					exp=exp.replace("cos-1("+exp1+")",String.valueOf(df.format(Math.acos(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("cos-1("+exp1+")",String.valueOf(df.format(Math.acos(Double.parseDouble(solveScientific(exp1)))*180/Math.PI)));
			}
			else
			{
				return "Error";
			}
		}
		while(exp.indexOf("tan-1(")!=-1)
		{
			si=exp.indexOf("tan-1(");
			sno=bh.solveBracket(si,exp);
			if(sno!=-1)
			{
				exp1=exp.substring(si+6,sno+si);
				if(drg==1)
					exp=exp.replace("tan-1("+exp1+")",String.valueOf(df.format(Math.atan(Double.parseDouble(solveScientific(exp1))))));
				else
					exp=exp.replace("tan-1("+exp1+")",String.valueOf(df.format(Math.atan(Double.parseDouble(solveScientific(exp1)))*180/Math.PI)));
			}
			else
			{
				return "Error";
			}
		} 
		
		exp=i2p.infix2postfix(exp);
		//return exp;
		exp=eval.evaluate(exp);
		return exp;
	
	}
	
}
