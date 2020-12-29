package uiDJ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class interFace implements ActionListener {
	private int count = 3;
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel bottomText1;
	private JLabel bottomText2;
	private JLabel djGif;
	private ImageIcon imageDj;

	public interFace() {

		// Customise the interFace.
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("NO MUSIC IS PLAYING RIGHT NOW", SwingConstants.CENTER);
		bottomText1 = new JLabel("", SwingConstants.CENTER);
		bottomText2 = new JLabel("", SwingConstants.CENTER);
		imageDj = new ImageIcon(getClass().getResource("djgif.gif"));
		djGif = new JLabel(imageDj);
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 0, 50));
		panel.setLayout(new GridLayout(5, 0));
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		// Declare buttons & add to panel + eventListener.
		JButton button0 = new JButton("START MUSIC");
		JButton button1 = new JButton("PLING!");
		JButton button2 = new JButton("SCRATCH1");
		JButton button3 = new JButton("SCRATCH2");
		JButton button4 = new JButton("SCRATCH3");
		JButton button5 = new JButton("SCRATCH4");
		JButton button6 = new JButton("CRAZY");
		JButton button7 = new JButton("HORN1");
		JButton button8 = new JButton("HORN2");
		JButton button9 = new JButton("THANK YOU");
		JButton buttonManual = new JButton("MANUAL");

		buttonManual.addActionListener((ActionListener) this);
		buttonManual.setActionCommand("buttonManual");
		button0.addActionListener((ActionListener) this);
		button0.setActionCommand("mainSound.wav");
		button1.addActionListener((ActionListener) this);
		button1.setActionCommand("sound1.wav");
		button2.addActionListener((ActionListener) this);
		button2.setActionCommand("sound2.wav");
		button3.addActionListener((ActionListener) this);
		button3.setActionCommand("sound3.wav");
		button4.addActionListener((ActionListener) this);
		button4.setActionCommand("sound4.wav");
		button5.addActionListener((ActionListener) this);
		button5.setActionCommand("sound5.wav");
		button6.addActionListener((ActionListener) this);
		button6.setActionCommand("sound6.wav");
		button7.addActionListener((ActionListener) this);
		button7.setActionCommand("sound7.wav");
		button8.addActionListener((ActionListener) this);
		button8.setActionCommand("sound8.wav");
		button9.addActionListener((ActionListener) this);
		button9.setActionCommand("sound9.wav");

		panel.add(label);
		panel.add(button0);
		panel.add(buttonManual);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button9);
		panel.add(bottomText1);
		panel.add(bottomText2);
		panel.add(djGif);
		panel.setBackground(Color.WHITE);
		frame.pack();
	}

	// Send the data with event(String) to our audioSystem in playSound.Java.
	@Override
	public void actionPerformed(ActionEvent event) {
		count++;
		String senddata = event.getActionCommand();
		playSound sound = new playSound();

		sound.play(senddata);

		if (count % 2 == 0) {
			label.setText("good work!");

		} else {
			label.setText("nice flow!");
		}

	}
}
