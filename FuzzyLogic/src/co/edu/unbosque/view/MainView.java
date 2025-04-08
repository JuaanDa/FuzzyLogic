package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class MainView extends JPanel {

    public MainView() {
    	setBorder(null);
        setPreferredSize(new Dimension(1261, 642));
        setLayout(new BorderLayout());
        setBackground(new Color(255, 255, 255));
        
        JPanel Up = new JPanel();
        Up.setBorder(null);
        FlowLayout flowLayout = (FlowLayout) Up.getLayout();
        flowLayout.setVgap(20);
        Up.setBackground(new Color(43, 123, 143));
        add(Up, BorderLayout.NORTH);
        
        JLabel icon = new JLabel("");
        icon.setEnabled(false);
        icon.setHorizontalAlignment(SwingConstants.LEFT);

     ImageIcon originalIcon = new ImageIcon("C:\\Users\\Juan\\git\\repository\\FuzzyLogic\\images\\ueb.png");

     Image scaledImage = originalIcon.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
     ImageIcon scaledIcon = new ImageIcon(scaledImage);
     icon.setIcon(scaledIcon);
     Up.add(icon);

        
        
        JPanel foot = new JPanel();
        FlowLayout flowLayout_1 = (FlowLayout) foot.getLayout();
        flowLayout_1.setVgap(15);
        foot.setBackground(new Color(43, 123, 140));
        add(foot, BorderLayout.SOUTH);
        
        JLabel footTitle= new JLabel("© 2025 FuzzyLogic Universidad El bosque ");
        footTitle.setForeground(new Color(255, 255, 255));
        footTitle.setFont(new Font("Vensim Sans Mono", Font.PLAIN, 15));
        foot.add(footTitle);
    }

   
}
