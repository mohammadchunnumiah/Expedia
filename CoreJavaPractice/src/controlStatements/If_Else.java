package controlStatements;

public class If_Else {

	public static void main(String[] args) {

		String col = "green";
		
		if (col.equals("red")) {
			System.out.println("stop");
			
		} else if (col.equalsIgnoreCase("yellow")) {
			System.out.println("slow");
			
		} else if (col.equals("green")) {
			System.out.println("go");

		}
	}
}
