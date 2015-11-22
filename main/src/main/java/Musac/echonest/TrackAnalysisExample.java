/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Musac.echonest;

import com.echonest.api.v4.EchoNestAPI;
import com.echonest.api.v4.EchoNestException;
import com.echonest.api.v4.Song;
import com.echonest.api.v4.TimedEvent;
import com.echonest.api.v4.Track;
import com.echonest.api.v4.TrackAnalysis;
import java.io.File;
import java.io.IOException;

/**
 * This example will demonstrate uploading an MP3, analyzing it and getting the
 * audio summary and the timing info for all of the beats
 *
 * @author plamere
 */
public class TrackAnalysisExample {

    public static void main(String[] args) throws EchoNestException {
        EchoNestAPI en = new EchoNestAPI("42RAVOBVFKGHTOTTB");

        String path = "ressources/Always.mp3";

        if (args.length > 2) {
            path = args[1];
        }

        File file = new File(path);
        Song song = new Song(en, "Always");
        

        if (!file.exists()) {
            System.err.println("Can't find " + path);
        } else {

        	
            try {
                Track track = en.uploadTrack(file,false);
                track.waitForAnalysis(30000);

                if (track.getStatus() == Track.AnalysisStatus.COMPLETE) {
                    System.out.println("Tempo: " + track.getTempo());
                    System.out.println("Title: " + track.getTitle());
                    System.out.println("ArtistName: " + track.getArtistName());
                    System.out.println("Status: " + track.getStatus());
                    System.out.println("Loudness: " + track.getLoudness());
                    System.out.println("TimeSignature: " + track.getTimeSignature());

                    TrackAnalysis analysis = track.getAnalysis();

                } else {
                    System.err.println("Trouble analysing track " + track.getStatus());
                }
            } catch (IOException e) {
                System.err.println("Trouble uploading file");
            }

        }
    }
}