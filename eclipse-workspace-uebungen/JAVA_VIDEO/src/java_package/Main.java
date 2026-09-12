package java_package;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Yorum Satiri
		/* güler
		 * osman
		 */
		/*System.out.println("Hello World");
		System.out.println("Hello World2");*/
		
		/*		int      a=32;
		double   b = 3.14;
		float    c = 3.14f;
		char     d = 'A';
		String test = "Test";
		boolean  e = false;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println("d:" + d);
		System.out.println("e:" + e);
		System.out.println("Test:" + test);
		
a:32
b:3.14
c:3.14
d:A
e:false
Test:Test */
		
/*
		int a =20;
		int b= 15;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/(double)b);
		System.out.println(a%b);
		
	
35
300
1
5 

35
5
300
1.3333333333333333 (double)
5

*/
/*		
		int  a =5;
		a =  a + 1;
		a += 1;
		a++;
		System.out.println(a);    // 8
*/
		
/*		int  a =5;
		a =  a -1;
		a -= 1;
		a--;
		System.out.println(a);    // 2
*/
		
/*		Scanner scanner = new Scanner(System.in);  // import java.util.Scanner;   yada ctrl shift o ilede import edilir
		
		int a,b;
		
		System.out.println("Sayilarinizi Giriniz:");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("Toplamlari:" + (a+b));
		
		Sayilarinizi Giriniz:
			10
			20
			Toplamlari:30
*/
/*
	int age = 17;
	
	if (age < 18) {
		System.out.println("Oy Kullanazsiniz");
	}
	else {
		System.out.println("Oy Kullanabilirsiniz.");   // Oy Kullanazsiniz

	}
*/
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Islemi Seciniz:");
		
		int process = scanner.nextInt();
		
		if (process == 1) {
			System.out.println("Process 1");
		
	}
		else if (process == 2) {
			System.out.println("Process 2");	
		}
		
		else if (process == 3){
			System.out.println("Process 3");	
		}
		else {
			System.out.println("Gecersiz Islem");
		}
    }   // main kapanışı
}       // class kapanışı ← **eksik olan buydu** 

/* 
Islemi Seciniz:

10
Gecersiz Islem */


        



















