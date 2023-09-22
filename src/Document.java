import java.io.File;

public class Document {
	File archive = null;
	String name;

	public Document(String name) {
		this.name = name;
	}
	
	public boolean exists() {
		return (archive != null && archive.exists());
	}
	
	private String readFile() {
		// TODO Auto-generated method stub

	}
}
