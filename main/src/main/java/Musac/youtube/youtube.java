package Musac.youtube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class youtube {
	public static void extract_sound_of(String youtube_url, String output_file_name) throws IOException{
		Runtime rt = Runtime.getRuntime();
		Process proc;
		proc = rt.exec("rm "+output_file_name+".m4a");
		proc = rt.exec("/usr/local/bin/youtube-dl -f 140 -o "+output_file_name+".%(ext)s "
				+ youtube_url);
		//get info
		getCommandLogs(proc);
	}
	
	public static void convert_m4a_to_mp3(String input_file_name, String output_file_name) throws IOException{
		Runtime rt = Runtime.getRuntime();
		Process proc;
		proc = rt.exec("rm "+output_file_name+".mp3");
		proc = rt
				.exec("/usr/local/bin/ffmpeg -i "+input_file_name+".m4a -acodec libmp3lame -ab 128k "+output_file_name+".mp3");
		//get info
		getCommandLogs(proc);
	}
	private static void getCommandLogs(Process proc) throws IOException {
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(
				proc.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(
				proc.getErrorStream()));

		// read the output from the command
		System.out.println("Here is the standard output of the command:\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
			System.out.println(s);
		}

		// read any errors from the attempted command
		System.out
				.println("Here is the standard error of the command (if any):\n");
		while ((s = stdError.readLine()) != null) {
			System.out.println(s);
		}
	}
}
