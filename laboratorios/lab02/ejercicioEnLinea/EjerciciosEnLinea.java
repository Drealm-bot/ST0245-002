package Laboratorio_2;

public class Array3 {
	public int maxSpan(int[] nums) {
		  int span = 0;
		  int tmp = 0;
		  for(int i = 0; i<nums.length; i++){
		    for(int k = 0; k<nums.length; k++){
		      if(nums[i] == nums[k]){
		      tmp=k-i+1;
		      span=Math.max(tmp, span);
		      }
		    }
		  }
		  return span;
		}
	public int[] fix34(int[] nums) {
		  for(int i = 0; i<nums.length; i++){
		    if(nums[i] == 3){
		      for(int j = 0; j<nums.length; j++){
		        if(nums[j] == 4 && nums[j-1] != 3){
		          int temp = nums[i+1];
		          nums[i+1] = nums[j];
		          nums[j] = temp;
		        }
		      }
		    }
		  }
		  return nums;
		}
	public int[] fix45(int[] nums) {
		  int j = 0;
		      for (int i = 0; i < nums.length - 1; ++i) {
		        if (nums[i] == 4 && nums[i + 1] != 5) {
		          while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4)) {
		            j++;
		          }
		          nums[j] = nums[i + 1];
		          nums[i + 1] = 5;
		        }
		      }
		      return nums;
		}
	public boolean canBalance(int[] nums) {
		  int tmp = 0;
		  for(int i = 0; i<nums.length; i++){
		    tmp = tmp + nums[i];
		    int tmp1 = 0;
		    for(int j = nums.length-1; j>i; j--){
		      tmp1 = tmp1+nums[j];
		      
		    }
		    if(tmp == tmp1){
		      return true;
		    }
		      
		    
		  }
		  return false;
		}
	public boolean linearIn(int[] outer, int[] inner) {
		  int numFound = 0;
		  if(inner.length == 0) {
		     return true;
		  }
		  
		  int k = 0;
		  for(int i = 0; i < outer.length; i++) {
		     if(outer[i] == inner[k]) {
		        numFound++;
		        k++;
		     } else if(outer[i] > inner[k]) {
		        return false;
		     }
		  if(numFound == inner.length){
		      return true;
		    }
		    
		  }
		  return false;
		}
}
