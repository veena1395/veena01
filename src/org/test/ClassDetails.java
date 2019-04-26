package org.test;

public class ClassDetails {
	public void className(String name ) {
System.out.println(name);
}
	public void className(float percentage) {
System.out.println(percentage);
	}
	public void className(int regno,String email) {
System.out.println(regno+"\n"+email);
	}
	public static void main(String[] args) {
		ClassDetails vv=new ClassDetails();
		vv.className(95.5f);
		vv.className("veena");
		vv.className(454, "sgsghs@123cvd");
		
	}
}
