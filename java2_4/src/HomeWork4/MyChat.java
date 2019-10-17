package HomeWork4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyChat {
    private JList list1;
    private JPanel panel1;
    private JTextField inputText;
    private JButton sendButton;

    public MyChat(){
        DefaultListModel listModel = new DefaultListModel();
        list1.setModel(listModel);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(inputText.getText());
                inputText.setText("");
            }
        });

        inputText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(inputText.getText());
                inputText.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyChat");
        frame.setContentPane(new MyChat().panel1);
        frame.setBounds(600,400,640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        JMenuItem infoMenuItem = new JMenuItem("Info");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        menu.add(infoMenuItem);
        menu.add(exitMenuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Доведзенья");
            }
        });
        // frame.pack();
        frame.setVisible(true);
    }

}
