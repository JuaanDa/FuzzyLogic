package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class EconomicView extends JPanel {

    private JComboBox<String> ingresoCombo;
    private JComboBox<String> gastoCombo;
    private JComboBox<String> ahorroCombo;
    private JSlider satisfaccionSlider;
    private JButton enviarButton;
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
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\ueb.png");
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
        
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\ueb5.png");
        Image bgImage = bgIcon.getImage().getScaledInstance(1261, 520, Image.SCALE_SMOOTH);
        JLabel centerWrapper = new JLabel(new ImageIcon(bgImage));
        centerWrapper.setLayout(new GridBagLayout()); // para centrar el formulario

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(43, 123, 143, 128)); // puedes ajustar el color aquí (por ejemplo, un azul muy claro)
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
                titulo.setFont(new Font("Arial", Font.BOLD, 24));
                titulo.setForeground(Color.WHITE);
                formPanel.add(titulo, gbc);
        // Pregunta 1
        
        
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label1 = new JLabel("1) Ingreso mensual total:");
        label1.setForeground(Color.WHITE); // Texto en blanco
        label1.setFont(new Font("Arial", Font.BOLD, 18)); // Aumentamos el tamaño de la fuente
        formPanel.add(label1, gbc);

        ingresoCombo = new JComboBox<>(new String[]{
            "Menos de $500.000", "$500.000 - $1.000.000",
            "$1.000.000 - $2.000.000", "Más de $2.000.000"});
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 1; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(ingresoCombo, gbc);

        // Pregunta 2
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label2 = new JLabel("2) Gasto mensual promedio:");
        label2.setForeground(Color.WHITE); // Texto en blanco
        label2.setFont(new Font("Arial", Font.BOLD, 18)); // Aumentamos el tamaño de la fuente
        formPanel.add(label2, gbc);

        gastoCombo = new JComboBox<>(new String[]{
            "Menos de $400.000", "$400.000 - $800.000",
            "$800.000 - $1.200.000", "Más de $1.200.000"});
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 2; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(gastoCombo, gbc);

        // Pregunta 3
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label3 = new JLabel("3) Porcentaje de ahorro mensual:");
        label3.setForeground(Color.WHITE); // Texto en blanco
        label3.setFont(new Font("Arial", Font.BOLD, 18)); // Aumentamos el tamaño de la fuente
        formPanel.add(label3, gbc);

        ahorroCombo = new JComboBox<>(new String[]{
            "0%", "1% - 10%", "11% - 25%", "Más de 25%"});
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 3; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(ahorroCombo, gbc);

        // Pregunta 4
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 4; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label4 = new JLabel("4) Nivel de satisfacción con la carrera (1 a 10):");
        label4.setForeground(Color.WHITE); // Texto en blanco
        label4.setFont(new Font("Arial", Font.BOLD, 18)); // Aumentamos el tamaño de la fuente
        formPanel.add(label4, gbc);

        satisfaccionSlider = new JSlider(1, 10, 5);
        satisfaccionSlider.setMajorTickSpacing(1);
        satisfaccionSlider.setPaintTicks(true);
        satisfaccionSlider.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 4; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(satisfaccionSlider, gbc);

        centerWrapper.add(formPanel, new GridBagConstraints());
        
                // Botón enviar
                enviarButton = new JButton("Siguiente");
                enviarButton.setBackground(new Color(255, 121, 0));
                enviarButton.setForeground(Color.WHITE);
                enviarButton.setFont(new Font("Arial", Font.BOLD, 26));
                gbc = new GridBagConstraints();
                gbc.gridx = 0; 
                gbc.gridy = 6; 
                gbc.gridwidth = 2; 
                gbc.insets = new Insets(20, 10, 10, 10);
                formPanel.add(enviarButton, gbc);
        add(centerWrapper, BorderLayout.CENTER);
    }

    // === Getters ===

    public JComboBox<String> getIngresoCombo() { return ingresoCombo; }
    public JComboBox<String> getGastoCombo() { return gastoCombo; }
    public JComboBox<String> getAhorroCombo() { return ahorroCombo; }
    public JSlider getSatisfaccionSlider() { return satisfaccionSlider; }
    public JButton getEnviarButton() { return enviarButton; }
    public JButton getBackButton() { return backButton; }
}
