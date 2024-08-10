package dsfsdf;

import java.util.ArrayList;
import java.util.Random;

public class vuthanhtruong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[]=new int[] {-2,1000,10,1000,999,999,1,-3,4,-1,2,1,0,4,5,6,10,1,2,100};
		int k=M[0];
		for(int i=0;i<M.length;i++) {
			if(k<M[i]) {
				k=M[i];
			}
		}
		ArrayList<Integer> array=new ArrayList<Integer>();
		Random rd=new Random();
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+" ");
		}
		System.out.println();
		for(int i=0;i<M.length-1;i++) {
			if(M[i]>=M[i+1]) {
				array.add(i+1);
			}
		}
		int max=0;
		int max1=0;
		for(int i=array.getLast();i<M.length;i++) {
				max+=M[i];
		}

		for(int i=0;i<array.getFirst();i++) {
			max1+=M[i];
		}
		if(max<max1) {
			max=max1;
		}
		
		int max2=0;
		int count=0;
		int sum=0;
		while(count<array.size()-1) {
			for(int i=array.get(count);i<array.get(count+1);i++) {
				sum+=M[i];
				if(max<sum) {
					max=sum;
				}
			}
			sum=0;
			count++;
		}
		System.out.println();
		if(k>max) {
			System.out.println("Vậy giá dãy tăng dần có tổng giá trị lớn nhất là "+k);
		}
		else {
			System.out.println("Vậy giá dãy tăng dần có tổng giá trị lớn nhất là "+max);
		}
		
	}

}
