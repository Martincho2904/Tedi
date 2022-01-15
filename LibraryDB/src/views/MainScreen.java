package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import common.RoundedCorner;
import common.SearchHint;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class MainScreen {

	private JFrame frmLibraryDatabase;
	private JTextField txtSearch;
	private JCheckBox chckbxAvailable;
	private JList listBooks;
	private JComboBox comboBox;
	private JTextPane textPaneDetails;
	private JButton btnRedact;
	private JButton btnDelete;
	private JButton btnCancel;
	private JButton btnAddBook;
	private JLabel lblPicture;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frmLibraryDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryDatabase = new JFrame();
		frmLibraryDatabase.setTitle("Library Database");
		frmLibraryDatabase.setIconImage(
				Toolkit.getDefaultToolkit().getImage(MainScreen.class.getResource("/resources/icon.png")));
		frmLibraryDatabase.setBounds(100, 100, 1400, 700);
		frmLibraryDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryDatabase.getContentPane().setLayout(null);

//		Container container = frame.getContentPane();
//		GridBagLayout gbl = new GridBagLayout();
//		container.setLayout(gbl);
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.gridx = 1;
//		gbc.gridy = 1;
//		JButton component = new JButton();
//		component.setPreferredSize(new Dimension(25, 25));
//		gbl.setConstraints(component, gbc);
//		container.add(component);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setPreferredSize(new Dimension(40, 90));
//		frame.pack();
//		frame.setVisible(true);

		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtSearch.setToolTipText("");
		txtSearch.setBounds(460, 10, 400, 50);
		frmLibraryDatabase.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		// Hint for Search JTextField
		txtSearch.setUI(new SearchHint("Search", true));
		// !!!

		chckbxAvailable = new JCheckBox("Available");
		chckbxAvailable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxAvailable.setBounds(460, 83, 200, 50);
		frmLibraryDatabase.getContentPane().add(chckbxAvailable);

//For Change

		// ComboBox
		String[] arrSearchType = { "All Books", "Search by Author", "Search by Genre", "Search by Name" };
		comboBox = new JComboBox<String>(arrSearchType);
		comboBox.setMaximumRowCount(4);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setToolTipText("");
		comboBox.setBounds(10, 10, 400, 50);
		frmLibraryDatabase.getContentPane().add(comboBox);

//		comboBox.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reset();
//			console.setText("You must collect all the letters and guess the word to win the game.\n"
//					+ "Enter name in the yellow area, choose difficulty and click on the start button.\n");
//		}
//	});

		listBooks = new JList();
		listBooks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		listBooks.setBounds(460, 160, 400, 490);
		frmLibraryDatabase.getContentPane().add(listBooks);

		textPaneDetails = new JTextPane();
		textPaneDetails.setForeground(new Color(0, 0, 0));
		textPaneDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPaneDetails.setToolTipText("Details: ");

		textPaneDetails.setText("Details: ");
		textPaneDetails.setContentType("Details: ");
		textPaneDetails.setBounds(910, 10, 400, 400);
		textPaneDetails.setEditable(false);
		frmLibraryDatabase.getContentPane().add(textPaneDetails);

		btnRedact = new JButton("Redact");
		btnRedact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRedact.setBounds(910, 440, 400, 50);
		frmLibraryDatabase.getContentPane().add(btnRedact);

		btnDelete = new JButton("Delete book");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBounds(910, 520, 400, 50);
		frmLibraryDatabase.getContentPane().add(btnDelete);

		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(910, 600, 400, 50);
		frmLibraryDatabase.getContentPane().add(btnCancel);

		btnAddBook = new JButton("Add book to Database");
		btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddBook.setBounds(10, 600, 400, 50);
		frmLibraryDatabase.getContentPane().add(btnAddBook);

		lblPicture = new JLabel("");
		lblPicture.setOpaque(true);
		lblPicture.setIcon(new ImageIcon(MainScreen.class.getResource("/resources/picture.png")));
		lblPicture.setBounds(10, 160, 400, 400);
		frmLibraryDatabase.getContentPane().add(lblPicture);
	}
};
