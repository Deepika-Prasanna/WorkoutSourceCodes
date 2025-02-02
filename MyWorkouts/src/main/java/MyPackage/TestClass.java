package MyPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TestClass {
	 public static void main(String args[] ) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int N = Integer.parseInt(br.readLine().trim());
	        int[] A = new int [N];
	        String[] inp = br.readLine().split(" ");
	        for(int i=0;i<N;i++) 
	        {
	            A[i] = Integer.parseInt(inp[i]);
	        }
	        int Q = Integer.parseInt(br.readLine().trim());
	        for(int i=0;i<Q;i++) {
	            String[] inp1 = br.readLine().split(" ");
	            int L = Integer.parseInt(inp1[0]);
	            int R = Integer.parseInt(inp1[1]);
	            int out_ = solve(N, A, L ,R);
	            System.out.println(out_);
	        }
		    wr.close();
	        br.close();
	    }
	    static int solve(int N, int[] A, int L, int R) {
	    		        //Your code goes here 
	    	A = Arrays.copyOfRange(A,L-1,R);
	    	 Arrays.sort(A);
	    	 int median;
	    	 if(A.length % 2 == 0) {
	    		 median = A[(int) Math.ceil((A.length/2)-1)];
	    	 }else {
	    		 median = A[(int) Math.ceil(A.length/2)];
	    	 }
	        return median;
	        
	    }
}
