
public class BubbleSort {
	 public static void bubbleSort(Comparable [] v) {
	        final int N = v.length;
	        for(int i=N-1; i>0; i--) {
	            for(int j=0; j<i; j++) {
	                if(v[j].compareTo(v[j+1])>0) {
	                    Comparable tmp = v[j];
	                    v[j]    = v[j+1];
	                    v[j+1]  = tmp;
	                }
	            }
	        }
	    }
}
