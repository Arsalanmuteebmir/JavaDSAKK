public class BS_FloorOfANumber {
public static int floorUsingBS(int arr[],int target){
        if (target<arr[0]) {
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
        return arr[end];

    }
    public static void main(String[] args) {
        //floor=Greates Number less than or Equal to Target
        int arr[] = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println("The ceiling of the number is: " + floorUsingBS(arr, target));
    }
}
