package Musac.main;

import java.io.IOException;

import Musac.youtube.youtube;
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException,
			IOException {

		// Helpful for debug
		// System.out.println("Working on " + System.getProperty("os.name"));
		// proc =
		// rt.exec("/usr/local/bin/youtube-dl -x --audio-format mp3 --audio-quality 4 -o test.%(ext)s https://www.youtube.com/watch?v=A1CKiO8CbEs");
		// proc = rt.exec("pwd"); //current folder
		// proc = rt.exec("ls"); //current folder
		// proc.waitFor();
		// Tools end
		String youtubeUrl = "https://www.youtube.com/watch?v=A1CKiO8CbEs";
		
		System.out.println("Downloading in process...");
		// extract youtube video song
		youtube.extract_sound_of(youtubeUrl, "test");
		// convert extracted video
		youtube.convert_m4a_to_mp3("test", "output");

		System.out.println("Downloading done...");

	}

	
}
