package git_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import git_test.entity.Company;

/*
 * 
 * Change BC
 * 
 */
public class Program {

	public static void main(String[] args) {

		Company comp1 = new Company(1, "ForumDigital", "This is my company");
		System.out.println(comp1.toString());
		
		
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

			Scanner myReader = new Scanner(selFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		//Adding file to companies documents
	}
}
