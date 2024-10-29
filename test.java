import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero=0;
        int zero=0;
        boolean zeroflag=false;
        boolean nonzeroflag=false;
        if(!( Arrays.stream(nums).anyMatch(i -> i == 0))){
            return;
        }
        while(zeroflag==false && nonzeroflag==false){
            for(int i=nonzero;i<nums.length;i++){
                if(nums[i]!=0){
                    nonzero=i;
                    nonzeroflag=true;
                    break;
                }
                
            }
            
            for(int j=zero;j<nums.length;j++){
                if(nums[j]==0){
                    zero=j;
                    zeroflag=true;
                    break;
                }
                
            }
            
            if(zeroflag && nonzeroflag ){
                if( zero<nonzero){
                    nums[zero]=nums[nonzero];
                    nums[nonzero]=0;
                    
                }else if(nonzero<nums.length){
                    nonzero++;
                }
                zeroflag=false;
                nonzeroflag=false;
                
            }

            
        }       
    }
    
    public static void main(String[] args) {
       int [] nums= {0,1,0};
       Solution obj= new Solution();
       obj.moveZeroes(nums);
       for (int i:nums){
            System.out.println(i);
       }
    }
}