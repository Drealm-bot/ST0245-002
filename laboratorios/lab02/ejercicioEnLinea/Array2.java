public class Array2
{

//código 1:

public int countEvens(int[] nums) {
  int a=0;
  for (int intTemp : nums){
     if (intTemp%2 == 0){
       a++;
     }
  }
  return a;
}

//código 2:

public int bigDiff(int[] nums) {
  int temp;
  int n = nums.length;
        for(int i = 1; i<n; i++)
        {
            for(int j = 0; j<n-i; j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                   nums[j+1] = temp;
                }
            }
        }
        int a=nums[nums.length-1]-nums[0];
        return a;
      }

//código 3:

public boolean only14(int[] nums) {
  boolean a = true;
  for(int intTemp : nums){
    if ((intTemp == 1) || (intTemp == 4)){
    a = true;
  }else{
    a = false;
    break;
  }
  }
  return a;
}

//código 4:

public boolean lucky13(int[] nums) {
    boolean a = true;
  for(int intTemp : nums){
    if ((intTemp != 1) && (intTemp != 3)){
    a = true;
  }else{
    a = false;
    break;
  }
  }
  return a;
}

//código 5:

public boolean more14(int[] nums) {
  int a = 0;
  int b = 0;
  for (int intTemp : nums){
    if(intTemp == 1){
      a++;
    }
    if(intTemp == 4){
      b++;
    }
  }boolean incog = a>b;
  return incog;
}
}