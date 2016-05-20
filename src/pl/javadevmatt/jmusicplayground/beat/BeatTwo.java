package pl.javadevmatt.jmusicplayground.beat;

import jm.music.data.Phrase;

public class BeatTwo extends DrumBeat{

	@Override
	protected String getName() {
		return "Beat Two";
	}

	@Override
	protected void composeKicks(Phrase kicks) {
		kicks.addNote(KICK_CROTCHET);
		kicks.addNote(REST_CROTCHET);
		kicks.addNote(KICK_EN);
		kicks.addNote(KICK_EN);
		
	}

	@Override
	protected void composeSnare(Phrase snare) {
		snare.addNote(REST_CROTCHET);
		snare.addNote(SNARE_CROTCHET);
		snare.addNote(REST_CROTCHET);
		snare.addNote(SNARE_EN);
		snare.addNote(REST_EN);
	}

	@Override
	protected void composeHats(Phrase hats) {
		for(int i = 0; i < 16; i++){
			hats.addNote(HAT_SN);
		}
	}

	@Override
	protected double getTempo() {
		return 80;
	}


}
