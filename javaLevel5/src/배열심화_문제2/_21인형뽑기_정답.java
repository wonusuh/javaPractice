package 배열심화_문제2;

import java.util.Arrays;

public class _21인형뽑기_정답 {

	public static void main(String[] args) {

        // 아래있는 것부터 뽑고 한개씩 아래로 내려온다 
		int[][] machine = {
				{0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3}
			};
	                        //    1        2      3    4 
			String[] nameList = {"호랑이", "곰", "사자", "기린"};
			int[] input = {1,0,0,3,3,4,4};		// 
			int size = machine.length;
			
			for(int i =0; i < input.length;i+=1) {
				int x = input[i];
				System.out.println("input = " + x);
				
				if(machine[size-1][x] == 0) {
					System.out.println("**** 꽝 ***** ");
					continue;
				}
				int index = machine[size-1][x];
				System.out.println("****" +nameList[index-1]+ "****");
				
				int idx = -1;
				for(int k =0; k < size;k+=1) {
					if(machine[k][x]!=0) {
						idx = k;
						break;
					}
				}
				
				for(int k = size-1; k >= idx;k-=1) {
					machine[k][x] = machine[k-1][x];
				}
				
				machine[idx][x]=0;
				
				for(int k=0; k < size;k+=1) {
					System.out.println(Arrays.toString(machine[k]));
				}
				System.out.println("===========");
				
				
			}
			
			
	
	}
}
