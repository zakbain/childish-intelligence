package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * A helper class for printing.
 * 
 * @author Zak_b
 *
 */
public class WritingHelper {

	/**
	 * Our esteemed writer.
	 * 
	 * Please if you have strong feelings about War and Peace contact me at
	 * zakbain@gmail.com. This book got me through a very hard time in my life.
	 */
	private BufferedWriter tolstoy;

	/**
	 * Default constructor
	 * 
	 * @param filename
	 */
	public WritingHelper(String filename) {
		try {
			// Create an output stream for the given file.
			OutputStream fileOut = new FileOutputStream(filename);

			// Boy can Tolstoy write. Let's give him the tools to do it
			this.tolstoy = new BufferedWriter(new OutputStreamWriter(fileOut));
		} catch (FileNotFoundException e) {
			// Auto generated
			e.printStackTrace();
		}

	}

	/**
	 * Write the given string to our known destination file.
	 * 
	 * @param str
	 *            The string to write.
	 */
	public void write(String str) {
		try {
			// Write the specified string
			tolstoy.write(str);
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Write the given string to our known destination file.
	 * 
	 * @param str
	 *            The string to write.
	 */
	public void writeLine(String str) {
		try {
			// Write the specified string then add a newline
			tolstoy.write(str);
			tolstoy.newLine();
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
}
