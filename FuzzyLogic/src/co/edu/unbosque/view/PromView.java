package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PromView extends JPanel {

    private JTextField promedioField;
    private JButton enviarButton;
    private JButton backButton;
    private JLabel LabelPage;

    public PromView() {
        setBorder(null);
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

        LabelPage = new JLabel("1");
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
        
        
     // === CENTER ===
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\main2.png");
        Image bgImage = bgIcon.getImage().getScaledInstance(1261, 520, Image.SCALE_SMOOTH);
        JLabel backgroundLabel = new JLabel(new ImageIcon(bgImage));
        backgroundLabel.setLayout(new GridBagLayout()); // para centrar el formulario

        // Formulario encima del fondo
        JPanel formPanel = new JPanel();
        formPanel.setOpaque(false); // hace transparente el fondo para que se vea la imagen
        formPanel.setLayout(new GridBagLayout());
        formPanel.setPreferredSize(new Dimension(500, 200)); // ajusta el tamaño del formulario

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;

        JLabel titleLabel = new JLabel("Ingrese su Promedio Académico");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.white);
        formPanel.add(titleLabel, gbc);

        // Promedio Label
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel promedioLabel = new JLabel("Promedio Académico:");
        promedioLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        promedioLabel.setForeground(Color.white);
        formPanel.add(promedioLabel, gbc);

        // Promedio Field
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        promedioField = new JTextField(20);
        formPanel.add(promedioField, gbc);

        // Enviar Button
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        enviarButton = new JButton("Siguiente");
        enviarButton.setBackground(new Color(43, 123, 143));
        enviarButton.setForeground(Color.WHITE);
        enviarButton.setFont(new Font("Arial", Font.BOLD, 16));
        formPanel.add(enviarButton, gbc);

        // Agregar formPanel sobre la imagen
        backgroundLabel.add(formPanel, new GridBagConstraints());

        // Agregar todo al centro del panel principal
        add(backgroundLabel, BorderLayout.CENTER);
 
    }

    public JTextField getPromedioField() {
        return promedioField;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getEnviarButton() {
        return enviarButton;
    }
}
