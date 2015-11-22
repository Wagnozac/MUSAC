package Musac.main;

import java.io.IOException;
import java.io.PrintStream;

import Musac.youtube.ThreadYoutube;
import Musac.youtube.youtube;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emilien
 */
public class Gui_v2 extends javax.swing.JFrame {

	/**
	 * Creates new form Gui_v2
	 */
	public Gui_v2() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		PAN_main = new javax.swing.JPanel();
		TXTF_youtube_url = new javax.swing.JTextField();
		LBL_main_youtube_url = new javax.swing.JLabel();
		BTN_Lauch = new javax.swing.JButton();
		PB_main = new javax.swing.JProgressBar();
		LBL_main_load = new javax.swing.JLabel();
		BTN_main_result = new javax.swing.JButton();
		PAN_history = new javax.swing.JPanel();
		SCPAN_history = new javax.swing.JScrollPane();
		TXTA_history = new javax.swing.JTextArea();
		jPanel3 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Musac App");

		TXTF_youtube_url.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TXTF_youtube_urlActionPerformed(evt);
			}
		});
		TXTF_youtube_url.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				TXTF_youtube_urlKeyTyped(evt);
			}
		});

		LBL_main_youtube_url.setText("Enter Youtube url here :");

		BTN_Lauch.setText("Launch !");
		BTN_Lauch.setEnabled(false);
		BTN_Lauch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BTN_LauchActionPerformed(evt);
			}
		});

		LBL_main_load.setText("Loading....");

		BTN_main_result.setText("See results !");
		BTN_main_result.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BTN_main_resultActionPerformed(evt);
			}
		});
		javax.swing.GroupLayout PAN_mainLayout = new javax.swing.GroupLayout(
				PAN_main);
		PAN_main.setLayout(PAN_mainLayout);
		PAN_mainLayout
				.setHorizontalGroup(PAN_mainLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								PAN_mainLayout
										.createSequentialGroup()
										.addGap(28, 28, 28)
										.addGroup(
												PAN_mainLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																LBL_main_load)
														.addGroup(
																PAN_mainLayout
																		.createSequentialGroup()
																		.addComponent(
																				LBL_main_youtube_url)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				TXTF_youtube_url,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				293,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				BTN_Lauch,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				113,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																PB_main,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																585,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(40, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								PAN_mainLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												BTN_main_result,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												111,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		PAN_mainLayout
				.setVerticalGroup(PAN_mainLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								PAN_mainLayout
										.createSequentialGroup()
										.addGap(20, 20, 20)
										.addGroup(
												PAN_mainLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																LBL_main_youtube_url,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																58,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																TXTF_youtube_url,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(BTN_Lauch))
										.addGap(18, 18, 18)
										.addComponent(LBL_main_load)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												PB_main,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(97, 97, 97)
										.addComponent(BTN_main_result)
										.addContainerGap(85, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Main Menu", PAN_main);

		TXTA_history.setColumns(20);
		TXTA_history.setRows(5);
		TXTA_history.setFocusable(false);
		SCPAN_history.setViewportView(TXTA_history);

		javax.swing.GroupLayout PAN_historyLayout = new javax.swing.GroupLayout(
				PAN_history);
		PAN_history.setLayout(PAN_historyLayout);
		PAN_historyLayout.setHorizontalGroup(PAN_historyLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						PAN_historyLayout
								.createSequentialGroup()
								.addComponent(SCPAN_history,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										653,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		PAN_historyLayout
				.setVerticalGroup(PAN_historyLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								PAN_historyLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												SCPAN_history,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												337, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane1.addTab("Output History", PAN_history);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 653,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 349,
				Short.MAX_VALUE));

		jTabbedPane1.addTab("Results", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jTabbedPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 674,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1));

		pack();

		/*
		 * Add manualy
		 */
		PrintStream printStream = new PrintStream(new CustomOutputStream(
				TXTA_history));
		System.setOut(printStream);
		System.setErr(printStream);

		LBL_main_load.setVisible(false);
		PB_main.setVisible(false);
		BTN_main_result.setVisible(false);

	}// </editor-fold>

	private void TXTF_youtube_urlActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void BTN_LauchActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		LBL_main_load.setVisible(true);
		PB_main.setVisible(true);
		BTN_Lauch.setEnabled(false);
		TXTF_youtube_url.setEnabled(false);

		youtube.set_youtube_url(TXTF_youtube_url.getText());
		// LBL_main_load.setText("Extracting sound from the youtube video...");
		// PB_main.setValue(5);
		ThreadYoutube thread = new ThreadYoutube();
		thread.start();
		// PB_main.setValue(100);
		// LBL_main_load.setText("Done !!!");
	}

	private void TXTF_youtube_urlKeyTyped(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
		if (!TXTF_youtube_url.equals("")) {
			BTN_Lauch.setEnabled(true);
		} else {
			BTN_Lauch.setEnabled(false);
		}
	}

	private void BTN_main_resultActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTabbedPane1.setSelectedIndex(2);
	}
	public static void set_txt_field_youtube_url(boolean value) {
		
	}
	// Variables declaration - do not modify
	private static javax.swing.JButton BTN_Lauch;
	private static javax.swing.JButton BTN_main_result;
	private static javax.swing.JLabel LBL_main_load;
	private javax.swing.JLabel LBL_main_youtube_url;
	private javax.swing.JPanel PAN_history;
	private javax.swing.JPanel PAN_main;
	private static javax.swing.JProgressBar PB_main;
	private javax.swing.JScrollPane SCPAN_history;
	private javax.swing.JTextArea TXTA_history;
	private static javax.swing.JTextField TXTF_youtube_url;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTabbedPane jTabbedPane1;

	// End of variables declaration

	/*
	 * STATIC FUNCTION
	 */
	public static void set_pg_value(int value) {
		PB_main.setValue(value);
	}

	public static void set_lbl_info_value(String value) {
		LBL_main_load.setText(value);
	}
	
	public static void set_btn_result_visible(boolean value){
		BTN_main_result.setVisible(value);
	}
	
	public static void set_txtf_youtube_url_enable(boolean value){
		TXTF_youtube_url.setEnabled(value);
	}
	
	public static void set_btn_Lauch_enable(boolean value) {
		BTN_Lauch.setEnabled(value);
	}
	// le display du btn result et le set enable du textfield + btn lauch
}