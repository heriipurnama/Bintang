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
public class bintang {
    private static void segitiga1(){
		for(int i=0; i <= 5; i++){			
			for(int j=0; j <= i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
               int n = 4;
		for(int i=0; i <= n; i++){	
			int b = n -i;
			for(int j=0; j <= b; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
    private static void bintang(){
        int i,j,n;
        i=0;
        do{
            j=0;
            do{
                System.out.print("*");
                j++;
            }
            while(j<=i);
            System.out.print("\n");
        i++;        
        }
        while(i<=5);
    
    n=5;
    i=0;
        do{
            int b=n-i;
            j=0;
            do{
                System.out.print("*");
                j++;
            }while(j<=b);
            i++;
            System.out.print("\n");
        }while(i<=n);
    }
    public static void main(String[] args) {
		segitiga1();
		System.out.println("\n");
                bintang();
		System.out.println("\n");
		
	}
    
}
