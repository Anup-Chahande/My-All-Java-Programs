package com.importt;

import com.add.Addition;
import com.circle.Circlearea;
import com.div.Division;
import com.modular.Mod;
import com.mul.Multiplication;
import com.parallelogram.Parallelogram;
import com.rectangle.Arearectangle;
import com.square.Squarearea;
import com.sub.Substraction;



public class Importing {
	
	
	public static void main(String [] args) {
		Addition h = new Addition();		
		h.add(10,20);
		
		Substraction s = new Substraction();
		s.substraction(30,10);
		
		Circlearea c = new Circlearea();
		c.circle(10,12);
		
		Division d = new Division();
		d.division(8,2);
		
		Mod m = new Mod();
		m.modular(8,3);
		
		Multiplication mu = new Multiplication();
		mu.mul(2,2);
		
		Parallelogram pp =  new Parallelogram();
		pp.Parallelogramm(2,9);
		
		Arearectangle r = new Arearectangle();
		r.rectangle(4,6);
		
		Squarearea ss = new Squarearea();
		ss.square(6,2);
		
		
		
		
		
		
	}
}
