package pl.javadevmatt.jmusicplayground;

import jm.music.data.Note;
import jm.util.Play;

public class ConsoleLauncher {

	public static void main(String[] args) {
		
		// starting out!
		
		Note note = new Note(60, 0.5d);
		 
		Play.midi(note);
	}

}
