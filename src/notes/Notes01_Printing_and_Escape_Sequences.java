package notes;

/*
 * Notes on how to print to the screen
 * Also includes Escape Sequences
 */

public class Notes01_Printing_and_Escape_Sequences {

	public static void main(String[] args) {
		
		// print() Simply prints the String
		System.out.print("Sup yo! ");
		
		// println() prints the String and then a return
		System.out.println("😊");
		System.out.println("Mr Hunter loves CS1");
		
		/*
		 * 
		 * Escape Sequences:
		 * 		\"  actually print a "  (don't end the string)
		 * 		\n  go to the next line (print a return)
		 * 		\\  actually prints a \ (don't start an escape sequence)
		 */
		System.out.println("Adam said, \"Im tired!\"");
		System.out.println("When I was\ngoing to Saint Eyve's");
		System.out.println("\\");
		
		problem1();
		
	}
	
	public static void problem1() {
		
		System.out.println("Thand GOD tomorrow is Flex!");
		
	}
	
	
}
