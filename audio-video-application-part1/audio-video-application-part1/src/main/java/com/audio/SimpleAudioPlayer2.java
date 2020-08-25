package com.audio;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.*; // import JMF classes
import javax.swing.JFileChooser;

/**
 *
 * @author BUDDHIMA
 */

public class SimpleAudioPlayer2 {

	private Player audioPlayer = null;

	public SimpleAudioPlayer2(URL url) {

		try {

//MediaLocator ml=new MediaLocator(url);

			audioPlayer = Manager.createPlayer(url);

		} catch (Exception ex) {

			System.out.println(ex);

		}

	}

public SimpleAudioPlayer2(File file) throws MalformedURLException {
 
this(file.toURI().toURL());
 
}

	public void play() {

		audioPlayer.start(); // start playing

	}

	public void stop() {

		audioPlayer.stop(); // stop playing

		audioPlayer.close();

	}

	public static void main(String[] args) {

		try {

// TODO code application logic here

			JFileChooser fc = new JFileChooser();

			fc.showOpenDialog(null);

			File file = fc.getSelectedFile();

			SimpleAudioPlayer2 sap = new SimpleAudioPlayer2(file);

			sap.play();

//sap.stop();

		} catch (MalformedURLException ex) {

			System.out.println(ex);

		}

	}

}
