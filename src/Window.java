import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window {
    private JFrame windowFrame;
    private JPanel windowPanel;

    private JButton generateButton;

    private JLabel label1;
    public Window() {
        Initialize();
        SetLayout();
        windowPanel.add(generateButton);
        windowPanel.add(label1);
        windowFrame.add(windowPanel);
        GenerateRandomNumber();
    }
    private void Initialize(){
        windowFrame = new JFrame();
        windowFrame.setTitle("Hello World");
        windowFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        windowFrame.setSize(500,500);
        windowFrame.setLocationRelativeTo(null);
        windowFrame.setVisible(true);
    }
    private void SetLayout(){
        windowPanel = new JPanel();
        windowPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,25));
        windowPanel.setBackground(Color.DARK_GRAY);
        createButton();
        label1 = new JLabel("test");
        label1.setSize(new Dimension(100,100));
        label1.setVisible(true);
        label1.setForeground(Color.WHITE);
    }

    private void createButton(){
        generateButton = new JButton("Generate");
        generateButton.setFocusable(false);
        generateButton.setPreferredSize(new Dimension(100,40));
        generateButton.setToolTipText("Generate random numbers !");
    }
    public void GenerateRandomNumber(){
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int r = random.nextInt();
                label1.setText(String.valueOf(r));
            }
        });
    }
}
