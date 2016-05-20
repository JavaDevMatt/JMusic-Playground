package pl.javadevmatt.jmusicplayground;

import pl.javadevmatt.jmusicplayground.songs.Song1;


public class ConsoleLauncher {

	public static void main(String[] args) {
		
		Song1 song = new Song1();
		song.showNotes();
		song.repeat(3);
		song.saveTheMidi();
		song.play();
	     
	}

}
