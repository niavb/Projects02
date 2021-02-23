package test01;

public class BiologyNotebook extends Notebook {
	private int modul;
	
	public BiologyNotebook(String subject, int sheets, String color, int modul) {
		super(subject, sheets, color);
		this.setModul(modul);
	}

	public int getModul() {
		return modul;
	}

	public void setModul(int modul) {
		this.modul = modul;
	}
	
	

}
