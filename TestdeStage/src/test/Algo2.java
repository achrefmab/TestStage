package test;

import java.math.BigInteger;
import java.util.Arrays;

public class Algo2 {
	
	 
		int number = 0;
		public static void main(String[] args) {
			int[] A = new int[]{4,4,5,5,1};
			int[] B = new int[]{3,2,4,3,1};
			System.out.println(Arrays.toString(solution(A,B)));
		}
		
		public static int[] solution(int[] A, int[] B) {
			BigInteger[] fibs = new BigInteger[A.length+2];
			fibs[0] = new BigInteger("0");
			fibs[1] = new BigInteger("1");
			for (int i = 2; i < A.length+2; i++) {
				fibs[i] = fibs[i-1].add(fibs[i-2]);
			}
			int[] res = new int[A.length];
			for (int i = 0; i < B.length; i++) {
				BigInteger currPow = new BigInteger(String.valueOf((long)Math.pow(2, B[i])));
				res[i] = fibs[A[i]+1].mod(currPow).intValue();
			}
			return res;
		}
	}