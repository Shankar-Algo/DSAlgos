package com.basics.scjp.learn;

import java.util.HashMap;
import java.util.Map;

public class String_No_Space {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	
		String status ="Transaction Failed - License not generated.Please contact Brocade Support. The requested feature (DataFort Compatibility Mode) has already been generated for the unit you entered (10:00:00:05:33:1D:54:00). To activate this feature please add this license key (BALrSJtfNHEfPDHmt3a3XfRaXaXYArQGBA3SG) or navigate to the Unit License Query tool to check and access the existing licenses for this unit.";
		status=status.replaceAll("\n", "");
		status=status.replaceAll(" ","");
		
		int start=status.indexOf("key") + 4;
		
		//System.out.println(status.charAt(222) + "   "+status.charAt(224)+"   "+status.charAt(226));
		
		int end = status.indexOf("ornavi") - 1;
		
		//System.out.println(status.charAt(264) + "   "+status.charAt(262)+"   "+status.charAt(260));
		
		StringBuffer sb = new StringBuffer(status);
		
		sb.replace(start, end, "licensekey");
		
		String actstatus = sb.toString();
		
		System.out.println(actstatus);
		
		String[] str_Arr=status.split("license key");
		
		System.out.println(str_Arr.length);
		
		//for(String s : str_Arr)
		//	System.out.println(s);
		
		
		Map<String,String> mp = new HashMap<String,String>();
		
		mp.put("wwn_link", "10:00:00:05:33:59:94:00");
		
		String temp="link";
		
		System.out.println( mp.get("wwn_"+temp));
		
		

		String s= "A B C D E FG";
		int len = s.length();
	//System.out.println(s.length());
	char [] ch = new char[len];
	for(int i =0 ; i<len;i++)
	{
		ch[i]=s.charAt(i);
	}
	for(int i =0 ; i<len;i++)
	{
		//System.out.println(i);
		if(ch[i]==' ')
		{
			//System.out.println("In looping");
			len=len-1;
			for(int j=i ; j<len;j++)
			{
				ch[j]=ch[j+1];
			}
		
		}
	}
	for(int i =0 ; i<len;i++)
	{
		System.out.println(ch[i]);
	}
	//System.out.println(ch.length);
	}

}
