import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.SecureNotepad extends JFrame {

    /**
     * Holds the name of the file
     * See {@api http://docs.oracle.com/javase/7/docs/api/javax/swing/JTextField.html}
     */
    private JTextField fileNameTextField;

    /**
     * Holds the text of the file
     * See {@api http://docs.oracle.com/javase/7/docs/api/javax/swing/JTextArea.html}
     */
    private JTextArea textArea;

    /**
     * Our application's buttons
     * See {@api http://docs.oracle.com/javase/7/docs/api/javax/swing/JButton.html}
     */
    private JButton saveButton, loadButton, clearButton;

    /**
     * default constructor
     */
    public SecureNotepad() {

        fileNameTextField = new JTextField();
        textArea = new JTextArea();

        /**
         * Create a panel for the buttons to reside.
         * The default layout for containers is FlowLayout
         *
         * See {@link http://docs.oracle.com/javase/7/docs/api/java/awt/FlowLayout.html}
         */
        JPanel buttonPanel = new JPanel();

        saveButton = new JButton("Save");
        loadButton = new JButton("Load");
        clearButton = new JButton("Clear");

        // Instantiate an action listener to listen for button click events
        NotepadButtonListener buttonListener = new NotepadButtonListener();

        // attach our action listener to the buttons
        saveButton.addActionListener(buttonListener);
        loadButton.addActionListener(buttonListener);
        clearButton.addActionListener(buttonListener);

        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(clearButton);

        // set the layout of the JFrame
        this.setLayout(new BorderLayout());

        /**
         * Add the elements to the panel.
         * BorderLayouts have 5 positions that you can add Objects:
         * NORTH, SOUTH, EAST, WEST, and CENTER
         *
         * See {@api http://docs.oracle.com/javase/7/docs/api/java/awt/BorderLayout.html}
         */

        add(fileNameTextField, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // show the frame
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
    }

    /**
     *
     * @return the name of the file
     */
    private String getFileName() {
        return fileNameTextField.getText();
    }

    /**
     * Read from the specified file
     * @param fileName the name of the file to read from
     */
    private void readFile(String fileName) {
        Scanner inFile = null;

        try {
            // file reader
            inFile = new Scanner(new FileReader(fileName));

            // clear the text area
            textArea.setText("");

            // copy file
            while (inFile.hasNextLine()) {
                textArea.append(inFile.nextLine());
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("File not found");
        } finally {
            if (inFile != null) {
                inFile.close();
            }
        }
    }

    /**
     * Write to the specified file
     * @param fileName the name of the file to write to
     */
    private void writeFile(String fileName) {
        PrintWriter outFile = null;

        try {
            // file writer
            outFile = new PrintWriter(new FileWriter(fileName));

            outFile.print(textArea.getText());

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("File not found");
        } finally {
            if (outFile != null) {
                outFile.close();
            }
        }
    }

    /**
     * The action listener for our Notepad application
     * Action listeners must implement the ActionListener interface and define
     * the behavior of the actionPerformed() method.
     *
     * See {@api http://docs.oracle.com/javase/7/docs/api/java/awt/event/ActionListener.html}
     *
     * More info on action listeners {@api http://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html
     */
    class NotepadButtonListener implements ActionListener {

        /**
         * This needs to be defined since this class implements the ActionListener interface
         * @param e the event
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();

            // Figure out which button was pressed            
            if (sourceButton.equals(loadButton)) {
                System.out.println("Load button pressed");
                readFile(getFileName());
            } else if (sourceButton.equals(saveButton)) {
                System.out.println("Save button pressed");
                writeFile(getFileName());
            } else if (sourceButton.equals(clearButton)) {
                System.out.println("Clear button pressed");

                // clear the text area
                textArea.setText("");
            } else {
                System.out.println("Unknown button pressed");
            }
        }
    }

    /**
     * The application's entry point
     * @param args
     */
    public static void main(String[] args) {
        // Create the notepad instance
        new SecureNotepad }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null,
                            "No supported files found!");
                }
            }
        });

        this.setJMenuBar(jmb);
        this.setIconImage(ImageUtil.getImage(SecureNotepad.icon));
        this.setSize(1450, 750);
        this.setTitle("Untitled - Notepad");
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        final JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new SecureFileFilter());
        jfc.setAcceptAllFileFilterUsed(false);
        if (e.getActionCommand().startsWith("New")) {
            if (jta.getText().length() > 0) {
                if (changed) {
                    if (!this.confirm(fnameContainer != null ? fnameContainer
                            .getName() : "Untitled")) {
                        return;
                    }
                }
            }
            this.setTitle("Untitled - Notepad");
            jta.setText("");
            fnameContainer = null;
            changed = false;
        } else if (e.getActionCommand().startsWith("Open")) {
            if (jta.getText().length() > 0) {
                if (changed) {
                    if (!this.confirm(fnameContainer != null ? fnameContainer
                            .getName() : "Untitled")) {
                        return;
                    }
                }
            }
            final int opt = jfc.showDialog(null, "Open");
            if (opt == JFileChooser.APPROVE_OPTION) {
                try {
                    final File file = jfc.getSelectedFile();
                    final String loaded = SecureTextFile.load(file, JOptionPane
                            .showInputDialog("What is the password for "
                                    + file.getName() + "?"));
                    if (loaded != null) {
                        jta.setText(loaded);
                        this.setTitle(file.getName().substring(0,
                                file.getName().length() - 5)
                                + " - Notepad");
                        fnameContainer = file;
                        changed = false;
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid password");
                    }
                } catch (final Exception ex) {
                }
            }
        } else if (e.getActionCommand().startsWith("Save  ")) {
            if (fnameContainer != null) {
                try {
                    SecureTextFile
                            .save(fnameContainer,
                                    jta.getText(),
                                    JOptionPane
                                            .showInputDialog("What would you like the password to be?"));
                } catch (final IOException ex) {
                }
                changed = false;
            } else {
                this.actionPerformed(new ActionEvent(e.getSource(), e.getID(),
                        "Save As"));
            }
        } else if (e.getActionCommand().startsWith("Save As")) {
            if (fnameContainer != null) {
                jfc.setCurrentDirectory(fnameContainer);
                jfc.setSelectedFile(fnameContainer);
            } else {
                jfc.setSelectedFile(new File("Untitled.stxt"));
            }

            final int ret = jfc.showSaveDialog(null);

            if (ret == JFileChooser.APPROVE_OPTION) {
                try {
                    final File file = jfc.getSelectedFile().getName()
                            .endsWith(".stxt") ? jfc.getSelectedFile()
                            : new File(jfc.getSelectedFile() + ".stxt");
                    SecureTextFile
                            .save(file,
                                    jta.getText(),
                                    JOptionPane
                                            .showInputDialog("What would you like the password to be?"));
                    this.setTitle(file.getName().substring(0,
                            file.getName().length() - 5)
                            + " - Notepad");
                    fnameContainer = file;
                    changed = false;
                } catch (final Exception ex) {
                }
            }
        } else if (e.getActionCommand().startsWith("Print")) {
            PrintUtility.print(jta);
        } else if (e.getActionCommand().startsWith("Exit")) {
            if (jta.getText().length() > 0) {
                if (changed) {
                    if (this.confirm(fnameContainer != null ? fnameContainer
                            .getName() : "Untitled")) {
                        System.exit(0);
                    }
                } else {
                    System.exit(0);
                }
            } else {
                System.exit(0);
            }
        } else if (e.getActionCommand().startsWith("Undo")) {
            if (um.canUndo()) {
                um.undo();
            }
        } else if (e.getActionCommand().startsWith("Cut")) {
            jta.cut();
        } else if (e.getActionCommand().startsWith("Copy")) {
            jta.copy();
        } else if (e.getActionCommand().startsWith("Paste")) {
            jta.paste();
        } else if (e.getActionCommand().startsWith("Delete")) {
            jta.setText(jta.getText().substring(0, jta.getSelectionStart())
                    + jta.getText().substring(jta.getSelectionEnd()));
        } else if (e.getActionCommand().startsWith("Select")) {
            jta.selectAll();
        } else if (e.getActionCommand().startsWith("Find")) {
            if (!finder.isVisible()) {
                finder.setVisible(true);
            }
            finder.requestFocus();
        } else if (e.getActionCommand().startsWith("Replace")) {
            if (!replacer.isVisible()) {
                replacer.setVisible(true);
            }
            replacer.requestFocus();
        } else if (e.getActionCommand().startsWith("Word")) {
            if (!jta.getWrapStyleWord()) {
                jta.setLineWrap(true);
                jta.setWrapStyleWord(true);
                jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            } else {
                jta.setLineWrap(false);
                jta.setWrapStyleWord(false);
                jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            }
        } else if (e.getActionCommand().startsWith("Font")) {
            final JFontChooser jfont = new JFontChooser();
            jfont.setVisible(true);
            final int opt = jfont.showDialog(this);
            if (opt == JFontChooser.OK_OPTION) {
                jta.setFont(jfont.getSelectedFont());
            }
        } else if (e.getActionCommand().startsWith("About")) {
            JOptionPane.showMessageDialog(this, "Created by: Matt Langlois",
                    "Notepad", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private boolean confirm(final String file) {
        final int opt = JOptionPane.showConfirmDialog(this,
                "Do you wish to save changes to " + file + "?",
                "Secure Notepad", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        return opt != JOptionPane.CANCEL_OPTION;
    }

    public void createCheckMenuItem(final JMenu jm, final String txt) {
        final JCheckBoxMenuItem jmi = new JCheckBoxMenuItem(txt);
        jmi.addActionListener(this);
        jm.add(jmi);
    }

    public void createMenuItem(final JMenu jm, final String txt) {
        final JMenuItem jmi = new JMenuItem(txt);
        jmi.addActionListener(this);
        jm.add(jmi);
    }

    private void keyActionPerformed(final KeyEvent e) {
        if (e.isControlDown()) {
            if (e.getKeyCode() == KeyEvent.VK_N) {
                this.actionPerformed(new ActionEvent(e.getSource(), -1, "New"));
            } else if (e.getKeyCode() == KeyEvent.VK_O) {
                this.actionPerformed(new ActionEvent(e.getSource(), -1, "Open"));
            } else if (e.getKeyCode() == KeyEvent.VK_S) {
                this.actionPerformed(new ActionEvent(e.getSource(), -1,
                        "Save  "));
            } else if (e.getKeyCode() == KeyEvent.VK_P) {
                this.actionPerformed(new ActionEvent(e.getSource(), -1, "Print"));
            } else if (e.getKeyCode() == KeyEvent.VK_Z) {
                this.actionPerformed(new ActionEvent(e.getSource(), -1, "Undo"));
            } else if (e.getKeyCode() == KeyEvent.VK_F) {
                this.actionPerformed(new ActionEvent(e.getSource(), -1, "Find"));
            } else if (e.getKeyCode() == KeyEvent.VK_H) {
                this.actionPerformed(new ActionEvent(e.getSource(), -1,
                        "Replace"));
            }
        }
    }

}
© 2022 GitHub, Inc.