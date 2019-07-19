package com.evins.learningfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("myfile.txt");
//		BufferedReader bufferedReader = null;
//		FileReader fileReader = null;
		
		try(FileReader fileReader = new FileReader(file);
				 BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String line = bufferedReader.readLine();
			while(line != null){
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem reading the file"+ file.getName());
		}
//		finally{
//			try {
//				if(bufferedReader != null){
//					bufferedReader.close();
//				}if(fileReader != null){
//					fileReader.close();
//				}
//				
				
				
//			} 
//	catch (IOException e) {
//				// TODO Auto-generated catch block
//				//e.printStackTrace();
//				System.out.println("unable to close file"+ file.getName());
//			}
//			catch(NullPointerException ex){
//				System.out.println("file was probably never opened" + ex);
//			}
			
			
			
			
		}
		
		
	}


