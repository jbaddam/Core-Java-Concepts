package com.bootcamp.corejava.exception.lab1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jagan Reddy
 * This class has a functionality to transfer the file into another 
 * by removing blank line and lines start with //
 */
public class FileTransform {
	
/**
 * @param sourceFile
 * @param destinationFile
 * method to transfer the file into another 
 * by removing blank line and lines start with //
 */
public void transformAndCopyFile(String sourceFile, String destinationFile)  {
		
		
		try {
				
			FileReader fileToRead = new FileReader(sourceFile);
			PrintWriter fileToWrite = new PrintWriter(destinationFile);
			
			String line;
			
			BufferedReader bufferedReader = new BufferedReader(fileToRead);
 
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().isEmpty() || line.matches(".*//.*")){
                	
                }
                else {
                	fileToWrite.println(line);
                	System.out.println("file transffering");
                }
                
            }
		    System.out.println("\n\nDone!");
            fileToRead.close();
            fileToWrite.close();
		}
		 catch (FileNotFoundException e) {
			System.out.println("File not Fund in the given location");
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
				
	}
public static void main(String[] args) {
	
	String fileName = "C:/BcjMay16/GitRepo/BCJAssignments_JaganReddy/src/com/bootcamp/corejava/exception/lab1/myFile.txt";
	String dirName = "C:/BcjMay16/GitRepo/BCJAssignments_JaganReddy/src/com/bootcamp/corejava/exception/lab1/newFile.txt";
	FileTransform fileTransform = new FileTransform();
	
	fileTransform.transformAndCopyFile(fileName, dirName);
	
}

}

