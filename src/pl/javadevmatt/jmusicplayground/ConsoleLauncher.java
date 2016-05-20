package pl.javadevmatt.jmusicplayground;

import pl.javadevmatt.jmusicplayground.beat.DrumBeat;
import pl.javadevmatt.jmusicplayground.beat.BeatTwo;


public class ConsoleLauncher {
	
	static final DrumBeat beat = new BeatTwo();

	public static void main(String[] args) {
		
		beat.saveToFile();
		
//		Song1 song = new Song1();
//		song.showNotes();
//		song.repeat(3);
//		song.saveTheMidi();
//		song.play();
	     
	}

}
