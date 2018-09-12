import java.util.Scanner;
public class numberunner{
	public numberunner(){
		numberconvert c=new numberconvert();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of what you would like to convert.");
		System.out.println();
		System.out.println("1. Decimal to Binary");
		System.out.println("2. Binary to Decimal");
		System.out.println("3. Decimal to Hex");
		System.out.println("4. Hex to Decimal");
		System.out.println("5. Binary to Hex");
		System.out.println("6. Hex to Binary");
		System.out.println();
		System.out.print("What would you like to convert: ");
		String choice = scan.next();
		System.out.println();
		if(choice.equals("1")){
			System.out.print("Enter Decimal Value: ");
			int value = scan.nextInt();
			System.out.println("Binary Value: " + c.decToBin(Integer.toString(value)));
		}
		else if(choice.equals("2")){
			System.out.print("Enter Binary Value: ");
			int value = scan.nextInt();
			System.out.println("Decimal Value: " + c.binToDec(Integer.toString(value)));
		}
		else if(choice.equals("3")){
			System.out.print("Enter Decimal Value: ");
			int value = scan.nextInt();
			System.out.println("Hex Value: " + c.decToHex(Integer.toString(value)));
		}
		else if(choice.equals("4")){
			System.out.print("Enter Hex Value: ");
			String value = scan.next	();
			System.out.println("Decimal Value: " + c.hexToDec(value));
		}
		else if(choice.equals("5")){
			System.out.print("Enter Binary Value: ");
			int value = scan.nextInt();
			System.out.println("Hex Value: " + c.binToHex(Integer.toString(value)));
		}
		else if(choice.equals("6")){
			System.out.print("Enter Hex Value: ");
			String value = scan.next();
			System.out.println("Binary Value: " + c.hexToBin(value));
		}
		else{
			System.out.println("------------------------------");
			System.out.println("|FATAL ERROR! PLEASE RESTART!|");
			System.out.println("------------------------------");
		}

	}
	public static void main(String[] args){
		numberunner app = new numberunner();
	}
}