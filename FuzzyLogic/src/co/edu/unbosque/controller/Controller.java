package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import co.edu.unbosque.view.AttendanceView;
import co.edu.unbosque.view.EconomicView;
import co.edu.unbosque.view.MainView;
import co.edu.unbosque.view.AverageView;
import co.edu.unbosque.view.PsychoView;
import co.edu.unbosque.view.ResumenView;
import co.edu.unbosque.model.dto.*;

public class Controller implements ActionListener {

    private JFrame frame;
    private MainView mainView;
    private AverageView averageView;
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
            if (averageView == null) {
                averageView = new AverageView();
                averageView.getBackButton().addActionListener(this);
                averageView.getNextButton().addActionListener(this);
            }
            frame.setContentPane(averageView);
        }

        else if (averageView != null && source == averageView.getBackButton()) {
            frame.setContentPane(mainView);
        }

        else if (attendanceView != null && source == attendanceView.getBackButton()) {
            frame.setContentPane(averageView);
        }

        else if (economicView != null && source == economicView.getBackButton()) {
            frame.setContentPane(attendanceView);
        }

        else if (psychoView != null && source == psychoView.getBackButton()) {
            frame.setContentPane(economicView);
        }

        else if (averageView != null && source == averageView.getNextButton()) {
            String averageText = averageView.getAverage().getText().trim();

        	  // Validate if the field is empty or not a valid number
            /*if (averageText.isEmpty() || averageText.matches(".*[a-zA-Z].*") || averageText.contains(",")) {
                JOptionPane.showMessageDialog(averageView, "Promedio incorrecto, intentelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                return;  // Do not proceed further if the input is invalid
            }
            double average = Double.parseDouble(averageView.getAverage().getText());
            FuzzyDTO averagedto = new FuzzyDTO(average);
            System.out.println("average"+averagedto.getAverage());
             */
            if (attendanceView == null) {
                attendanceView = new AttendanceView();
                attendanceView.getBackButton().addActionListener(this);
                attendanceView.getNextButton().addActionListener(this);
            }
            frame.setContentPane(attendanceView);
        }

        else if (attendanceView != null && source == attendanceView.getNextButton()) {
            String attendanceText = attendanceView.getAttendance().getText().trim();
          /*  
            if (attendanceText.isEmpty() || attendanceText.matches(".*[a-zA-Z].*") || attendanceText.contains(",")) {
            JOptionPane.showMessageDialog(averageView, "asistencias incorrectas, intentelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Do not proceed further if the input is invalid
        }
        int attendance = Integer.parseInt(attendanceView.getAttendance().getText());
        FuzzyDTO attendancedto = new FuzzyDTO(attendance);
        System.out.println("attendance"+attendancedto.getAttendance());
         */
        	
        	
        	if (economicView == null) {
                economicView = new EconomicView();
                economicView.getBackButton().addActionListener(this);
                economicView.getNextButton().addActionListener(this);
            }
            frame.setContentPane(economicView);
        }

        else if (economicView != null && source == economicView.getNextButton()) {
           
        	String incomeText = (String) economicView.getMonthlyIncome().getSelectedItem();
        	String expenseText = (String) economicView.getMonthlyExpense().getSelectedItem();
        	String savingsText = (String) economicView.getMonthlySavings().getSelectedItem();

        	int careerSatisfaction = economicView.getCareerSatisfaction().getValue(); 
               
        	/*   
             FuzzyDTO economicdto = new FuzzyDTO(incomeText,expenseText, savingsText, careerSatisfaction );
             System.out.println("incomedto"+economicdto.getMonthlyIncome()+"expense"+economicdto.getMonthlyExpense()+"savings"+economicdto.getMonthlySavings()+"satisfactin"+economicdto.getCareerSatisfaction());
             */
             	
        	
        	
        	if (psychoView == null) {
                psychoView = new PsychoView();
                psychoView.getBackButton().addActionListener(this);
                psychoView.getNextButton().addActionListener(this);
            }
            frame.setContentPane(psychoView);
        }
        else if (psychoView != null && source == psychoView.getNextButton()) {
           
        	
        	int careerMotivation = psychoView.getCareerMotivation().getValue(); 
        	int pensum = psychoView.getPensum().getValue(); 
        	String agetext = psychoView.getAge().getText().trim();
            int age = Integer.parseInt(psychoView.getAge().getText());
        	int semester = psychoView.getSemester().getValue(); 
        	int teachers = psychoView.getTeachers().getValue(); 
        	Boolean dropOut = psychoView.getDropOut();
        	
        	FuzzyDTO psychodto = new FuzzyDTO(careerMotivation, pensum, age, semester, teachers, dropOut);
        	System.out.println("motivation: " + psychodto.getCareerMotivation() + 
                    " | pensum: " + psychodto.getPensum() + 
                    " | age: " + psychodto.getAge() + 
                    " | semester: " + psychodto.getSemester() + 
                    " | teachers: " + psychodto.getTeachers() + 
                    " | dropout: " + psychodto.isDropOut());

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
