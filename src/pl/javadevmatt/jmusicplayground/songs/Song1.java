package pl.javadevmatt.jmusicplayground.songs;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Phrase;
import jm.music.tools.Mod;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;

public class Song1 {
	
	private Phrase phrase;

	public Song1(){
		init();
	}

	private void init() {
		 Note n = new Note(JMC.C4, JMC.QUARTER_NOTE);
		 Note n2 = new Note(JMC.D4, JMC.QUARTER_NOTE);
		 Note n3 = new Note(JMC.E4, JMC.QUARTER_NOTE);
		 
		 phrase = new Phrase();
		 phrase.addNote(n);
		 phrase.addNote(n2);
		 phrase.addNote(n3);
	}
	
	public void showNotes(){
		View.notate(phrase);
	}
	
	public void play(){
		 Play.midi(phrase);
	}
	
	public void repeat(int i){
		Mod.repeat(phrase, 3);
	}
	
	public void saveTheMidi(){
		Write.midi(phrase, "file.mid");
	}
}
