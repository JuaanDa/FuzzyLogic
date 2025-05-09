package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import co.edu.unbosque.view.MainView;
import co.edu.unbosque.view.InputView;

public class Controller implements ActionListener {

    private JFrame frame;
    private MainView mainView;
    private InputView inputView;

    public Controller() {
        mainView = new MainView();
        mainView.getStartButton().addActionListener(this); 

        frame = new JFrame("University Drop Out");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainView);

        // icono en la barra de tareas
        ImageIcon appIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\icon.png");
        frame.setIconImage(appIcon.getImage());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        // Cuando pulsamos el botón de MainView para ir a InputView
        if (source == mainView.getStartButton()) {
            if (inputView == null) {
            	System.out.println("hola");
                inputView = new InputView();
                inputView.getBackbutton().addActionListener(this);  // ← conectamos aquí
            }
            frame.getContentPane().removeAll();
            frame.getContentPane().add(inputView);
        }
        // Cuando pulsamos el botón back en InputView para volver a MainView
        else if (inputView != null && source == inputView.getBackbutton()) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(mainView);
        }

        frame.revalidate();
        frame.repaint();
    }

}
