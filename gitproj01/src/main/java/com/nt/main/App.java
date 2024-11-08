package com.nt.main;


public class App {
	public int sum(int x,int y) {
		return x+y;
	}
	
	
    public static void main(String[] args) {
        App app=new App();
        int result=app.sum(10,20);
        System.out.println(result);
    }
}
