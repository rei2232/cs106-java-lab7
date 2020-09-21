import acm.program.ConsoleProgram;

public class PerfectNumbers extends ConsoleProgram{

	public void run() {
		
		int num=readInt("toogoo oruul: ");
		
		for(int i=1;i<=num;i++){
			if(isPerfect(i)){
				println(i+" ");
			}			
		}			
	}
	public static boolean isPerfect(int num){
		int sum = 0;
		   
	    for (int i = 1; i <= num/2; i++) {
	      if (num % i == 0) {
	        sum += i;
	      }
	    }
	    if (sum == num) {
	      return true;
	    } else {
	      return false;
	    }
	   
	  } 
	
	}
