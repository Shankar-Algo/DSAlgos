package com.basics.scjp.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Method_Over 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal a = new Dog();
		Dog d =(Dog) a;
		d.sayhello();
		Animal ab = new Animal();
		ab.sayhello();
		 System.out.println("-------------------------------");
		/*Vector<Integer> s = new Vector<Integer>();
		 s.add(7);
		 s.add(4);
		 Enumeration<Integer> et = s.elements();
		 while(et.hasMoreElements())
		 {
			 s.add(9);
		 }*/
		 
		 /*s.add(null);
		 s.add(null);*/
		 List<Integer> lt = new ArrayList<Integer>();
		 lt.add(7);
		 lt.add(2);
		 lt.add(2);
		 
		 
		 Iterator<Integer> it = lt.iterator();
		 while(it.hasNext())
		 {
			 int i = it.next();
			 System.out.println(i);
			 
		 }
		 
		 
		 System.out.println("-------------------------------");
		 Set<Integer> ltt = new TreeSet<Integer>();
		 ltt.add(7);
		 ltt.add(2);
		 
		 
		 
		 Iterator<Integer> itt = ltt.iterator();
		 while(itt.hasNext())
		 {
			 int i = itt.next();
			 System.out.println(i);
			 
		 }
		 
		 
		 System.out.println("-------------------------------");
		 Map<Integer,String> m = new LinkedHashMap<Integer,String>();
		 
		 m.put(0, "zero");
		 m.put(0, "z");
		 m.put(1, "one");
		 m.put(5, "five");
		 m.put(3, "three");
		 
		 for(Map.Entry<Integer, String> me :  m.entrySet())
		 {
			 System.out.println(me.getKey());
			 System.out.println(me.getValue());
		 }
		 System.out.println("-------------------------------");
		 
		 Set sm =  m.entrySet();
		 it = sm.iterator();
		 
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		
		 System.out.println("-------------------------------");
		 
		 List<Integer> sort_list= new ArrayList<Integer>();
		 sort_list.add(3);
		 sort_list.add(2);
		 sort_list.add(7);
		 sort_list.add(8);
		 sort_list.add(5);
		 int temp_int;
		//int temp_int;
		/* int a_sort [] = new int[]{3,2,7,8,5};
		 int len=a_sort.length-1;
		 for(int ii=0;ii<=len;ii++)
		 {
			 for(int jj=1;jj<=len;jj++)
			 {
			 if(a_sort[ii]>a_sort[jj])
				{
				 temp_int = a_sort[ii];
				 a_sort[ii]=-a_sort[jj];
				 a_sort[jj] = temp_int;
					
				}
			 }
		 }
		
		 for(int kk=0;kk<=len;kk++)
		{
			System.out.println(a_sort[kk]);
		}*/
		 
		/* it = sort_list.iterator();
		 int j =0;
		 while(it.hasNext())
		 {
			System.out.println(++j);
			 System.out.println(it.next());
			System.out.println(it.next());
		 }
		 
		 System.out.println("-------------------------------");
		 */
		 
		/* LinkedList<Integer> lt = new LinkedList<Integer>();
		 lt.add(11);
		 lt.add(12);
		 lt.add(12);
		 lt.add(11);
		 lt.add(13);
		 lt.add(3, 100);
		 //Collections.sort(lt);
		 Iterator<Integer> itt = lt.iterator();
		 while(itt.hasNext())
		 {
			 int i = itt.next();
			 System.out.println(i);
			 
			 
		 }
		 System.out.println("-------------------------------");
		 ResourceBundle rb = ResourceBundle.getBundle("Demo");
		 System.out.println(rb.getString("s4"));*/
	}

}
class Animal
{
	void sayhello()
	{
		System.out.println("Animal");
	}
}
class Dog extends Animal
{
	void sayhello()
	{
		System.out.println("Dog");
	}
}