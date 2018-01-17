/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardmergesort;

/**
 *
 * @author Ben
 */
public class StandardMergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] testArray = new int[] {5,4,7,8,1,3,6,2,10,12,9,20,64,19,16,13};
        MergeSort(testArray,0,testArray.length-1);
        
        for(int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
    }
    
    /**
     * Running time - O(n Log(n))
     * @param A - the array to be sorted
     * @param p - index of the start of the array
     * @param r - index of the end of the array
     */
    public static void MergeSort(int[] A, int p, int r){
        
        // base case
        if(p < r){
            int q = (p + r)/2; // the index being split on (it also floors it)
            
            MergeSort(A,p,q); // Keep splitting left till hits base case
            MergeSort(A,q+1,r); // Then split the rightside recursively (Following the recursive stack)
            Merge(A,p,q,r); // Finally merge the two split arrays together 
        }
    }
    
    /**
     * Merge runs in O(n) time where n = r - p + 1
     * @param A
     * @param p
     * @param q
     * @param r 
     */
    public static void Merge(int[] A, int p, int q, int r){

        int n1 = q-p+1; // length of left array (# of elem's from p to q .. inclusive)
        int n2 = r - q; // length of right array(# of elem's from q to r .. not including q);
        
        int[] left = new int[n1 + 1]; // left sub array
        int[] right = new int[n2 + 1]; // right sub array
        
        left[n1] = Integer.MAX_VALUE; // sentinel value (infinity)
        right[n2] = Integer.MAX_VALUE; // sentinel value (infinity)
        
        // Fill left sub array with appropiate elements from p to q in A[]
        for(int i = 0; i < n1; i++){
            left[i] = A[i + p];
        }
        
        // Fill right sub array with appropiate elements from q+1 to r in A[]
        for(int i = 0; i < n2; i++){
            right[i] = A[i + q + 1];
        }

        int i = 0, j = 0; // keep track of smallest elem in each array (left & right)
        
        // Combine into A[]
        for(int k = p; k <= r; k++){
            
            if(left[i] < right[j]){
                A[k] = left[i];
                i++;
            }
            else{
                A[k] = right[j];
                j++;
            }
        }
    }
}
