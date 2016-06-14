public class findnum1
{
private  static int reverse(int number){

int rev = 0;

while(number>0){
  int rem = number%10;
  rev = rev*10 + rem;
  number = number/10;
}

return rev;
}


public static void main(String args[]){
   for(int i=10;i<99;i++){
     if( Math.abs( i - reverse(i) ) == 36){
    // print i
	System.out.println(i);
    }
   }
}
}
