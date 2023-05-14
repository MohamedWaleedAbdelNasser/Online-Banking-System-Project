package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options {
    private JPanel Dashboard;
    private JLabel dashboardlabel;
    private JLabel label2;
    private JButton backButton;
    private JButton withdrawMoneyButton;
    private JButton transferToAnotherAccountButton;
    private JButton requestCertificateOfDepositButton;
    private JButton depositMoneyButton;

    static JFrame frame= new JFrame("Options");

    public Options() {

        depositMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Deposit");
                frame.setContentPane(new Deposit().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });

        requestCertificateOfDepositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Request Certificate");
                frame.setContentPane(new DepositCertificate().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });

        transferToAnotherAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Transfer");
                frame.setContentPane(new Transfer().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });

        withdrawMoneyButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Withdraw");
                frame.setContentPane(new Withdraw().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Main Window");
                frame.setContentPane(new Main().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);




            }
        });
    }

    public JPanel getDashboard() {
        return Dashboard;
    }

    public void setDashboard(JPanel dashboard) {
        Dashboard = dashboard;
    }
    public static  void main(String[] args){
        frame.setContentPane(new Options().getDashboard());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
