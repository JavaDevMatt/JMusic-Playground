package pl.javadevmatt.jmusicplayground.beat;

class WriteBasicBeat {
    static final DrumBeat beat = new BasicBeat();

    public static final void main(final String[] args) {
            beat.saveToFileAndPlay();
    }
}