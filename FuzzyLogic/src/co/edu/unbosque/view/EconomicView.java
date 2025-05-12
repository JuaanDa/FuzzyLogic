package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class EconomicView extends JPanel {

    private JComboBox<String> monthlyIncome;
    private JComboBox<String> monthlyExpense;
    private JComboBox<String> monthlySavings;
    private JSlider careerSatisfaction;
    private JButton nextButton;
    private JButton backButton;
    private JLabel LabelPage;

    public EconomicView() {
        setPreferredSize(new Dimension(1261, 642));
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // === HEADER ===
        JPanel up = new JPanel();
        up.setBorder(null);
        up.setBackground(new Color(43, 123, 143));
        up.setLayout(new BorderLayout());
        up.setPreferredSize(new Dimension(0, 80));
        
        add(up, BorderLayout.NORTH);
        
        backButton = new JButton("←");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setBackground(new Color(43, 123, 143));
        backButton.setForeground(Color.WHITE);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setPreferredSize(new Dimension(60, 60));
        up.add(backButton, BorderLayout.WEST);

        LabelPage = new JLabel("3");
        LabelPage.setFont(new Font("Arial", Font.BOLD, 20));
        LabelPage.setBackground(new Color(43, 123, 143));
        LabelPage.setForeground(Color.WHITE);
        LabelPage.setPreferredSize(new Dimension(60, 60));

        up.add(LabelPage, BorderLayout.EAST);

        JLabel icon = new JLabel();
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\uebIcon.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
        icon.setIcon(new ImageIcon(scaledImage));
        icon.setHorizontalAlignment(SwingConstants.CENTER);
        icon.setBorder(new EmptyBorder(0, 0, -10, 0)); // top, left, bottom, right

        up.add(icon, BorderLayout.CENTER);

        // === FOOTER ===
        JPanel foot = new JPanel();
        foot.setBorder(null);
        FlowLayout flowLayout1 = (FlowLayout) foot.getLayout();
        flowLayout1.setVgap(15);
        foot.setBackground(new Color(43, 123, 140));
        add(foot, BorderLayout.SOUTH);

        JLabel footTitle = new JLabel("© 2025 Lógica Difusa");
        footTitle.setForeground(Color.WHITE);
        footTitle.setFont(new Font("Vensim Sans Mono", Font.PLAIN, 15));
        foot.add(footTitle);
        
        JLabel icon2 = new JLabel();
        ImageIcon originalIcon2 = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\icon.png");
        Image scaledImage2 = originalIcon2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        icon2.setIcon(new ImageIcon(scaledImage2));
        foot.add( icon2, BorderLayout.WEST);
        

        JLabel footTitle2 = new JLabel("Universidad El Bosque");
        footTitle2.setForeground(Color.WHITE);
        footTitle2.setFont(new Font("Vensim Sans Mono", Font.PLAIN, 15));
        foot.add(footTitle2);
        

        // ===== CENTER FORM =====
        
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\EconomicBackground.png");
        Image bgImage = bgIcon.getImage().getScaledInstance(1261, 520, Image.SCALE_SMOOTH);
        JLabel centerWrapper = new JLabel(new ImageIcon(bgImage));
        centerWrapper.setLayout(new GridBagLayout()); // para centrar el formulario

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(43, 123, 143, 128)); 
        formPanel.setPreferredSize(new Dimension(700, 400));

        GridBagConstraints gbc;
        
                // Título de la sección
                gbc = new GridBagConstraints();
                gbc.gridx = 0; 
                gbc.gridy = 0; 
                gbc.gridwidth = 2; 
                gbc.anchor = GridBagConstraints.CENTER; 
                gbc.insets = new Insets(10, 10, 20, 10);
                JLabel titulo = new JLabel("Situación Económica");
                titulo.setFont(new Font("Arial", Font.BOLD, 30));
                titulo.setForeground(Color.WHITE);
                formPanel.add(titulo, gbc);
        // Pregunta 1
        
        
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label1 = new JLabel("1) Ingreso mensual total:");
        label1.setForeground(Color.WHITE); 
        label1.setFont(new Font("Arial", Font.BOLD, 18)); 
        formPanel.add(label1, gbc);

        monthlyIncome = new JComboBox<>(new String[]{
            "Menos de $1.600.000", "$1.600.000 - $2.100.000",
            "$2.100.001 - $2.800.000", "Más de $2.800.000"});
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 1; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(monthlyIncome, gbc);

        // Pregunta 2
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label2 = new JLabel("2) Gasto mensual promedio:");
        label2.setForeground(Color.WHITE); // Texto en blanco
        label2.setFont(new Font("Arial", Font.BOLD, 18)); // Aumentamos el tamaño de la fuente
        formPanel.add(label2, gbc);

        monthlyExpense = new JComboBox<>(new String[]{
            "Menos de $1.000.000", "$1.000.000 - $1.600.000",
            "$1.600.001 - $2.500.000", "Más de $2.500.000"});
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 2; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(monthlyExpense, gbc);

        // Pregunta 3
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label3 = new JLabel("3) Porcentaje de ahorro mensual:");
        label3.setForeground(Color.WHITE); // Texto en blanco
        label3.setFont(new Font("Arial", Font.BOLD, 18)); // Aumentamos el tamaño de la fuente
        formPanel.add(label3, gbc);

        monthlySavings = new JComboBox<>(new String[]{
            "0%", "1% - 10%", "11% - 25%", "Más de 25%"});
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 3; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(monthlySavings, gbc);

        // Pregunta 4
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 4; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label4 = new JLabel("4) Nivel de satisfacción con la carrera (1 a 10):");
        label4.setForeground(Color.WHITE); // Texto en blanco
        label4.setFont(new Font("Arial", Font.BOLD, 18)); // Aumentamos el tamaño de la fuente
        formPanel.add(label4, gbc);

        careerSatisfaction = new JSlider(1, 10, 5);
        careerSatisfaction.setMajorTickSpacing(1);
        careerSatisfaction.setPaintTicks(true);
        careerSatisfaction.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 4; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(careerSatisfaction, gbc);

        centerWrapper.add(formPanel, new GridBagConstraints());
        
                // Botón enviar
                nextButton = new JButton("Siguiente");
                nextButton.setBackground(new Color(255, 121, 0));
                nextButton.setForeground(Color.WHITE);
                nextButton.setFont(new Font("Arial", Font.BOLD, 26));
                gbc = new GridBagConstraints();
                gbc.gridx = 0; 
                gbc.gridy = 6; 
                gbc.gridwidth = 2; 
                gbc.insets = new Insets(20, 10, 10, 10);
                formPanel.add(nextButton, gbc);
        add(centerWrapper, BorderLayout.CENTER);
    }

    // === Getters ===

    public JComboBox<String> getMonthlyIncome() { return monthlyIncome; }
    public JComboBox<String> getMonthlyExpense() { return monthlyExpense; }
    public JComboBox<String> getMonthlySavings() { return monthlySavings; }
    public JSlider getCareerSatisfaction() { return careerSatisfaction; }
    public JButton getNextButton() { return nextButton; }
    public JButton getBackButton() { return backButton; }
}
