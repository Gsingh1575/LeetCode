class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null){
        return 0;
    }
    if(nums.length<3){
        return nums.length;
    }
 
    int i=0;
    int j=1;
     while(j<nums.length){
        if(nums[j]==nums[i]){
            if(i==0){
                i++;
                j++;
            }else if(nums[i]==nums[i-1]){
                j++;
            }else{    
                i++;
                nums[i]=nums[j];
                j++;
            }
        }else{
            i++;
            nums[i]=nums[j];
            j++;
        }
    }
 
    return i+1;
}
}