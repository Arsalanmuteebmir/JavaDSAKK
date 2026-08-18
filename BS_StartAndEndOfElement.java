import java.util.Arrays;

public class BS_StartAndEndOfElement {
    public static int[] bruteforce(int arr[],int target){
        int start  = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if(start==-1){
                    start=i;
                }
                end = i;
            }
        }
        return new int[]{start,end};
    }
    public static int[] SAEusingBS(int arr[],int target){
        int ans[] =  {-1,-1};
        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0] =  start;
        ans[1] = end;
        return ans;
    } 
    public static  int search(int arr[],int target,boolean findStartingIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] < target) {
                start =  mid+1;
            }else if(arr[mid]>target){
                end = mid -1;
            }else{
                ans=mid;
                if (findStartingIndex) {
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int  arr[] = {2,3,3,3,4,5};
        int target = 3;
        System.out.println(Arrays.toString(bruteforce(arr, target)));
        System.out.println(Arrays.toString(SAEusingBS(arr, target)));
    }
}
