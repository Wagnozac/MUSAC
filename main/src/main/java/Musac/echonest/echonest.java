package Musac.echonest;

import java.util.List;

import com.echonest.api.v4.Artist;
import com.echonest.api.v4.EchoNestAPI;
import com.echonest.api.v4.EchoNestException;

public class echonest {
	
	public static void main(String[] args) throws EchoNestException {
	    EchoNestAPI echoNest = new EchoNestAPI("42RAVOBVFKGHTOTTB");
	    List<Artist> artists = echoNest.searchArtists("Queen");

	    
	    similaArtists(artists,15);
	}
	
	
	public static void similaArtists (List<Artist> artists, int numberOfArtists) throws EchoNestException{
		
		if (artists.size() > 0) {
	        Artist origin = artists.get(0);
	        System.out.println("Similar artists for " + origin.getName());
	        for (Artist simArtist : origin.getSimilar(numberOfArtists)) {
	            System.out.println("   " + simArtist.getName());
	        }
	    }
		
		
	}
}
