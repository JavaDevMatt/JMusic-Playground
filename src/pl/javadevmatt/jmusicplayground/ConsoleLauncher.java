package pl.javadevmatt.jmusicplayground;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Phrase;
import jm.util.Play;
import jm.util.View;

public class ConsoleLauncher {

	public static void main(String[] args) {
		
		 Note n = new Note(JMC.C4, JMC.QUARTER_NOTE);
		 Note n2 = new Note(JMC.D4, JMC.QUARTER_NOTE);
		 Note n3 = new Note(JMC.E4, JMC.QUARTER_NOTE);
		 
	     Phrase phr = new Phrase();
	     phr.addNote(n);
	     phr.addNote(n2);
	     phr.addNote(n3);
	        
	     View.notate(phr);
	     Play.midi(phr);
	     
	}

}
