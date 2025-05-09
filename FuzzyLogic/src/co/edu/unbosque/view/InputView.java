package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class InputView extends JPanel {

    private JTextField economiaField;
    private JTextField psicosocialField;
    private JTextField asistenciaField;
    private JTextField promedioField;
    private JButton enviarButton;
    private JButton backbutton;

    public InputView() {
        setBorder(null);
        setPreferredSize(new Dimension(1261, 642));
        setLayout(new BorderLayout());
        setBackground(new Color(255, 255, 255));

        // === HEADER ===
        JPanel up = new JPanel();
        up.setBorder(null);
        up.setBackground(new Color(43, 123, 143));
        up.setLayout(new BorderLayout());  // CAMBIO: BorderLayout para poder usar posiciones exactas
        up.setPreferredSize(new Dimension(0, 80));  // Ajusta la altura si quieres que se mantenga fija
        add(up, BorderLayout.NORTH);

        // Botón Volver (solo icono)
        ImageIcon volverIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\anterior.png");
        Image scaledVolverImage = volverIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon scaledVolverIcon = new ImageIcon(scaledVolverImage);

        backbutton = new JButton(scaledVolverIcon);
        backbutton.setBackground(new Color(43, 123, 143));
        backbutton.setFocusPainted(false);
        backbutton.setBorderPainted(false);
        backbutton.setContentAreaFilled(false);  // Para que se vea solo el icono sin fondo
        backbutton.setPreferredSize(new Dimension(60, 60));  // Ajusta tamaño del botón si es necesario

      //  up.add(backbutton, BorderLayout.WEST);  // Ahora sí funciona

        // Icono centrado
        JLabel icon = new JLabel();
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\ueb.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        icon.setIcon(scaledIcon);
        icon.setHorizontalAlignment(SwingConstants.CENTER);

        up.add(icon, BorderLayout.CENTER);  // Ahora se centra bien

        // === FOOTER ===
        JPanel foot = new JPanel();
        foot.setBorder(null);
        FlowLayout flowLayout1 = (FlowLayout) foot.getLayout();
        flowLayout1.setVgap(15);
        foot.setBackground(new Color(43, 123, 140));
        add(foot, BorderLayout.SOUTH);

        JLabel footTitle = new JLabel("© 2025 Logica Difusa Universidad El Bosque");
        footTitle.setForeground(new Color(255, 255, 255));
        footTitle.setFont(new Font("Vensim Sans Mono", Font.PLAIN, 15));
        foot.add(footTitle);

        // === CENTER === 
        
     // Panel para contener el botón volver arriba del centro
        JPanel volverPanel = new JPanel(new BorderLayout());
        volverPanel.setBackground(Color.WHITE); // para que coincida con el fondo
        volverPanel.setPreferredSize(new Dimension(0, 60)); // altura deseada

        volverPanel.add(backbutton, BorderLayout.WEST);
        volverPanel.add(backbutton, BorderLayout.WEST); // ELIMINAR

        // add(volverPanel, BorderLayout.EAST); // Agrega el panel antes del centro

        
        JPanel formPanel = new JPanel();
        formPanel.setBackground(Color.WHITE);
        formPanel.setLayout(new GridBagLayout());

        // Creación de GridBagConstraints para cada componente
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Economía Label
        JLabel economiaLabel = new JLabel("Economía:");
        economiaLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(economiaLabel, gbc);

        // Economía Field
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        economiaField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(economiaField, gbc);

        // Puntaje Psicosocial Label
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel psicosocialLabel = new JLabel("Puntaje Psicosocial:");
        psicosocialLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(psicosocialLabel, gbc);

        // Puntaje Psicosocial Field
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        psicosocialField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(psicosocialField, gbc);

        // Asistencia Label
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel asistenciaLabel = new JLabel("Asistencia (%):");
        asistenciaLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(asistenciaLabel, gbc);

        // Asistencia Field
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        asistenciaField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(asistenciaField, gbc);

        // Promedio Académico Label
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel promedioLabel = new JLabel("Promedio Académico:");
        promedioLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(promedioLabel, gbc);

        // Promedio Académico Field
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        promedioField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        formPanel.add(promedioField, gbc);

        // Enviar Button
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        enviarButton = new JButton("Enviar");
        enviarButton.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        formPanel.add(enviarButton, gbc);

        add(formPanel, BorderLayout.CENTER);
    }

    // Getters para el controlador
    public JTextField getEconomiaField() {
        return economiaField;
    }

    public JTextField getPsicosocialField() {
        return psicosocialField;
    }

    public JTextField getAsistenciaField() {
        return asistenciaField;
    }

    public JTextField getPromedioField() {
        return promedioField;
    }

    public JButton getBackbutton() {
        return backbutton;
    }
}
