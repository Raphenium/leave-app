package net.kzn.onlineshopping.controller;

public class Solution {
public static void main(String[] args) {
	int[] A;
	int K;
	 int[] solution(A, K); 
}
public static int[] solution(int[] A, int K) {
	for(int i=0; i<=K; i++) {
		for(int j=2; j<=A.length; j++) {
			A[A.length-j] = A[A.length-j-1];
			A[A.length-1] = A[0];
		}
	}
	
	return A;
	
}
}
