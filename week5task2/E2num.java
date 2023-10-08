package week5task2;

public enum E2num {
	age(21),name("chandru"); //Constants
private int a;
private String S; // Instance variables

 private E2num(int age){
	this.a = age;  //Constructor
}
 
 private E2num(String k){
	this.S= k;//Constructor
}
 int getage() {
	 return a;  // method
 }
 String getname() {
	 return S;  // method 
 } 
 
}
 
