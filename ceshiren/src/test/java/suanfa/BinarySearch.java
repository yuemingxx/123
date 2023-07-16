package suanfa;

public class BinarySearch {
    public static int binarySearch(int[] nums,int low,int high,int searchValue){
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if (nums[mid] == searchValue){
            return mid;
        }else if (nums[mid]>searchValue){
            return binarySearch(nums,low,mid-1,searchValue);
        }else{
            return binarySearch(nums,mid+1,high,searchValue);
        }
    }
}
