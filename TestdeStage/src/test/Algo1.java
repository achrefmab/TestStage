package test;
public class Algo1 {

	    public int[] solution(int N, int[] A) {
	        int[] counters = new int[N];
	        int max = 0;
	        int setToMax = 0;

	        for(int i = 0; i < A.length; i++) {
	            if (A[i] <= N) {
	                if (counters[A[i]-1] < setToMax) {
	                    counters[A[i]-1] = setToMax;
	                }
	                int c = ++counters[A[i]-1];
	                if (c > max) {
	                    max = c;
	                }
	            } else {
	                setToMax = max;
	            }
	        }
	        for(int j = 0; j < N; j++) {
	            if (counters[j] < setToMax) {
	                counters[j] = setToMax;
	            }
	        }

	        return counters;
	    }
	}
