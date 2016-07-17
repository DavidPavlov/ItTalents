package models;

import contracts.IElectronicDevice;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;
	
	public ElectronicSecuredNotepad(String password) {
		super(password);
	}

	@Override
	public void start() {
		this.isStarted = true;
		
	}

	@Override
	public void stop() {
		this.isStarted = false;
		
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if(this.isStarted){
			super.addTextToPage(text, pageNumber);
		}		
	}

	@Override
	public void clearPageAndAddText(String text, int pageNumber) {
		if(this.isStarted){
			super.clearPageAndAddText(text, pageNumber);
		}
	}

	@Override
	public void clearPage(int pageNumber) {
		if(this.isStarted){
			super.clearPage(pageNumber);
		}
	}

	@Override
	public void previewNotepad() {
		if(this.isStarted){
			super.previewNotepad();
		}
	}

	@Override
	public void addPage(Page page) {
		if(this.isStarted){
			super.addPage(page);
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(this.isStarted){
			return super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if(this.isStarted){
			super.printAllPagesWithDigits();
		}
	}
	
	
}
