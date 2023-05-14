package Unit;

import org.junit.Test;
import Main.Package1.Costumer;

import static org.junit.Assert.*;

public class CostumerTest {

    @Test
    public void Usernametest1() throws Exception {
        Costumer test= new Costumer("AmmARR","ammar1123");
        assertEquals("true",test.checkusername());
    }

    @Test
    public void Usernametest2() throws Exception {
        Costumer test= new Costumer("Am13Ar","ammar1123");
        assertEquals("Your UserName is incorrect",test.checkusername());
    }

    @Test
    public void Usernametest3() throws Exception {
        Costumer test= new Costumer("4325d44","ammar1123");
        assertEquals("Your UserName is incorrect",test.checkusername());
    }

    @Test
    public void Usernametest4() throws Exception {
        Costumer test= new Costumer("9939933","ammar1123");
        assertEquals("Your UserName is incorrect",test.checkusername());

    }

    @Test
    public void Usernametest5() throws Exception {
        Costumer test= new Costumer("ammar1","ammar1123");
        assertEquals("Your UserName is incorrect",test.checkusername());
    }

    @Test
    public void Usernametest6() throws Exception {
        Costumer test= new Costumer("@*Ammar)","ammar1123");
        assertEquals("Your UserName is incorrect",test.checkusername());
    }

    @Test
    public void Usernametest7() throws Exception {
        Costumer test= new Costumer("","ammar1123");
        assertEquals("Your UserName is incorrect",test.checkusername());
    }

    @Test
    public void Usernametest8() throws Exception {
        Costumer test= new Costumer("Ammar","ammar1123");
        assertEquals("Your UserName is incorrect",test.checkusername());
    }


    @Test
    public void passwordchecktest1(){
        Costumer test= new Costumer("AmmarYasser","93282373");
        assertEquals("Your Password is incorrect",test.checkpassword());
    }

    @Test
    public void passwordchecktest2(){
        Costumer test= new Costumer("Ammaryasser","Ammar1123");
        assertEquals("true",test.checkpassword());
    }

    @Test
    public void passwordchecktest3(){
        Costumer test= new Costumer("Ammaryasser","A334m");
        assertEquals("Your Password is incorrect",test.checkpassword());
    }

    @Test
    public void passwordchecktest4(){
        Costumer test= new Costumer("Ammaryasser","@@@@");
        assertEquals("Your Password is incorrect",test.checkpassword());
    }

    @Test
    public void passwordchecktest5(){
        Costumer test= new Costumer("Ammaryasser","");
        assertEquals("Your Password is incorrect",test.checkpassword());
    }

    @Test
    public void passwordchecktest6(){
        Costumer test= new Costumer("Ammaryasser","a993rrr");
        assertEquals("Your Password is incorrect",test.checkpassword());
    }


    @Test
    public void PasswordChangeTest1(){
        Costumer test= new Costumer("AmmarYasser","Ammar1123");
        assertEquals("true",test.changepassword("Ay11234"));
    }
    //TC2
    @Test
    public void PasswordChangeTest2(){
        Costumer test= new Costumer("AmmarYasser","Ammar1123");
        assertEquals("Your Password is incorrect",test.changepassword("A334m"));
    }
    //TC3
    @Test
    public void PasswordChangeTest3(){
        Costumer test= new Costumer("AmmarYasser","Ammar1123");
        assertEquals("Your Password is incorrect",test.changepassword("@@@@"));
    }
    //TC4
    @Test
    public void PasswordChangeTest4(){
        Costumer test= new Costumer("AmmarYasser","Ammar1123");
        assertEquals("Your Password is incorrect",test.changepassword("93282373"));
    }
    //TC5
    @Test
    public void PasswordChangeTest5(){
        Costumer test= new Costumer("AmmarYasser","Ammar1123");
        assertEquals("Your Password is incorrect",test.changepassword(""));
        }
    //TC6
    @Test
    public void PasswordChangeTest6(){
        Costumer test= new Costumer("AmmarYasser","Ammar1123" );
        assertEquals("Your Password is incorrect",test.changepassword("a993rrr"));
        }


    @Test
    public void PhoneCheckTest1(){
        Costumer test= new Costumer();
        test.setPhone("012445");
        assertEquals("Your Phone is incorrect",test.checkphone());
    }

    @Test
    public void PhoneCheckTest2(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("true",test.checkphone());
    }

    @Test
    public void PhoneCheckTest3() {
        Costumer test = new Costumer();
        test.setPhone("01914253678");
        assertEquals("Your Phone is incorrect", test.checkphone());
    }

    @Test
    public void PhoneCheckTest4(){
        Costumer test= new Costumer();
        test.setPhone("Ammar");
        assertEquals("Your Phone is incorrect",test.checkphone());
    }

    @Test
    public void PhoneCheckTest5(){
        Costumer test= new Costumer();
        test.setPhone("Ammar@");
        assertEquals("Your Phone is incorrect",test.checkphone());
    }

    @Test
    public void PhoneCheckTest6(){
        Costumer test= new Costumer();
        test.setPhone("");
        assertEquals("Your Phone is incorrect",test.checkphone());
    }

    @Test
    public void PhoneCheckTest7(){
        Costumer test= new Costumer();
        test.setPhone("011111628383");
        assertEquals("Your Phone is incorrect",test.checkphone());
    }

    @Test
    public void PhoneChangeTest1(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("Your Phone is incorrect",test.changephone("012445"));
    }

    @Test
    public void PhoneChangeTest2(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("true",test.changephone("01094619991"));
    }

    @Test
    public void PhoneChangeTest3(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("Your Phone is incorrect",test.changephone("01914253678"));
    }

    @Test
    public void PhoneChangeTest4(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("Your Phone is incorrect",test.changephone("Ammar"));
    }

    @Test
    public void PhoneChangeTest5(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("Your Phone is incorrect",test.changephone("Ammar@"));
    }

    @Test
    public void PhoneChangeTest6(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("Your Phone is incorrect",test.changephone(""));
    }

    @Test
    public void PhoneChangeTest7(){
        Costumer test= new Costumer();
        test.setPhone("01111162838");
        assertEquals("Your Phone is incorrect",test.changephone("011111628383"));
    }

    @Test
    public void EmailTest1(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@outlook.com");
        assertEquals("true",test.checkemail());
    }

    @Test
    public void EmailTest2(){
        Costumer test= new Costumer();
        test.setEmail("ammar1232.com");
        assertEquals("Your Email is incorrect",test.checkemail());
    }


    @Test
    public void EmailTest3(){
        Costumer test= new Costumer();
        test.setEmail("");
        assertEquals("Your Email is incorrect",test.checkemail());
    }

    @Test
    public void EmailTest4(){
        Costumer test= new Costumer();
        test.setEmail("Ammar1123");
        assertEquals("Your Email is incorrect",test.checkemail());
    }

    @Test
    public void EmailTest5(){
        Costumer test= new Costumer();
        test.setEmail("%%@x.com");
        assertEquals("Your Email is incorrect",test.checkemail());
    }

    @Test
    public void EmailTest6(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@@@gmail.com");
        assertEquals("Your Email is incorrect",test.checkemail());

    }

    @Test
    public void EmailTest7(){
        Costumer test= new Costumer();
        test.setEmail("21321312");
        assertEquals("Your Email is incorrect",test.checkemail());
    }

    @Test
    public void EmailChangeTest1(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@outlook.com");
        assertEquals("true",test.changeemail("Ammar@gmail.com"));

    }

    @Test
    public void EmailChangeTest2(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@outlook.com");
        assertEquals("Your Email is incorrect",test.changeemail("Ammar1123"));
    }

    @Test
    public void EmailChangeTest3(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@outlook.com");
        assertEquals("Your Email is incorrect",test.changeemail(""));
    }

    @Test
    public void EmailChangeTest4(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@outlook.com");
        assertEquals("Your Email is incorrect",test.changeemail("Ammary_1123@@@gmail.com"));
    }

    @Test
    public void EmailChangeTest5(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@outlook.com");
        assertEquals("true", test.changeemail("Ammar@gmail.com"));
    }

    @Test
    public void EmailChangeTest6(){
        Costumer test= new Costumer();
        test.setEmail("Ammary_1123@outlook.com");
        assertEquals("Your Email is incorrect", test.changeemail("21321312"));
    }

}
