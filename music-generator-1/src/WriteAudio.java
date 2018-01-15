import jm.util.*;

public final class WriteAudio {

	public void write() {
		
		float[] data = Read.audio("res/harpeggio.wav");
		Write.audio(data, "res/output/harp.aif"); 
		
	}
	
}
