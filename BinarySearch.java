// use arrays.binarySearech mfker
import java.util.Arrays;
class BinarySearch2{
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int result = Arrays.binarySearch(arr, key);
        if(result<0)
            System.out.println("Elements is not found");
        else
            System.out.println("Elements is found at" +result);
    }
}

// use while loop
class BianrySearch1{
    public static int binarySearch(int arr[],int first,int last,int key){
        int mid=(first+last)/2;
        while(first <= last){
            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid] <= key){
                last = mid-1;
                mid=(first+last)/2;
            }else{
                first = mid+1;
                mid=(first+last)/2;
            }
        }
        return -1;
    }
}


// recursive
class BinarySearch{
    public static int binarySearch(int arr[],int first,int last,int key){
        if(last >= first){
            int mid = (first+last)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]>key){
                return binarySearch(arr,first,mid-1,key);
            }else{
                return binarySearch(arr,mid+1,last,key);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        int result = binarySearch(arr, 0, last, key);
        if (result ==-1)
            System.out.println("Elements is not found");
        else
            System.out.println("Elements is found at "+result);
    }
}


