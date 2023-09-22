import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

	private String readFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(archive));
		String line;
		StringBuilder sb = new StringBuilder();
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line).append(System.lineSeparator());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
		return sb.toString();
	}

	public String readFileNIO() throws IOException {
		String s = Files.readString(archive.toPath());
		return s;
	}

	public String writeFromKeyboard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write: ");
		String text = sc.nextLine();
		return text;
	}

	private void writeFromString() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(archive));
		bw.write(writeFromKeyboard());
	}
}