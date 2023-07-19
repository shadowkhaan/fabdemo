package nas.lab.samples;

/**
*	This is a sample on JSON prepared for the interview.
*/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class JsonDemo {
		
	private static String FILE1_PATH = "data/customer.json";
	private static String FILE2_PATH = "data/customers.json";
	
	public static void main(String[] agrs) {
		
		try{
			File f = new File(FILE1_PATH);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			Customer customer = new Customer();
			customer.setFirstName("Niyas Ahamed");
			customer.setAge(35);
			customer.setCountry("United Arab Emirates");
			ArrayList<String> list = new ArrayList<String>();
			list.add("Travelling");
			list.add("Drawing");
			list.add("Working on challenges");
			customer.setInterests(list);
			
			Gson gson =  new GsonBuilder().setPrettyPrinting().create();
			try (FileWriter writer = new FileWriter(FILE1_PATH)) {
				gson.toJson(customer, writer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("The below is an example of single class object:\n" + gson.toJson(customer) + "\n\nThe below is the full file path:\n" + f.getAbsolutePath());
			
			f = new File(FILE2_PATH);
			Customer[] customerList = new Customer[2];
			customerList[0] = new Customer();
			customerList[0].setFirstName("Jhonny Depp");
			customerList[0].setAge(45);
			customerList[0].setCountry("United States");
			customerList[0].setInterests(list);
			customerList[1] = new Customer("Davy Jones", 100, "Costa Rica", list);

			System.out.println("\n\nThe below is an example of collection of class objects:\n" + gson.toJson(customerList) + "\n\nThe below is the full file path:\n" + f.getAbsolutePath());
			
			Gson gs = new GsonBuilder().setPrettyPrinting().create();
			try (FileWriter writer = new FileWriter(FILE2_PATH)) {
				gson.toJson(customerList, writer);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
}
