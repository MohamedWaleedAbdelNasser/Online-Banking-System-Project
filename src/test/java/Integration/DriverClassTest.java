package Integration;

import org.junit.Test;
import Main.Package1.ReqCertificate;
import Main.Package1.Costumer;
import Main.Package1.Service;
import static org.junit.Assert.assertEquals;

public class DriverClassTest {
    @Test
    public void Driver_changephone() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Costumer u1= new Costumer();
        u1.setPhone("01111162838");
        outputFromFunction = u1.checkphone();

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = u2.Driver_changephone();

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_changemail() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Costumer u1= new Costumer();
        u1.setEmail("ammar@gmail.com");
        outputFromFunction = u1.checkemail();

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = u2.Driver_changemail();

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }

    @Test
    public void Driver_deposit_1() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Service u1= new Service();
        u1.getUser().setBalance(1200);
        outputFromFunction = String.valueOf(u1.getUser().getBalance());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_deposit_1());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_deposit_2() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Service u1= new Service();
        u1.setAmount(1200);
        outputFromFunction = String.valueOf(u1.getAmount());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_deposit_2());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_withdraw_1() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Service u1= new Service();
        u1.getUser().setBalance(1200);
        outputFromFunction = String.valueOf(u1.getUser().getBalance());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_withdraw_1());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_withdraw_2() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Service u1= new Service();
        u1.setAmount(1200);
        outputFromFunction = String.valueOf(u1.getAmount());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_withdraw_2());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_transfer_1() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Service u1= new Service();
        u1.getUser().setBalance(1200);
        outputFromFunction = String.valueOf(u1.getUser().getBalance());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_transfer_1());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }

    @Test
    public void Driver_transfer_2() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Service u1= new Service();
        u1.setAmount(1200);
        outputFromFunction = String.valueOf(u1.getAmount());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_transfer_2());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_transfer_3() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        Service u1= new Service();
        outputFromFunction = String.valueOf(u1.getUser().isValid(String.valueOf(55555)));

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_transfer_3());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_requestCertificate_1() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        ReqCertificate u1= new ReqCertificate();
        u1.getUser().setBalance(1200);
        outputFromFunction = String.valueOf(u1.getUser().getBalance());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_requestCertificate_1());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_requestCertificate_2() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        ReqCertificate u1= new ReqCertificate();
        u1.setAmountofcert(1200);
        outputFromFunction = String.valueOf(u1.getAmountofcert());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_requestCertificate_2());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_requestCreditCard_1() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        ReqCertificate u1= new ReqCertificate();
        u1.getUser().setBalance(1200);
        outputFromFunction = String.valueOf(u1.getUser().getBalance());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_requestCreditCard_1());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_requestCreditCard_2() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        ReqCertificate u1= new ReqCertificate();
        u1.setAmountofcert(1200);
        outputFromFunction = String.valueOf(u1.getAmountofcert());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_requestCreditCard_2());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_requestDebitCard_1() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        ReqCertificate u1= new ReqCertificate();
        u1.getUser().setBalance(1200);
        outputFromFunction = String.valueOf(u1.getUser().getBalance());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_requestDebitCard_1());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
    @Test
    public void Driver_requestDebitCard_2() {
        String outputFromFunction = null;
        String outputFromDriverFunction = null;

        ReqCertificate u1= new ReqCertificate();
        u1.setAmountofcert(1200);
        outputFromFunction = String.valueOf(u1.getAmountofcert());

        DriverClass u2 = new DriverClass();
        outputFromDriverFunction = String.valueOf(u2.Driver_requestDebitCard_2());

        assertEquals(outputFromDriverFunction,outputFromFunction);
    }
}