package demo;

import contracts.ISecuredNotepad;
import models.ElectronicSecuredNotepad;
import models.Page;
import models.SecuredNotepad;
import models.SimpleNotepad;

public class Demo {
	
	public static void main(String[] args) {
		Page first = new Page("FirstPage");
		Page second = new Page("Second");
		Page third = new Page("Third");
		Page fourth = new Page("Fourth");
		first.addText("Some shit in the new page...");
		System.out.println(first.pagePreview());
		
		SimpleNotepad belejnik = new SimpleNotepad();
		belejnik.addPage(first);
		belejnik.addPage(second);
		belejnik.addPage(third);
		belejnik.addPage(fourth);
		belejnik.addTextToPage("Adding some text", 2);
		belejnik.addTextToPage("Third page is cool", 3);
		belejnik.addTextToPage("fourth page is cooler", 4);
		belejnik.previewNotepad();
		
		ISecuredNotepad crypt = new SecuredNotepad("abcD1");
		crypt.addPage(first);
		crypt.addPage(second);
		crypt.addPage(third);
		crypt.addPage(fourth);
		crypt.addTextToPage("Testing password", 1);
		crypt.clearPage(3);
		crypt.clearPageAndAddText("Second page sucks", 2);
		crypt.previewNotepad();
		
		System.out.println("########");
		ElectronicSecuredNotepad el = new ElectronicSecuredNotepad("password");
		el.start();
		el.addPage(first);
		el.addPage(second);
		el.addPage(third);
		el.addPage(fourth);
		
		el.addTextToPage("Adding some text on the el device", 3);
		el.stop();
		el.addTextToPage("This text will not be added", 2);
		el.start();
		el.previewNotepad();
		
	}
}
