package pl.javadevmatt.jmusicplayground;

import jm.JMC;
import jm.music.data.Note;
import jm.util.Play;

public class ConsoleLauncher {

	public static void main(String[] args) {
		
		// starting out!
		
		Note note = new Note();
		note.setPitch(JMC.C3);
		note.setDynamic(JMC.FF);
		note.setDuration(1/4);
		 
		Play.midi(note);
	}

}
