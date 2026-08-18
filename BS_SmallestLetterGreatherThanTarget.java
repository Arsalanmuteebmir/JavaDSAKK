public class BS_SmallestLetterGreatherThanTarget {
    public static char ceilCharUsingBS(char arr[],char target){
        if (target>arr[arr.length-1]) {
            return arr[0];
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
        //Ceiling=Smallest Number Greater than Target
        char arr[] = {'c','e','g'};
        char target = 'a';
        System.out.println("The ceiling of the number is: " + ceilCharUsingBS(arr, target));
    }
}
