package org.test;

public class CourseDet {
	public void details(String name) {
System.out.println(name);
	}
	public void details(long phnno,float rate) {
System.out.println(phnno+"\n"+rate);
	}
	public void details(String email,int code) {
System.out.println(email+"\n"+code);
	}
	public static void main(String[] args) {
		CourseDet vv=new CourseDet();
		vv.details("veeknesh");
		vv.details(012365445,4);
		vv.details("fjhgfjy@ey5", 551);
		
	}

}
