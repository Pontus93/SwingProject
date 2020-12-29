package uiDJ;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class playSound {

	public void play(String event) {

		try {
			if (event.equals("buttonManual")) {
				new ManualButton();
			} else {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(new File(event)));
				clip.start();
			}
		} catch (Exception exc) {
			System.out.println("something went wrong!");
		}
	}

}
