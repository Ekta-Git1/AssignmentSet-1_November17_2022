package Java_Assignment;

import java.util.Scanner;

public class CheckFileType {
	/*
	 * Input the path of the file in the format "C:/MyPics/Passport.jpg". Now find whether the file specified is a valid image file. If yes, then display the message "Passport.jpg is a valid file", or else, display "Passport.docx is not a valid image file".
(Please note that the input is in the form of a path, but the message has only the file name)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter File name ");
		String fileName = scanner.nextLine();

		int fileSeparator = fileName.lastIndexOf('.');
		String ext = fileName.substring(fileSeparator);
		String docName = fileName.substring(fileName.lastIndexOf('/')+1);
		
		switch(ext) {
			case ".jpg":
			case ".jpeg":
			case ".png":
			case ".gif":
				System.out.println(docName + " is valid image file");
				break;
			default:
				System.out.println(docName + " is not valid image file");
		}
		scanner.close();
	}
}

