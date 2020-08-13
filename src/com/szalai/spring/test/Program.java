package com.szalai.spring.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.szalai.spring.test.dao.FilesDao;
import com.szalai.spring.test.entity.*;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/szalai/spring/test/beans/beans.xml");
		
		//Checking database connection from here ----------------------------------------
		FilesDao filesDao = (FilesDao)context.getBean("filesDao");
		try {
			List<TestFile> files = filesDao.getFiles();
			
			for (TestFile file : files) {
				System.out.println(file);
			}
			
		}
		catch (CannotGetJdbcConnectionException e) {
			System.out.println("Can not get database connection.");
		}
		
		catch (DataAccessException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
		//to here ----------------------------------------------------------------------
		
		Company comp1 = new Company(1, "ForumDigital", "This is my company",
				new Document(1, "Szerzodesek", "Ez egy leiras."));

		try {

			System.out.println("Press enter for chosing a file.");

			String filename = File.separator + "tmp";
			JFileChooser fc = new JFileChooser(new File(filename));
			JFrame frame = new JFrame();

			// Show open dialog; this method does not return until the dialog is closed
			fc.showOpenDialog(frame);
			File selFile = fc.getSelectedFile();

			// Show save dialog; this method does not return until the dialog is closed
			// fc.showSaveDialog(frame);
			// selFile = fc.getSelectedFile();

			printContent(selFile);

			comp1.getDocument().getFiles().add(selFile);
			comp1.getDocument().getFiles().add(selFile);

			System.out.println(comp1.getDocument().getFiles().size());

		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// Printing out comp1.toConsole() after Files added
		System.out.println(comp1.toString());
		
		((ClassPathXmlApplicationContext)context).close();
	}

	private static void printContent(File file) {
		try {
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
