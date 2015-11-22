package Musac.youtube;

import java.io.IOException;

import Musac.main.Gui_v2;

public class ThreadYoutube implements Runnable {
	private Thread t;

	public void run() {
		// TODO Auto-generated method stub
		try {
			youtube.get_youtube_mp3();
			Gui_v2.set_lbl_info_value("Done !!!");
			Gui_v2.set_pg_value(100);
			Gui_v2.set_btn_result_visible(true);
			Gui_v2.set_txtf_youtube_url_enable(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, "test");
			t.start();
		}
	}

}
