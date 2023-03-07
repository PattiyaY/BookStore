package BookStoreApp_Fullversion;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookStore {
	private String[][] book;
	private String file = "/Users/pattiyayiadram/Java project/BookStore - Customer1.csv";
	private Data customerData = new Data();
	Scanner sc;
	
	 
	
	public BookStore(){

	}
	
	public void addCustomer(String firstName, String lastName, String email, String password, String address, String phoneNumber) throws IOException {
		
		List<String[]> info = customerData.parse(file, ",");
		String id = Integer.toString(1000 + info.size()-1);
		char point = '0';
		
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(id + "," + firstName +","+ lastName +","+ email +","+ password +","+ address +","+ phoneNumber +"," + point);
		bw.close();
		
		//JOptionPane.showMessageDialog(null, "Record Saved!");
	}
	
	
	public void addRewardPoint(String id, String point) throws IOException {
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		List<String[]> info = customerData.parse(file, ",");
		for(String[] account: info) {
				if(account[0].equals(id)) {
					//account[7] = bw.write(point);
					JOptionPane.showMessageDialog(null, "Reward points Saved!");
				}
			}
		} 
		
	}


