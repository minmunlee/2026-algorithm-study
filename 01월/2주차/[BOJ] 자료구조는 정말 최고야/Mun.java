import java.io.*;
import java.util.*;

public class Mun {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] size = br.readLine().split(" ");
	    //int N = Integer.parseInt(size[0]);
	    int M = Integer.parseInt(size[1]);
	    boolean Possible = true;
	    for(int i=0;i<M;i++) {
	        int k = Integer.parseInt(br.readLine());
	        int[] book = Arrays.stream(br.readLine().split(" "))
	                            .mapToInt(Integer::parseInt)
	                            .toArray();
	       for(int j=1;j<k;j++) {
	           if(book[j] > book[j-1]) {
	               Possible = false;
	               break;
	           }
	       }
	    }
	    System.out.print((Possible) ? "Yes" : "No");
	}
}