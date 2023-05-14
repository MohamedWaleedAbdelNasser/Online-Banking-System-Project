package Main;

import Main.Package1.Costumer;
import Main.Package1.*;



public class PerfTester {
    public static void main(String[] args) throws Exception {
        Costumer Costumer = new Costumer("AmmarYasser", "Ammar1123");
        Service service = new Service();
        ReqCertificate Request = new ReqCertificate();
        for (int i = 0; i < 10000; i++) {
            Costumer.checkusername();
            Costumer.getBalance();
            Costumer.changepassword("Ammar1123");
            Costumer.changephone("01111162838");
            Costumer.changeemail("ammar@gmail.com");
            service.getUser().setBalance(5000);
            service.setAmount(1234);
            service.setTransferaccount("3214");
            service.transferMoney();
            service.depositMoney();
            service.withdrawMoney();
            Request.getUser().setBalance(20000);
            Request.setAmountofcert(9999);
            Request.requestCertificate();

        }
    }

}
