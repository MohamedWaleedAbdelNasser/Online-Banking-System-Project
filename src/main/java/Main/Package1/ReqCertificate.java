package Main.Package1;

import java.lang.String;
import java.util.*;

import java.time.LocalDateTime;
public class ReqCertificate {
    private double amountofcert;
    private LocalDateTime timing;
    private Costumer user=new Costumer();


    public ReqCertificate() {
    }

    public  double getAmountofcert() {
        return amountofcert;
    }

    public  void setAmountofcert(double amountofcert) {this.amountofcert = amountofcert;
    }

    public Costumer getUser() {
        return user;
    }

    public void setUser(Costumer user) {
        this.user = user;
    }

    public String requestCertificate(){
        double amount= getAmountofcert();
        String output= "false";
        if(amount >= 5000){
            if((user.getBalance())>=amount)
            {
                double newbalance= (user.getBalance())-amount;
                user.setBalance(newbalance);
                Calendar cal = Calendar.getInstance();
                Date today = cal.getTime();
                user.createCertificate(amount,today);
                output="true";
            }

        }
        else {
        output="false";}
        return output;
    }

}
