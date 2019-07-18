import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
//		for ( int i = 0; i <=3; i++){
//			System.out.println();
//			Scanner input = new Scanner(System.in);
//			System.out.println("enter some text: ");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
//		}
		
		try {
		File file = new File("myfile.txt");
		Scanner input;
		
			input = new Scanner(file);
			while(input.hasNextLine()){
				String line = input.nextLine();
				System.out.println(line);
		} 
		
		input.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
	 }
		MyFileUtilss myUtil = new MyFileUtilss();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
	
	
	
}
