package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel {

    private JButton testButton;

    public MainView() {
        setPreferredSize(new Dimension(800, 500));
        setLayout(new BorderLayout());
        setBackground(new Color(240, 248, 255)); 

        JLabel title = new JLabel("FuzzyLogic");
        title.setFont(new Font("SansSerif", Font.BOLD, 28));
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title, BorderLayout.NORTH);

        testButton = new JButton("Click Me");
        testButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(new Color(240, 248, 255));
        centerPanel.add(testButton);
        add(centerPanel, BorderLayout.CENTER);
    }

    public JButton getTestButton() {
        return testButton;
    }
}
