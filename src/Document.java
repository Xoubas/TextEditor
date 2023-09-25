import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Document {
	File archive = null;

	public Document(String name) {
		archive = new File(name);
	}

	public boolean exists() {
		return (archive != null && archive.exists());
	}

	/*
	 * The try/catch FileNotFoundException does the same as the exists method by
	 * checking if the file exists on the system
	 */
	private String readFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(archive));
		String line;
		StringBuilder sb = new StringBuilder();
		if (exists()) {
			try {
				while ((line = reader.readLine()) != null) {
					sb.append(line).append(System.lineSeparator());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				reader.close();
			}
		}

		return sb.toString();
	}

	public String readFileNIO() throws IOException {
		String s = Files.readString(archive.toPath());
		return s;
	}

	private String writeFromKeyboard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write: ");
		String text = sc.nextLine();
		sc.close();
		return text;
	}

	// FileWritter(<file>, true) activates appending
	public void writeFromString() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(archive, true));
		bw.write(writeFromKeyboard());
		if (bw != null)
			bw.close();
	}

	public void writeFromStringPrintWritter() throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(archive, true));
		pw.write(writeFromKeyboard());
	}

	public void writeFromInputStream() {
		InputStream is = new InputStream();
	}
}