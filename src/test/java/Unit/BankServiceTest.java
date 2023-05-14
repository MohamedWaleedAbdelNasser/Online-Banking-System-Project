package Unit;

import org.junit.Test;
import Main.Package1.*;
import Main.Package1.ReqCertificate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BankServiceTest {
    @Test
    public void DepositCertificateTest1(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(20000);
        testing.setAmountofcert(3000);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest2(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(10000);
        testing.setAmountofcert(15000);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest3(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(0);
        testing.setAmountofcert(5600);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest4(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(2000);
        testing.setAmountofcert(2000);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest5(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(5000);
        testing.setAmountofcert(5000);
        assertEquals("true",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest6(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(10000);
        testing.setAmountofcert(5000);
        assertEquals("true",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest7(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(200000);
        testing.setAmountofcert(1200);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest8(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(200000);
        testing.setAmountofcert(500);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void DepositCertificateTest9(){
        ReqCertificate testing= new ReqCertificate();
        testing.getUser().setBalance(200000);
        testing.setAmountofcert(10000);
        assertEquals("true",testing.requestCertificate());
    }

    @Test
    public void WithdrawTest1(){
        Service testing= new Service();
        testing.getUser().setBalance(20000);
        testing.setAmount(10000);
        assertEquals("true",testing.withdrawMoney());
    }

    @Test
    public void WithdrawTest2(){
        Service testing= new Service();
        testing.getUser().setBalance(999);
        testing.setAmount(0);
        assertEquals("true",testing.withdrawMoney());
    }

    @Test
    public void WithdrawTest3(){
        Service testing= new Service();
        testing.getUser().setBalance(5000);
        testing.setAmount(10000);
        assertEquals("false",testing.withdrawMoney());
    }

    @Test
    public void WithdrawTest4(){
        Service testing= new Service();
        testing.getUser().setBalance(0);
        testing.setAmount(0);
        assertEquals("true",testing.withdrawMoney());
    }


    @Test
    public void DepositTest1(){
        Service testing= new Service();
        testing.getUser().setBalance(9990);
        testing.setAmount(1000);
        assertEquals("true",testing.depositMoney());
    }

    @Test
    public void DepositTest2(){
        Service testing= new Service();
        testing.getUser().setBalance(10000);
        testing.setAmount(0);
        assertEquals("true",testing.depositMoney());
    }

    @Test
    public void TransferTest1(){
        Service testing= new Service();
        testing.getUser().setBalance(3000);
        testing.setAmount(1000);
        testing.setTransferaccount("99999");
        assertEquals("true",testing.transferMoney());
    }

    @Test
    public void TransferTest2(){
        Service testing= new Service();
        testing.getUser().setBalance(3000);
        testing.setAmount(5000);
        testing.setTransferaccount("99999");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());

    }

    @Test
    public void TransferTest3(){
        Service testing= new Service();
        testing.getUser().setBalance(1234);
        testing.setAmount(1234);
        testing.setTransferaccount("99999");
        assertEquals("true",testing.transferMoney());

    }

    @Test
    public void TransferTest4(){
        Service testing= new Service();
        testing.getUser().setBalance(10000);
        testing.setAmount(1000);
        testing.setTransferaccount("");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());
    }

    @Test
    public void TransferTest5(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("Ammar");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());
    }

    @Test
    public void TransferTest6(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("@@@@@");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());
    }

    @Test
    public void TransferTest7(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("12");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());
        }

}