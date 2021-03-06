package git_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import git_test.entity.*;

public class Program {

	public static void main(String[] args) {
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

		// Adding file to companies documents
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
