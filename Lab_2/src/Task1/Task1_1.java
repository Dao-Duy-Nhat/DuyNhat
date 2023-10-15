package Task1;

public class Task1_1 {
		// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
		public static int getSn1(int n) {
	     if(n==1) {
	    	 return 0;
		}else if(n >1) {
			return (int) Math.pow(-1, n+1)*n;
		}
	     return n + getSn1(n-1);
	     
		}
		
		// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
		public static int getSn2(int n) {
		if (n == 1) {
			return 0;
		}else {
			return getSn2(n-1) + factorial(n);
		}
		
		}
		
		public static int factorial(int n) {
			if (n == 0) {
				return 1;
			}else {
				return n * factorial(n-1);
			}
		}
		
		// S(n)=1^2+2^2+3^2+....+n^2 , n>0
			public static int getSn3(int n) {
			if(n == 0) {
				return 1;
			}
			return n*n + getSn3(n-1);
			}
			
		
			// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
			public static double getSn4(int n) {
			if (n == 0) {
				return 1;
			}
			return getSn4(n-2) + 1/getSp(n);
			}

			public static double getSp(int n) {
				if (n == 2) {
					return 2;
				}
				return getSp(n-2) * n;
			}
			
			

		public static void main(String[] args) {
			int n = 4;
			System.out.println(getSn1(n));
			System.out.println(getSn2(n));
			System.out.println(getSn3(n));
			System.out.println(getSn4(n));
	
		
		
	}
}
