package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResumenView extends JPanel {

    private JButton restartButton;
    private JButton backButton;
    private JLabel LabelPage;

    public ResumenView() {
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

     
        JLabel icon = new JLabel();
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\uebIcon.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
        icon.setIcon(new ImageIcon(scaledImage));
        icon.setHorizontalAlignment(SwingConstants.CENTER);
        icon.setBorder(new EmptyBorder(0, 0, -10, 0));
        up.add(icon, BorderLayout.CENTER);

        // === FOOTER ===
        JPanel foot = new JPanel();
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
        foot.add(icon2, BorderLayout.WEST);

        JLabel footTitle2 = new JLabel("Universidad El Bosque");
        footTitle2.setForeground(Color.WHITE);
        footTitle2.setFont(new Font("Vensim Sans Mono", Font.PLAIN, 15));
        foot.add(footTitle2);

        // === CENTER - CONTENEDOR CON 4 PANELITOS ===
        JPanel centerWrapper = new JPanel(new GridLayout(2, 2, 20, 20));
        centerWrapper.setBackground(new Color(240, 240, 240));
        centerWrapper.setBorder(new EmptyBorder(30, 40, 20, 40));

        for (int i = 1; i <= 5; i++) {
            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(200, 150));
            panel.setBackground(new Color(43, 123, 143, 180));
            panel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
            panel.setLayout(new BorderLayout());

            JLabel label = new JLabel("Resumen bloque " + i, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.WHITE);
            panel.add(label, BorderLayout.CENTER);

            centerWrapper.add(panel);
        }

        add(centerWrapper, BorderLayout.CENTER);

        // === BOTÓN REINICIAR ===
        JPanel buttonPanel = new JPanel();
        centerWrapper.add(buttonPanel);
        buttonPanel.setBackground(Color.WHITE);
        restartButton = new JButton("Volver a iniciar");
        restartButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        restartButton.setBackground(new Color(255, 121, 0));
        restartButton.setForeground(Color.WHITE);
        restartButton.setFont(new Font("Arial", Font.BOLD, 22));
        restartButton.setPreferredSize(new Dimension(240, 50));
        buttonPanel.add(restartButton);
    }

    public JButton getRestartButton() { return restartButton; }
    public JButton getBackButton() { return backButton; }
}
