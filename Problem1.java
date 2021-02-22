//Time: O(log n)
//Space: O(1)

public class Problem1 {

    public int findTheMissingNumber(int[] array) {
        if(array==null || array.length==0) {
            return -1;
        }
        int low = 0;
        int high = array.length-1;
        while(low<=high) {
            int mid = low + (high - low)/2;
            if(array[mid] == mid) {
                low = mid+1;
            } else {
                high = mid -1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,9};
        Problem1 problem1 = new Problem1();
        int missingNumber = problem1.findTheMissingNumber(array);
        System.out.println("The missing number is: "+missingNumber);
    }
}