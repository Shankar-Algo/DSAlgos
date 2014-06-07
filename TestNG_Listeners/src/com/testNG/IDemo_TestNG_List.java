package com.testNG;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class IDemo_TestNG_List implements ISuiteListener
{

	IDemo_TestNG_List_Class obj;
	@Override
	public void onFinish(ISuite arg0) 
	{
		if(obj==null)
			obj = new IDemo_TestNG_List_Class(arg0);
		//obj.get_curr_inv_cnt_m();
		//obj.get_inv_cnt_m();
		obj.get_par_inv_cnt_m();
	}

	@Override
	public void onStart(ISuite arg0) 
	{
		// TODO Auto-generated method stub
		obj = new IDemo_TestNG_List_Class(arg0);
		//obj.missing_Gr();
		//obj.depends_method();
		//obj.parameter_m();
		//obj.desc_m();
		//obj.inc_curr_inv_cnt_m();
		//obj.inc_inv_cnt_m();
		//obj.inc_par_inv_cnt_m();
		obj.set_setInvocationNumbers();
		
	}

	
}
