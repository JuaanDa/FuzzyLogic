package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

    public MainView mainView;

    public Controller() {
        mainView = new MainView();

        JFrame frame = new JFrame("Fuzzy Logic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainView);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
