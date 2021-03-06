package contracts;

import models.Page;

public interface INotepad {
	
	public void addTextToPage(String text, int pageNumber);
	
	public void clearPageAndAddText(String text, int pageNumber);
	
	public void clearPage(int pageNumber);
	
	public void previewNotepad();
	
	public void addPage(Page page);
	
	public boolean searchWord(String word);
	
	public void printAllPagesWithDigits();
}
