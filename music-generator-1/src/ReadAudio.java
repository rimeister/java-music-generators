import jm.util.*;

public final class ReadAudio {

	public static void main(String[] args) {
		float[] data = Read.audio("res/harpeggio.wav"); // Put the sample data into a floating point array
		
		for (int i = 0; i < data.length; i+=10) {

			for (int j = 0; j-40<data[i]*40;j++) {
				System.out.print(" ");
			}

			System.out.println("o");
			
		}
		
	}
	
}
