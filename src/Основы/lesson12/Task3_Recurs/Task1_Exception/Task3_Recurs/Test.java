package Основы.lesson12.Task3_Recurs.Task1_Exception.Task3_Recurs;

public class Test {

	public void repeat(int i, int count){
		
		if(i==count){
			return;
		}
		
		System.out.print(i+ " ");
		repeat(i+1, count);
	}
	
	public void repeatReverse(int i, int count){
		
		if(i==count){
			return;
		}
		
		repeat(i+1, count);
		System.out.print(i+ " ");
		
		
		
	}
	
	public void repeatReverseReverse(int i, int count){
		
		if(i==count/2){
			return;
		}
		System.out.print(i+ " ");
		
		repeat(i+1, count);

		System.out.print(i+ " ");
		
	}
	
	public static int factorRec(int n){
		
		if(n==1){
			return 1;
		}
		int fact = factorRec(n-1)*n;
		return fact;

	}
	
	public static int fib(int n){
		
		if (n==1 || n == 2) {
		    return 1;
		  }
		  return fib (n-2) + fib (n-1);
		}

}
