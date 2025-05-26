class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int low =0;
        int high = arr.length-1;
        // (arr[low]>='A' && arr[low]<='Z')

        while(low<high){
            if(((arr[low]>='a' && arr[low]<='z') || (arr[low]>='A'&& arr[low]<='Z')) && ((arr[high]>='a' && arr[high]<='z') || (arr[high]>='A'&& arr[high]<='Z'))){
                char ch = arr[low];
                arr[low] = arr[high];
                arr[high] = ch;
                high--;
                low++;
            }else if(((arr[low]>='a' && arr[low]<='z') || (arr[low]>='A'&& arr[low]<='Z'))){
                high--;
            }else{
                low++;
            }
        }

        return new String(arr);
    }
}