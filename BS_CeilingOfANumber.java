public class BS_CeilingOfANumber {
    public static int ceilUsingBS(int arr[],int target){
        if (target>arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end =  arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if (arr[mid]<target) {
                start =  mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[start];

    }
    public static void main(String[] args) {
        //Ceiling=Smallest Number Greater than or Equal to Target
        int arr[] = {2,3,5,9,14,16,18};
        int target = 18;
        System.out.println("The ceiling of the number is: " + ceilUsingBS(arr, target));
    }
}
