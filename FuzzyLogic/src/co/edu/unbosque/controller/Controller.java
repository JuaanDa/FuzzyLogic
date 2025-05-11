package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import co.edu.unbosque.view.AttendanceView;
import co.edu.unbosque.view.EconomicView;
import co.edu.unbosque.view.MainView;
import co.edu.unbosque.view.PromView;
import co.edu.unbosque.view.PsychoView;
import co.edu.unbosque.view.ResumenView;

public class Controller implements ActionListener {

    private JFrame frame;
    private MainView mainView;
    private PromView promView;
    private AttendanceView attendanceView;
    private EconomicView economicView;
    private PsychoView psychoView;
    private ResumenView resumenView;

    public Controller() {
        mainView = new MainView();
        mainView.getStartButton().addActionListener(this); 

        frame = new JFrame("University Drop Out");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainView);

        ImageIcon appIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\icon.png");
        frame.setIconImage(appIcon.getImage());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == mainView.getStartButton()) {
            if (promView == null) {
                promView = new PromView();
                promView.getBackButton().addActionListener(this);
                promView.getEnviarButton().addActionListener(this);
            }
            frame.setContentPane(promView);
        }

        else if (promView != null && source == promView.getBackButton()) {
            frame.setContentPane(mainView);
        }

        else if (attendanceView != null && source == attendanceView.getBackButton()) {
            frame.setContentPane(promView);
        }

        else if (economicView != null && source == economicView.getBackButton()) {
            frame.setContentPane(attendanceView);
        }

        else if (psychoView != null && source == psychoView.getBackButton()) {
            frame.setContentPane(economicView);
        }

        else if (promView != null && source == promView.getEnviarButton()) {
            if (attendanceView == null) {
                attendanceView = new AttendanceView();
                attendanceView.getBackButton().addActionListener(this);
                attendanceView.getEnviarButton().addActionListener(this);
            }
            frame.setContentPane(attendanceView);
        }

        else if (attendanceView != null && source == attendanceView.getEnviarButton()) {
            if (economicView == null) {
                economicView = new EconomicView();
                economicView.getBackButton().addActionListener(this);
                economicView.getEnviarButton().addActionListener(this);
            }
            frame.setContentPane(economicView);
        }

        else if (economicView != null && source == economicView.getEnviarButton()) {
            if (psychoView == null) {
                psychoView = new PsychoView();
                psychoView.getBackButton().addActionListener(this);
                psychoView.getEnviarButton().addActionListener(this);
            }
            frame.setContentPane(psychoView);
        }
        else if (psychoView != null && source == psychoView.getEnviarButton()) {
            if (resumenView == null) {
            	resumenView = new ResumenView();
            	resumenView.getRestartButton().addActionListener(this);
            }
            frame.setContentPane(resumenView);
        }
        else if (resumenView != null && source == resumenView.getRestartButton()) {
            frame.setContentPane(mainView);
        }



        // Puedes agregar aquí qué pasa cuando se presiona el botón "enviar" de PsychoView

        frame.revalidate();
        frame.repaint();
    }
}
