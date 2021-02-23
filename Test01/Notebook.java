package test01;

public class Notebook {
	private String subject;
	private int sheets;
	private String color;
	
	public Notebook() {
	}
	
	public Notebook(String subject, int sheets, String color) {
		this.setSubject(subject);
		this.setSheets(sheets);
		this.setColor(color);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSheets() {
		return sheets;
	}

	public void setSheets(int sheets) {
		this.sheets = sheets;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
