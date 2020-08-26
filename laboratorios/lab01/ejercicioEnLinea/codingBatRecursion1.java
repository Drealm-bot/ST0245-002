package Laboratorio;

public class codingBatRecursion1 {
	public int powerN(int base, int n) {
		  if(n==0){
		    return 1;
		  }else return base*powerN(base, n-1);
		}
	public int count7(int n) {
		  if(n==0){
		    return 0;
		  }else if((n-7)%10!=0){
		    return count7(n/10);
		  }else return count7(n/10) + 1;
		}
	public int sumDigits(int n) {
		  if(n==0){
		    return 0;
		  }else return (n%10) + sumDigits(n/10);
		}
	public int triangle(int rows) {
		  if(rows==0){
		    return 0;
		  }else return triangle(rows-1) + rows;
		}
	public int bunnyEars2(int bunnies) {
		  if(bunnies==0){
		    return 0;
		  }else if(bunnies%2==0)
		    return bunnyEars2(bunnies-1)+3;
		  else
		    return bunnyEars2(bunnies-1)+2;
		}
}
