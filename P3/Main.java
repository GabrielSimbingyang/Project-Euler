import java.math.*;

class Main {
	public static void main(String[] args){
		long largest = 0;
		for(long i = 1; i * i < 600851475143L; i ++) {
			if(600851475143L % i == 0 && isPrime(i)){
				if(i > largest) {
					largest = i;
				}
			}
		}
		System.out.println(largest);
	}
	
	public static boolean isPrime(long n) {
		if(n % 2 == 0) {
			return false;
		}
		for(long i = 3; i * i < n; i ++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}