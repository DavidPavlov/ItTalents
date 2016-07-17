package models;

import java.util.ArrayList;

import contracts.INotepad;

public class SimpleNotepad implements INotepad{
	
	private ArrayList<Page> pages;
	
	public SimpleNotepad() {
		this.pages = new ArrayList<Page>();
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if(this.isValidPage(pageNumber)){
			Page page = this.pages.get(pageNumber-1);
			page.addText(text);
		}		
	}

	@Override
	public void clearPageAndAddText(String text, int pageNumber) {
		if(this.isValidPage(pageNumber)){
			Page page = this.pages.get(pageNumber-1);
			page.clearText();
			page.addText(text);
		}
		
	}

	@Override
	public void clearPage(int pageNumber) {
		if(this.isValidPage(pageNumber)){
			Page page = this.pages.get(pageNumber-1);
			page.clearText();
		}
		
	}

	@Override
	public void previewNotepad() {
		for (int i = 0; i < pages.size(); i++) {
			System.out.println(pages.get(i).pagePreview());
			System.out.println("--------------");
		}
		
	}
	
	private boolean isValidPage(int pageNumber){
		if(this.pages.size() < pageNumber || pageNumber <= 0){
			return false;
		}
		return true;
	}
	
	public void addPage(Page page){
		if(page != null){
			this.pages.add(page);
		}
	}

	@Override
	public boolean searchWord(String word) {
		for (Page page : pages) {
			if(page.searchWord(word)){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (Page page : pages) {
			if(page.containsDigits()){
				page.pagePreview();
			}
		}		
	}
}
