package uiDJ;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;

public class ManualButton {

	private JFrame ourFrame = new JFrame("DJ APP WITH SWING.UI");

	// The manual popup.
	ManualButton() {

		ourFrame.setBounds(200, 200, 650, 200);

		Container container = ourFrame.getContentPane();
		container.setLayout(null);

		JLabel headline = new JLabel("Become the most successful DJ! ");
		headline.setBounds(10, 10, 350, 20);

		JLabel rad1 = new JLabel("#1 Play around with the sounds before you click 'START MUSIC'.");
		rad1.setBounds(10, 50, 500, 20);

		JLabel rad2 = new JLabel("#2 Once you've start the music, make your best effort with all the cool sounds!");
		rad2.setBounds(10, 70, 500, 20);

		JLabel rad3 = new JLabel(
				"#3 If you have an annoying neighbour, maximise your volume and spam the 'START MUSIC' button. ");
		rad3.setBounds(10, 90, 650, 20);

		JLabel rad4 = new JLabel("#4 When you feel done, close the app and it will automatically shutdown.");
		rad4.setBounds(10, 110, 550, 20);

		container.add(headline);
		container.add(rad1);
		container.add(rad2);
		container.add(rad3);
		container.add(rad4);
		ourFrame.setVisible(true);

	}
}
