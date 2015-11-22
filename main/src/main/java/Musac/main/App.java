package Musac.main;

import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException,
			IOException {

		// Helpful for debug
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		// System.out.println("Working on " + System.getProperty("os.name"));
		// proc =
		// rt.exec("/usr/local/bin/youtube-dl -x --audio-format mp3 --audio-quality 4 -o test.%(ext)s https://www.youtube.com/watch?v=A1CKiO8CbEs");
		// proc = rt.exec("pwd"); //current folder
		// proc = rt.exec("ls"); //current folder
		// proc.waitFor();
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 
		// Tools end
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_v2().setVisible(true);
                
            }
        });
		
		//DON'T DELETE
		/*
		String youtubeUrl = "https://www.youtube.com/watch?v=A1CKiO8CbEs";
		
		System.out.println("Downloading in process...");
		// extract youtube video song
		youtube.extract_sound_of(youtubeUrl, "test");
		// convert extracted video
		youtube.convert_m4a_to_mp3("test", "output");

		System.out.println("Downloading done...");
		*/
	}

	
}
