package seleniumPackage;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class ScreeningTool {
	
	
	
	public static void screenTool (String studentNumber, String birthDate) throws IOException, InterruptedException
	{
		
		
		try {
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://covid-assessment.publicboard.ca");
		
			Thread.sleep(4500);
			driver.findElement(By.id("radio-start2")).sendKeys(Keys.LEFT);	
			
			Thread.sleep(4500);
			
			
			driver.findElement(By.id("NoLoginID")).sendKeys(studentNumber);
			driver.findElement(By.id("NoLoginDOB")).sendKeys(birthDate); 
			driver.findElement(By.id("ContinueButton")).sendKeys(Keys.ENTER);
			Thread.sleep(4500);
			driver.findElement(By.id("AdditionalQuestion1No")).sendKeys(Keys.LEFT);
			Thread.sleep(1500);
			driver.close();
			
		}
		
		catch(InterruptedException e){                                                                                                                 //If try statement fails run catch statment with IOException assigned to variable e
		    System.out.println ("Error");                                                                                                              //Prints out Error
		    System.out.println (e);                                                                                                                    //Prints out the error assigned to variable e
		}          
		
		
		
	}
	
	

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		String studentNum;
		String birth;
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		
		 
		try {
			
			
			BufferedReader inputFile  = new BufferedReader (new FileReader("//home//pi//inData")); 
			
			
			
				
				
				while ((studentNum = inputFile.readLine()) != null) {
					
					birth = inputFile.readLine();
					screenTool(studentNum,birth);
				}
				
			System.out.println("Finished Screening for the day of  " + dtf.format(now));
				
				
			inputFile.close();
			
			}
			
		catch(IOException |InterruptedException e){                                                                                                    //If try statement fails run catch statment with IOException assigned to variable e
		    System.out.println ("Error");                                                                                                              //Prints out Error
		    System.out.println (e);                                                                                                                    //Prints out the error assigned to variable e
		} 
		

	}

}
