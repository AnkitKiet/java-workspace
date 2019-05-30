package com.practice.util;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOWorker {
	final String path = "/Users/Ankit/workspace/java-workspace/GeeksForGeeks";

	private void readFile() {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(path + "/Notes.txt");
			int i;
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}
			fileReader.close();
		} catch (IOException e) {
			System.out.print(e);
		}

	}

	// writes a new file
	private void writeFile() {
		FileWriter fileWriter = null;
		String contentToWrite = "My name is ankit.";
		try {
			fileWriter = new FileWriter(path + "/Notes.txt");
			fileWriter.append(contentToWrite);
			fileWriter.close();
			readFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// can be appended using true as 2nd param
	public void usingFileOutputStream() {
		String textToAppend = "\r\n Happy Learning !!"; // new line in content
		try {
			FileOutputStream outputStream = new FileOutputStream(path + "/Notes.txt", true);
			byte[] strToBytes = textToAppend.getBytes();
			outputStream.write(strToBytes);

			outputStream.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		IOWorker ioWorker = new IOWorker();
		ioWorker.readFile();
		ioWorker.usingFileOutputStream();
	}

}
