package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PsychoView extends JPanel {

    private JSlider careerMotivation;
    private JSlider pensum;
    private JTextField age;
    private JSlider semester;
    private JSlider teachers;
    private JRadioButton siButton;
    private JRadioButton noButton;
    private JButton nextButton;
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
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\uebIcon.png");
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
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\PsychoBackground.png");
        Image bgImage = bgIcon.getImage().getScaledInstance(1261, 520, Image.SCALE_SMOOTH);
        JLabel centerWrapper = new JLabel(new ImageIcon(bgImage));
        centerWrapper.setLayout(new GridBagLayout());

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(43, 123, 143, 128));
        formPanel.setPreferredSize(new Dimension(900, 500));

        GridBagConstraints gbc;

        // Título
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 20, 10);
        JLabel titulo = new JLabel("Situación Psicosocial");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        formPanel.add(titulo, gbc);

        // Pregunta 1
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label1 = new JLabel("1) ¿Qué tan motivado se siente con terminar su carrera? (1 a 10):");
        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setForeground(Color.WHITE);
        formPanel.add(label1, gbc);

        careerMotivation = new JSlider(1, 10, 5);
        careerMotivation.setMajorTickSpacing(1);
        careerMotivation.setPaintTicks(true);
        careerMotivation.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 1; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(careerMotivation, gbc);

        // Pregunta 2
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label2 = new JLabel("2) ¿Qué tan satisfecho está con el pensum y contenido? (1 a 10):");
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        label2.setForeground(Color.WHITE);
        formPanel.add(label2, gbc);

        pensum = new JSlider(1, 10, 5);
        pensum.setMajorTickSpacing(1);
        pensum.setPaintTicks(true);
        pensum.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 2; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(pensum, gbc);

        // Pregunta 3 - Edad
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label3 = new JLabel("3) Edad:");
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        label3.setForeground(Color.WHITE);
        formPanel.add(label3, gbc);

        age = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 3; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(age, gbc);

        // Pregunta 4 - Semestre
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 4; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label4 = new JLabel("4) Semestre actual (1 a 10):");
        label4.setFont(new Font("Arial", Font.BOLD, 18));
        label4.setForeground(Color.WHITE);
        formPanel.add(label4, gbc);

        semester = new JSlider(1, 10, 1);
        semester.setMajorTickSpacing(1);
        semester.setPaintTicks(true);
        semester.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 4; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(semester, gbc);

        // Pregunta 5
        gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 5; gbc.anchor = GridBagConstraints.WEST; gbc.insets = new Insets(10,10,5,10);
        JLabel label5 = new JLabel("5) ¿Qué tan satisfecho está con los profesores? (1 a 10):");
        label5.setFont(new Font("Arial", Font.BOLD, 18));
        label5.setForeground(Color.WHITE);
        formPanel.add(label5, gbc);

        teachers = new JSlider(1, 10, 5);
        teachers.setMajorTickSpacing(1);
        teachers.setPaintTicks(true);
        teachers.setPaintLabels(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 1; gbc.gridy = 5; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.insets = new Insets(10,10,5,10);
        formPanel.add(teachers, gbc);

        
     // Pregunta 6 - ¿Ha pensado en abandonar la carrera?
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 5, 10);
        JLabel label6 = new JLabel("6) ¿Ha pensado en abandonar la carrera?");
        label6.setFont(new Font("Arial", Font.BOLD, 18));
        label6.setForeground(Color.WHITE);
        formPanel.add(label6, gbc);
        // Botones de opción
        siButton = new JRadioButton("Sí");
   //     siButton.setBackground(new Color(43, 123, 143));
        siButton.setForeground(Color.black);
        noButton = new JRadioButton("No");
     //   noButton.setBackground(new Color(43, 123, 143));
        noButton.setForeground(Color.black);

        

        // Agrupar los botones para que solo se pueda seleccionar uno
        ButtonGroup group = new ButtonGroup();
        group.add(siButton);
        group.add(noButton);
        

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(43, 123, 143)); // o el color que estés usando
        buttonPanel.add(siButton);
        buttonPanel.add(noButton);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 5, 10);
        formPanel.add(buttonPanel, gbc);

        centerWrapper.add(formPanel, new GridBagConstraints());
        
                // Botón enviar
                nextButton = new JButton("Siguiente");
                nextButton.setBackground(new Color(255, 121, 0));
                nextButton.setForeground(Color.WHITE);
                nextButton.setFont(new Font("Arial", Font.BOLD, 26));
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 7;
                gbc.gridwidth = 2;
                gbc.insets = new Insets(20, 10, 10, 10);
                formPanel.add(nextButton, gbc);
        add(centerWrapper, BorderLayout.CENTER);
    }

    public Boolean getDropOut() {
        if (siButton.isSelected()) {
            return true;
        } else if (noButton.isSelected()) {
            return false;
        } else {
            return null; // En caso de que no haya selección
        }
    }

    // === Getters ===
    public JSlider getCareerMotivation() { return careerMotivation; }
    public JSlider getPensum() { return pensum; }
    public JTextField getAge() { return age; }
    public JSlider getSemester() { return semester; }
    public JSlider getTeachers() { return teachers; }
    public JButton getNextButton() { return nextButton; }
    public JButton getBackButton() { return backButton; }
}
