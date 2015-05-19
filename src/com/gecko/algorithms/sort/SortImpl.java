package com.gecko.algorithms.sort;

/**
 * a sort algorithm that is optimized based on the count of
 * items to be sorted. Uses MY HYPOTHETIC (and fictional) assumption
 * that when N is large (100,000), it is better to use 
 * Insertion Sort algorithm. For smaller N sized arrays,
 * Selection Sort algorithm has generally better performance.
 * 
 * If the above assumption is not true (which is indeed the case),
 * then the system's threshold (100,000) can be adjusted using the method
 *    setVariableThreshold(int newThreshold) 
 * 
 * The system is defaulted to use the fixed threshold of 100,000. To
 * use your own variable threshold, first call
 *      setSwitchable(false)
 * and then adjust the desired threshold using, eg 
 *      setVariableThreshold( 1000 ) 
 *      
 * @author hlieu
 *
 * This is an example of a class implementation of an
 * algorithm that can be changeable on the fly 
 * based on the variables in the system, to improve
 * performance.
 * 
 * 
 * Note: this is all hypothetical fiction...
 * 
 */
public class SortImpl<T> extends BaseSort {
	
	private static final int THRESHOLD = 100000;

	// do we want to use a static threshold or
	// the variable threshold as the determinant
	private static boolean SWITCHABLE_USE_STATIC_SORT = true;
	public static void setSwitchable(boolean useStatic) {
		SWITCHABLE_USE_STATIC_SORT = useStatic;
	}
	
	// sort implementation
	public static <T> void sort(Comparable<T>[] comparables) {

		// we can switch from variable threshold
		// to static threshold by using method setSwitchable
		if(SWITCHABLE_USE_STATIC_SORT)  
			static_sort(comparables); 
		else 
			variable_sort(comparables);
	}
	
	// static sort implementation uses a constant threshold
	// Newburger et al (1980) proved that the optimal sort
	// to use is insertion sort when the size is more then 100K
	// and below that use selection sort
	public static <T> boolean static_sort(Comparable<T>[] comparables) {
		// threshold is the magic 
		if(comparables.length > THRESHOLD) { 
			InsertionSort.sort(comparables);
		} else { 
			SelectionSort.sort(comparables);
		}
		return true;
	}
	
	// this is a settable threshold, to try to improve performance
	private static int VARIABLE_THRESHOLD = 100000;
	public static void setVariableThreshold(int _reset_Variable) {
		VARIABLE_THRESHOLD = _reset_Variable;
	}
	
	// Lieu et al (2015) found a flaw in Newburger's proof that 
	// 100K is not the threshold. Now you can set your own threshold
	// by using variable_sort and make use of it using variable_sort
	private static <T> boolean variable_sort(Comparable<T>[] comparables) {
		if(comparables.length > VARIABLE_THRESHOLD) {
			InsertionSort.sort(comparables);
		} else {
			SelectionSort.sort(comparables);
		}
		return true;
	}
	
	
	// I think I may be going CRAZY...
}
