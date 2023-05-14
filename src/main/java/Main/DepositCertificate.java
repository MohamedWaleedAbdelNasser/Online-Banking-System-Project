package Main;

import Main.Package1.ReqCertificate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DepositCertificate {
    static JFrame frame = new JFrame("Request Certificate");
    private JPanel mainPanel;
    private JLabel certificate;
    private JLabel amount;
    private JButton ConfirmButton;
    private JTextField password;
    private JButton backButton;
    private JTextField amountof;

    public DepositCertificate() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.valueOf(amountof.getText());
                String ippassword= password.getText();
                Path Output_file = Path.of("Database/NewPassword.txt");

                System.out.print(ippassword);
                try {
                    String InputPassword = Files.readString(Output_file);
                    if ( InputPassword.equals(ippassword)){
                        System.out.print("here?");
                        ReqCertificate newrequest= new ReqCertificate();
                        newrequest.setAmountofcert(amount);
                        if (newrequest.requestCertificate()=="true"){
                            JOptionPane.showMessageDialog(null, "Certificate successfully created");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Certificate creation unsuccessfull" +
                                    "/n Please check your balance");
                        }
                    }
                    else{
                        System.out.print(InputPassword);
                        JOptionPane.showMessageDialog(null, "Wrong Password");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }



            }
        });
        backButton.addActionListener(new ActionListener() {
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
    }
    public JPanel getMainPanel() {
        return mainPanel;
    }
    public static void main(String[] args) {

        frame.setContentPane(new DepositCertificate().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }


}
