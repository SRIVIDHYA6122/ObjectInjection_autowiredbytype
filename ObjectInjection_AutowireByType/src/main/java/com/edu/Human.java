package com.edu;

public class Human {
private Heart heart;// object

public Heart getHeart() {
	return heart;
}

public void setHeart(Heart heart) {
	this.heart = heart;
}
public void humanFunction() {
	if(heart!=null) { // refer the spring.xml
		heart.pump();
		
	}
	else
	{
		System.out.println("Not Alive");
	}
}

}
