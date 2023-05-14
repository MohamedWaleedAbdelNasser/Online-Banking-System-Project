package Integration;
import Main.Package1.Costumer;
import Main.Package1.Service;
import Main.Package1.ReqCertificate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class DriverClass {
    public DriverClass() {
    }
    public String Driver_changephone()  {
        Costumer u1= new Costumer();
        u1.setPhone("01111162838");
        return u1.checkphone();
    }
    public String Driver_changemail()  {
        Costumer u1= new Costumer();
        u1.setEmail("alaahamdy001@gmail.com");
        return u1.checkemail();
    }
    public double Driver_deposit_1()  {
        Service u1= new Service();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_deposit_2()  {
        Service u1= new Service();
        u1.setAmount(1200);
        return u1.getAmount();
    }
    public double Driver_withdraw_1()  {
        Service u1= new Service();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_withdraw_2()  {
        Service u1= new Service();
        u1.setAmount(1200);
        return u1.getAmount();
    }
    public double Driver_transfer_1()  {
        Service u1= new Service();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_transfer_2()  {
        Service u1= new Service();
        u1.setAmount(1200);
        return u1.getAmount();
    }
    public boolean Driver_transfer_3()  {
        Service u1= new Service();
        return u1.getUser().isValid(String.valueOf(55555));
    }
    public double Driver_requestCertificate_1()  {
        ReqCertificate u1= new ReqCertificate();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_requestCertificate_2()  {
        ReqCertificate u1= new ReqCertificate();
        u1.setAmountofcert(1200);
        return u1.getAmountofcert();
    }
    public double Driver_requestCreditCard_1()  {
        ReqCertificate u1= new ReqCertificate();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_requestCreditCard_2()  {
        ReqCertificate u1= new ReqCertificate();
        u1.setAmountofcert(1200);
        return u1.getAmountofcert();
    }
    public double Driver_requestDebitCard_1()  {
        ReqCertificate u1= new ReqCertificate();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_requestDebitCard_2()  {
        ReqCertificate u1= new ReqCertificate();
        u1.setAmountofcert(1200);
        return u1.getAmountofcert();
    }

}


