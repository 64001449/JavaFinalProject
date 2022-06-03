

package Classwork;

import java.util.Scanner;
import java.util.ArrayList;

public class FinalProject {

	public static void main (String[] args) {
		String[] eyeColor = {"blue", "hazel", "brown", "dark brown"};
		String[] hair = {"black", "brown", "blonde"};
		String[] heights = {"5.11", "5.9", "5.6", "5.4", "5.8"};
		String[][] categories = {eyeColor, hair, heights};
		String[] options = {"eye", "hair", "he"};
		ArrayList<FinalProjectObject> finalp = new ArrayList<>();
		FinalProjectObject obj = new FinalProjectObject("brown", "black", "5.9", "Aditya S");
		FinalProjectObject obj2 = new FinalProjectObject("blue", "black", "5.11", "Aditya K");
		finalp.add(obj);
		finalp.add(obj2);
		Scanner keyboard = new Scanner(System.in); 
		String next = keyboard.nextLine();
		while (finalp.size() > 1) {
		int r = randNum();
		String[] chosen = categories[r];
		String real = options[r];
		String real2 = iterate(chosen, finalp, real, next);
		next = keyboard.nextLine();
		if (next.equals("yes")) {
		finalp = returnA(real2, real, finalp);
			}
		else if (next.equals("no")) {
		finalp = returnAT(real2, real, finalp);
		}
		}
		System.out.println(finalp.get(0).getName());
		}
	public static int randNum() {
		int r = (int) (Math.random() * 3);
		return r;
	}
	public static String iterate(String[] words, ArrayList<FinalProjectObject> obj, String name, String there) {
		String next = there;
		int i = 0;
		String real = "";
			if (name.equals("eye")) {
			System.out.println("Are their eyes " + words[i] + "?");
			}
			else if (name.equals("hair")) {
			System.out.println("Is their hair " + words[i] + "?");
			}
			else if (name.equals("Glasses")) {
		    System.out.println("Do they have glasses?");
			}
			else if (name.equals("he")) {
			System.out.println("Is their height " + words[i] + "?");
			}
			real = words[i];
			return real;
   }
	public static ArrayList<FinalProjectObject> returnA (String real, String name, ArrayList<FinalProjectObject> obj) {
		for (int j = 0; j < obj.size(); j++) {
			if (name.equals("eye")) {
				if (!obj.get(j).getEye().equals(real)) {
					obj.remove(j);
					j--;
				}
			}
			else if (name.equals("hair")) {
				if (!obj.get(j).getHair().equals(real)) {
					obj.remove(j);
					j--;
				}
			}
			else if (name.equals("he")) {
				if (!obj.get(j).getHeight().equals(real)) {
					obj.remove(j);
					j--;
			  }
		   }
		 }
		return obj;
	}
	public static ArrayList<FinalProjectObject> returnAT (String real, String name, ArrayList<FinalProjectObject> obj) {
		for (int j = 0; j < obj.size(); j++) {
			if (name.equals("eye")) {
				if (obj.get(j).getEye().equals(real)) {
					obj.remove(j);
					j--;
				}
			}
			else if (name.equals("he")) {
				if (obj.get(j).getHeight().equals(real)) {
					obj.remove(j);
					j--;
			  }
		   }
			else if (name.equals("hair")) {
				if (obj.get(j).getHair().equals(real)) {
					obj.remove(j);
					j--;
				}
			}
		 }
		return obj;
	}
}
