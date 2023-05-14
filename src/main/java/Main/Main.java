package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel Main;
    private JLabel WelcomeLabel;
    private JButton dashBoardButton;
    private JButton myaccount;

    static JFrame frame= new JFrame("MainWindow");

    public Main() {
        dashBoardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Options");
                frame.setContentPane(new Options().getDashboard());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);

            }
        });
        myaccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("My Account");
                frame.setContentPane(new MyAccount().getMyaccount());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);

            }
        });
    }


    public static  void main(String[] args){
        frame.setContentPane(new Main().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }

    public JPanel getMainPanel() {
        return Main;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.Main = mainPanel;
    }
}
