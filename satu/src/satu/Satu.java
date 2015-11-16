/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satu;

/**
 *
 * @author heriipurnama
 */
public class Satu {
private static void segitiga1() {
		int i;
		int j;
		
		for (i = 1; i <= 5; i++) {
			int k = 5 - i;
			for(j = 1; j <= k; j++){
				System.out.print(" ");	
			}
			for(int g=1; g <= i; g++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		/*
		     *
		    **
		   ***
		  ****
		 *****
		 
		 */
	}
 
	private static void segitiga2(){
		/*
	     
	     *
	     **
	     ***
	     ****
	     *****
	 
	    */
		
		for(int i=0; i <= 5; i++){			
			for(int j=0; j <= i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}
	
	private static void segitiga5(){
		/*
	     
	     *****
	     ****
	     ***
	     **
	     *
	 
	    */
		int n = 5;
		for(int i=0; i <= n; i++){	
			int b = n -i;
			for(int j=0; j <= b; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}
	
	private static void segitiga6(){
		/*
	     
	     *****
	      ****
	       ***
	        **
	         *
	 
	    */
		int n = 5;
		for(int i=0; i <= n; i++){	
			int b = n -i;
			
			for(int j=0; j < i; j++){
				System.out.print(" ");
			}
			
			for(int j=0; j <= b; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}
	
	
	private static void segitiga3(){
		/*
	     	 
	      *********
		  -*******
		  --*****
		  ---***
	      ----*
	 
	    */
		int n = 15;
		int m = (n * 2) - 1;
		for(int i=1; i <= n; i++){
			
			for(int j=1; j < i; j++){
				System.out.print(" ");
			}
			for(int k=1; k <= m;k++){
				System.out.print("*");
			}
			m = m - 2;
		
			System.out.print("\n");
						
		}
		
		
	}
	
 
	private static void segitiga4(){
		/*	     
	      ----*
	      ---***
	      --*****
	      -*******
	      *********
	       
	    */
		int n = 15;
		int m = 1;
		for(int i=1; i <= n; i++){						
			
			for(int j=1; j <=(n-i); j++){
				System.out.print(" ");
			}
			
			for(int j=1; j <= m; j++){
				System.out.print("*");
			}
			m = m + 2;
			
			System.out.print("\n");
			
			
		}
		
	}
	
	public static void main(String[] args) {
		segitiga1();
		System.out.println("\n");
		segitiga2();
		System.out.println("\n");
		segitiga3();
		System.out.println("\n");
		segitiga4();
		System.out.println("\n");
		segitiga5();
		System.out.println("\n");
		segitiga6();
		
	}
}
