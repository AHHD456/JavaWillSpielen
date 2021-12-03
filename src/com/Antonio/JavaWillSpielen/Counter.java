package com.Antonio.JavaWillSpielen;

 import javax.swing.*;
 import com.Antonio.util.*;
 
public class Counter extends SimpleButton{


	private static final long serialVersionUID = 1L;

	public Counter() {
 b.addActionListener(new CounterButtonListener(l));
	}



public static void main(String [] args) {
 ShowInFrame.show(new Counter());}
 }