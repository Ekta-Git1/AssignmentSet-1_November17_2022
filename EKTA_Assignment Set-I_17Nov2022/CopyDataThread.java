package Java_Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class CopyDataThread implements Runnable {
	private String sourceFile;
	private String targetFile;
	public CopyDataThread(String sourceFile, String targetFile) {
		super();
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
		new Thread(this).start();
	}
	@Override
	// use run() method to read and write 10 characters
	public void run() { 
		try(FileInputStream fis = new FileInputStream(sourceFile); 
			FileOutputStream fos = new FileOutputStream(targetFile)) {
			byte[] barr = new byte[10];
			
			//read full 10 bytes until it not equals to -1
			while(fis.read(barr) != -1) {	 
				// 5 Sec
				Thread.sleep(5000);
				// writing same byte array in fos
				fos.write(barr); 
				// Coping 10 characters
				System.out.println("10 characters are copied"); 
			}
		}catch(IOException iex) {

		} catch (InterruptedException e) {
			
		}
	}
}


