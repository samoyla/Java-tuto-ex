import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.io.File;
import java.util.List;
import java.io.*;


public class Main{
	public static void main(String[] args){
		// ArrayList<Integer> list = new ArrayList<>();
		// list.add(25);
		// list.add(4);
		// list.add(-9);
		// list.add("text");
		// list.add(new Object());
		// System.out.println(list.get(0));
		// list.remove(0);
		// System.out.println(list);
		// if(list.size() != 2){
		// 	System.out.println("my listarray");
		// }
		// if(list.contains(25)){
		// 	System.out.println("the element exists");
		// }
		// else{
		// 	System.out.println("the element does not exist");
		// }

		// Map<String, Integer> ages = new HashMap<>();
		// ages.put("Sam", 39);
		// ages.put("Bob", 27);
		// ages.put("Felix", 3);

		// System.out.println(ages.toString());
		// System.out.println(ages.get("Sam"));
		// ages.remove("Felix");
		// System.out.println(ages.toString());
		// if(ages.containsKey("Sam")){
		// 	System.out.println("the key exists");
		// }
		// else{
		// 	System.out.println("the key does not exist");
		// }
		// if(ages.containsValue(27)){
		// 	System.out.println("the value exists");
		// }
		// else{
		// 	System.out.println("the value does not exist");
		// }
		// ages.remove("Bob");
		// System.out.println(ages.toString());
		// if(ages.containsValue(27)){
		// 	System.out.println("the value exists");
		// }
		// else{
		// 	System.out.println("the value does not exist");
		// }
		// for(String string: ages.keySet()){
		// 	System.out.println(string);
		// }
		// for(Entry<String, Integer> element: ages.entrySet()){
		// 	System.out.println("key: " + element.getKey() + ", value: " + element.getValue());
		// }

		// int average = 0;
		// for(Entry<String, Integer> element: ages.entrySet()){
		// 	average += element.getValue();
		// }
		// System.out.println("average is: " + average/ages.size());

	// 	int[] nums = {4, 7 , 9, 1};
	// 	int calcul = 5 + 1;
		
	// 	try{
	// 		System.out.println(nums[4]);
	// 		calcul /= 0;
	// 	}catch(ArrayIndexOutOfBoundsException| ArithmeticException e){
	// 		// 
	// 		System.out.println("Error");
	// 	}finally{
	// 		System.out.println("la vie est belle");
	// 	}

	// 	double balance = 50;
	// 	double price = 200;
	// 	try {
	// 		buy(balance, price);
	// 	} catch (NoMoneyException e) {
	// 		e.printStackTrace();
	// 	}

	// }
	
	// 	private static void buy(double balance, double price)  throws NoMoneyException{
	// 		double b = balance - price;
	// 		if(b < 0){
	// 			throw new NoMoneyException();
	// 		}
	// 		System.out.println(b);
	// 	}

// 	Timer chrono = new Timer();
// 	chrono.schedule(new CustomTimer(), 1000, 1000);
		// File file = new File("/mnt/nfs/homes/masamoil/sgoinfre/Java/index.html");
		// File folder = new File("/mnt/nfs/homes/masamoil/sgoinfre/Java/folder");
		// if(!folder.exists()){
		// 	folder.mkdir();
		// }
		// if(!file.exists()){
		// 	try {
		// 		file.createNewFile();
		// 	} catch (IOException e) {
		// 		e.printStackTrace();
		// 	}
		// }
		// else{
			
		// 	//List<String> htmlLines = Arrays.asList("<html>", "<head>", "<title>My title</title>", "</head>","<body>", "<p> Hello, it's sam ! </p>", "</body>", "</html>");
			
		// 	try {
		// 		InputStream inputstream = new FileInputStream("index.html");
		// 		BufferedReader reader = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
		// 		String line = reader.readLine();
		// 		while(line != null){
		// 			System.out.println(line);
		// 			line = reader.readLine();
		// 		}
		// 		reader.close();
		// 		// FileWriter writer = new FileWriter(file);
		// 		// BufferedWriter bw = new BufferedWriter(writer);
		// 		// bw.write("hello people, it's me !!!");
		// 		// bw.newLine();
		// 		// bw.write("yeah !!!");
		// 		// bw.newLine();
		// 		// for(String line: htmlLines){
		// 		// 	bw.write(line);
		// 		// 	bw.newLine();
		// 		// }
		// 		// bw.close();
		// 		// writer.close();
		// 	} catch (IOException e) {
		// 		e.printStackTrace();
		// 	}
			
		// }

		// File source = new File("/mnt/nfs/homes/masamoil/sgoinfre/Java/index.html");
		// File dest = new File("/mnt/nfs/homes/masamoil/sgoinfre/Java/folder/index.html");
		// try {
		// 	Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// }
		// source.delete();


		//Callbacks
	//
	
	// 
	
	Account<Character> myAccount = new Account<Character>("Sam", 100, '$');
	myAccount.showBalance();

	Account<String> otherAccount = new Account<String>("Bob", 10, "dollars");
	otherAccount.showBalance();
	}


}
