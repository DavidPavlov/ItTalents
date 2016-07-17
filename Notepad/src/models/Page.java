package models;

public class Page {
	private String headline;
	private String text;
	
	public Page(String head) {
		this.headline = head;
		this.text = "";
	}
	
	public void addText(String text){
		if(text != null){
			this.text += text;
		}
	}
	
	public void clearText(){
		this.text = "";
	}
	
	public String pagePreview(){
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s\n", this.headline));
		sb.append(this.text);
		return sb.toString();
	}
	
	public boolean searchWord(String word){
		return this.text.contains(word);
	}
	
	public boolean containsDigits(){
		return this.text.matches("[0-9]");
	}
}
