package day14;
//Exception occures when the user provided invalid input to the program.
//Exception is an event which will cause program termination.
//1) Checked exceptions
//The exceptions which are identified by java compiler.
//
//Ex: Interupted exception
//FileNotFound
//		IOException
//
//2) Un-checked exceptions
//The exceptions which are not identified by java compiler.
//		Ex:
//ArithmeticExeption
//		NullPointerException
//ArrayIndexOutOfBoundsException etc...
//
//handled in statements block:
//try..catch block
//try..catch..finally - finally block is always run no matter if exception has occured or not - useful for cleaning up resources or for instance closing browser session in automation
//
//example:
//WebDriver driver = new ChromeDriver();
//try {
//		// Code to perform test actions
//		} finally {
//		if (driver != null) {
//		driver.quit(); // Close the browser session in the finally block
//    }
//			}
//
//handled in method:
//throws keyword with excetpion in method definition

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");
		
		//Example1
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(100/num);  //ArithmeticException
		*/
		
		
		//Example2
		/*int a[]=new int[5]; //0...4
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("Enter position(0-4):");
		int pos=sc.nextInt();
		
		a[pos]=num;   //ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);*/
		
		
		//Example3
		
		String s="welcome";
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println(num);
				
		System.out.println("Program is  completed..");
		System.out.println("Program is  exited..");
		
		
	}

}










