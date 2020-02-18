package headfirst.midi_music_app;

import javax.sound.midi.*;

public class MiniMidiMusicApp {

    public static void main(String[] args) {
        MiniMidiMusicApp mini = new MiniMidiMusicApp();
        mini.play();
    }

    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, 5,0);
            MidiEvent firstME = new MidiEvent(first, 0);
            track.add(firstME);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 20, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
