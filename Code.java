package misc;

import java.util.HashMap;

public class main_misc {
	//private static long[][] cache = new long[999][999];//
    //private static int[] cache = new int[999]; 
	
	public static void main(String[] args) {
		
		//
		String[] a = {"ab","abc","ab"};
		String[] b = {"ab","abc","bc"};
		int[] v = matching_strings(a,b);
		for(int i = 0;i < v.length;i++) {
			System.out.println(v[i]);
		}
		

		
	}
	private static int[] matching_strings(String[]s,String[]v) {
		HashMap<String,Integer> ocurr = new HashMap<>();
		for(int i = 0;i < s.length;i++){
			//
			if(ocurr.containsKey(s[i])) {
				ocurr.put(s[i],ocurr.get(s[i])+1);
			}
			else {
				ocurr.put(s[i],1);
			}
		}
		int [] l = new int[v.length];
		for(int i = 0;i < v.length;i++) {
			if(ocurr.containsKey(v[i])) {
				l[i] = ocurr.get(v[i]);
			}
			else {
				l[i] = 0;
			}
		}
		return l;
	}

	
		
	}
	


	

	
	

