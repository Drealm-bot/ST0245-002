package Laboratorio;

public class codingBatRecursion2 {
	public boolean splitArray(int[] nums) {
		  int ind = 0, sum1 = 0, sum2 = 0;
		  return splitArray(nums, ind, sum1, sum2);
		}

		private boolean splitArray(int[] nums, int ind, int sum1, int sum2){
		  if(ind>=nums.length) return sum1 == sum2;
		  int val = nums[ind];
		  return (splitArray(nums, ind+1, sum1+val, sum2) || splitArray(nums, ind+1, sum1, sum2+val));
		}
		
	public boolean splitOdd10(int[] nums) {
		  int ind = 0, odd = 0, m10 = 0;
		  return splitOdd10(nums, ind, odd, m10);
		}

			private boolean splitOdd10(int[] nums, int ind, int odd, int m10){
			  if(ind>=nums.length) return (odd%2==1) && (m10%10==0);
			  int val = nums[ind];
			  return (splitOdd10(nums, ind+1, odd+val, m10) || splitOdd10(nums, ind+1, odd, m10+val));
			}
			
	public boolean groupSum6(int start, int[] nums, int target) {
			if(start>=nums.length) return target==0;
			if(nums[start]!=6 && groupSum6(start+1, nums, target)) return true;
			if(groupSum6(start+1, nums, target-nums[start])) return true;
			return false;
	 	}
	
	public boolean groupNoAdj(int start, int[] nums, int target) {
		  if(start>=nums.length) return target==0;
		  if(groupNoAdj(start+2, nums, target-nums[start])) return true;
		  else if(groupNoAdj(start+1, nums, target)) return true;
		  return false;
		}
	
	public boolean split53(int[] nums) {
		  int ind = 0, sum3 = 0, sum5 = 0;
		  return split53(nums, ind, sum3, sum5);
		}

		private boolean split53(int[] nums, int ind, int sum3, int sum5){
		  if(ind>=nums.length) return (sum3==sum5);
		  int val = nums[ind];
		  if (val%3 == 0) return split53(nums, ind+1, sum3+val, sum5);
		  else if(val%5 == 0) return split53(nums, ind+1, sum3, sum5+val);
		  else return (split53(nums, ind+1, sum3+val, sum5) || split53(nums, ind+1, sum3, sum5+val));
		}
	
}
