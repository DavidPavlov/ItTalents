package contracts;

public interface IElectronicDevice extends ISecuredNotepad {
	
	public void start();
	
	public void stop();
	
	public boolean isStarted();
}
