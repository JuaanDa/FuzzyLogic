package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PsychoView extends JPanel {

    private JSlider carreraSlider;
    private JSlider contenidoSlider;
    private JTextField edadField;
    private JSlider semestreSlider;
    private JSlider profesoresSlider;
    private JButton enviarButton;
    private JButton backButton;
    private JLabel LabelPage;

    public PsychoView() {
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

        LabelPage = new JLabel("4");
        LabelPage.setFont(new Font("Arial", Font.BOLD, 20));
        LabelPage.setForeground(Color.WHITE);
        LabelPage.setPreferredSize(new Dimension(60, 60));
        up.add(LabelPage, BorderLayout.EAST);

        JLabel icon = new JLabel();
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\ueb.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
        icon.setIcon(new ImageIcon(scaledImage));
        icon.setHorizontalAlignment(SwingConstants.CENTER);
        icon.setBorder(new EmptyBorder(0, 0, -10, 0));
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
        

        // === CENTER FORM ===
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\bosqu3.png");
        Image bgImage = bgIcon.getImage().getScaledInstance(1261, 520, Image.SCALE_SMOOTH);
        JLabel centerWrapper = new JLabel(new ImageIcon(bgImage));
        centerWrapper.setLayout(new GridBagLayout());

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(43, 123, 143, 128));
        formPanel.setPreferredSize(new Dimension(700, 400));

        GridBagConstraints gbc;

        // Título
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 20, 10);
        JLabel titulo = new JLabel("Situación Psicosocial");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.WHITE);
        formPanel.add(titulo, gbc);

        // Pregunta 1
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label1 = new JLabel("1) ¿Qué tan satisfecho se siente con su carrera? (1 a 10):");
        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setForeground(Color.WHITE);
        formPanel.add(label1, gbc);

        carreraSlider = new JSlider(1, 10, 5);
        carreraSlider.setMajorTickSpacing(1);
        carreraSlider.setPaintTicks(true);
        carreraSlider.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 1; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(carreraSlider, gbc);

        // Pregunta 2
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label2 = new JLabel("2) ¿Qué tan satisfecho está con el pensum y contenido? (1 a 10):");
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        label2.setForeground(Color.WHITE);
        formPanel.add(label2, gbc);

        contenidoSlider = new JSlider(1, 10, 5);
        contenidoSlider.setMajorTickSpacing(1);
        contenidoSlider.setPaintTicks(true);
        contenidoSlider.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 2; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(contenidoSlider, gbc);

        // Pregunta 3 - Edad
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label3 = new JLabel("3) Edad:");
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        label3.setForeground(Color.WHITE);
        formPanel.add(label3, gbc);

        edadField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 3; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(edadField, gbc);

        // Pregunta 4 - Semestre
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 4; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label4 = new JLabel("4) Semestre actual (1 a 10):");
        label4.setFont(new Font("Arial", Font.BOLD, 18));
        label4.setForeground(Color.WHITE);
        formPanel.add(label4, gbc);

        semestreSlider = new JSlider(1, 10, 1);
        semestreSlider.setMajorTickSpacing(1);
        semestreSlider.setPaintTicks(true);
        semestreSlider.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 4; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(semestreSlider, gbc);

        // Pregunta 5
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 5; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label5 = new JLabel("5) ¿Qué tan satisfecho está con los profesores? (1 a 10):");
        label5.setFont(new Font("Arial", Font.BOLD, 18));
        label5.setForeground(Color.WHITE);
        formPanel.add(label5, gbc);

        profesoresSlider = new JSlider(1, 10, 5);
        profesoresSlider.setMajorTickSpacing(1);
        profesoresSlider.setPaintTicks(true);
        profesoresSlider.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 5; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(profesoresSlider, gbc);

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

        centerWrapper.add(formPanel, new GridBagConstraints());
        add(centerWrapper, BorderLayout.CENTER);
    }

    // === Getters ===
    public JSlider getCarreraSlider() { return carreraSlider; }
    public JSlider getContenidoSlider() { return contenidoSlider; }
    public JTextField getEdadField() { return edadField; }
    public JSlider getSemestreSlider() { return semestreSlider; }
    public JSlider getProfesoresSlider() { return profesoresSlider; }
    public JButton getEnviarButton() { return enviarButton; }
    public JButton getBackButton() { return backButton; }
}
