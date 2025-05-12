package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.BoxLayout;

public class MainView extends JPanel {

    private JButton startButton;

    public MainView() {
    	
    	
        // === WINDOW ===

        setBorder(null);
        setPreferredSize(new Dimension(1250, 642));
        setLayout(new BorderLayout());
        setBackground(new Color(255, 255, 255));

        // === HEADER ===
        JPanel up = new JPanel();
        up.setBorder(null);
        FlowLayout flowLayout = (FlowLayout) up.getLayout();
        flowLayout.setVgap(20);
        up.setPreferredSize(new Dimension(0, 80));

        up.setBackground(new Color(43, 123, 143));
        add(up, BorderLayout.NORTH);

        JLabel icon = new JLabel("");
        icon.setEnabled(false);
        icon.setHorizontalAlignment(SwingConstants.LEFT);

        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\uebIcon.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        icon.setIcon(scaledIcon);
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
        
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\MainBackground.png");
        Image bgImage = bgIcon.getImage().getScaledInstance(1261, 520, Image.SCALE_SMOOTH); // ajustar la altura

        JLabel backgroundLabel = new JLabel(new ImageIcon(bgImage));
        backgroundLabel.setLayout(new BoxLayout(backgroundLabel, BoxLayout.Y_AXIS));

        // Logo encima del título
        ImageIcon bigLogoIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\icon.png");
        Image bigLogoImage = bigLogoIcon.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT	); // ajusta tamaño a tu gusto
        JLabel bigLogoLabel = new JLabel(new ImageIcon(bigLogoImage));
        bigLogoLabel.setAlignmentX(CENTER_ALIGNMENT);

        //Título
        JLabel title = new JLabel("University Drop Out");
        title.setAlignmentX(CENTER_ALIGNMENT);
        title.setFont(new Font("Vivaldi", Font.BOLD  | Font.ITALIC	, 86));
        title.setForeground(Color.WHITE); // blanco para que se vea sobre la imagen
        title.setHorizontalAlignment(SwingConstants.CENTER);

        // Subtítulo
        JLabel subtitle = new JLabel("Evaluación de riesgo de deserción universitaria con lógica difusa");
        subtitle.setAlignmentX(CENTER_ALIGNMENT);
        subtitle.setFont(new Font("lucida Handwriting", Font.PLAIN, 20));
        subtitle.setForeground(Color.WHITE);
        subtitle.setHorizontalAlignment(SwingConstants.CENTER);

        // Botón
        startButton = new JButton("INICIAR");
        startButton.setAlignmentX(CENTER_ALIGNMENT);
        startButton.setFont(new Font("SansSerif", Font.BOLD, 22));
        startButton.setBackground(new Color(43, 123, 143));
        startButton.setForeground(Color.white);
        startButton.setFocusPainted(false);
        startButton.setMaximumSize(new Dimension(250, 60));

        // Añadimos todo centrado en orden
        backgroundLabel.add(Box.createRigidArea(new Dimension(0, 30))); // espacio superior
        backgroundLabel.add(bigLogoLabel);
        backgroundLabel.add(Box.createRigidArea(new Dimension(0, 20))); // espacio entre logo y título
        backgroundLabel.add(title);
        backgroundLabel.add(Box.createRigidArea(new Dimension(0, 20))); // espacio entre título y subtítulo
        backgroundLabel.add(subtitle);
        backgroundLabel.add(Box.createRigidArea(new Dimension(0, 40))); // espacio antes del botón
        backgroundLabel.add(startButton);

        add(backgroundLabel, BorderLayout.CENTER);

     
    }

    // Getter para que el Controller acceda al botón
    public JButton getStartButton() {
        return startButton;
    }
}
