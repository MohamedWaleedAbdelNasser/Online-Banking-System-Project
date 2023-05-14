package Main.Package1;

import java.io.*;
import java.lang.*;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Costumer {
    private String username;
    private String password;
    private int verificationcode;
    private String address;
    private String phone;
    public double balance;
    private String email;
    private List<Certificate> certificates  = new ArrayList<Certificate>();
    private List<String> bankstatement  = new ArrayList<>();



    public Costumer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Costumer() {
    }

    public Costumer(String address, String phone, double balance, String email, Certificate certificate) {
        this.address = address;
        this.phone = phone;
        this.balance = balance;
        this.email = email;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String checkusername() throws Exception {
            String checker = getUsername();
            String correct1 = "false";
        try {
            if (checker.length() < 6 || checker == null)
                throw new InputMismatchException("Your UserName is incorrect");

            for (char x : checker.toCharArray()) {
                if (Character.isLetter(x)) {
                    correct1 = "true";

                }

                else throw new InputMismatchException("Your UserName is incorrect");
            }
        }catch (InputMismatchException e)
        {
            return "Your UserName is incorrect";
        }
        return correct1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String changepassword(String newpassword){
        String oldpassword= getPassword();
        this.password = newpassword;
        try{
        if(checkpassword()=="true"){
            this.password=newpassword;
            return "true";}
        else{
            this.password=oldpassword;
            throw new InputMismatchException("Your Password is incorrect");
        }}
        catch (InputMismatchException e)
        {
            return "Your Password is incorrect";

        }
        }


    public String checkpassword () throws InputMismatchException {
        List<Character> chars = new ArrayList<>();
        String checker = getPassword();
        String Capital = "false";
        String output = "false";
        String Number = "false";
        String small = "false";
        try {
            if (checker.length() < 6 || checker == null)
                throw new InputMismatchException("Your Password is incorrect");

            for (char x : checker.toCharArray()) {
                chars.add(x);
            }
            for (int i = 0; i < chars.size(); i++) {
                if (chars.get(i).isUpperCase(chars.get(i)))
                    Capital = "true";
                if (chars.get(i).isLowerCase(chars.get(i)))
                    small = "true";
                if (chars.get(i).isDigit(chars.get(i)))
                    Number = "true";
            }

            if (Capital == "true" && small == "true" && Number == "true")
                output = "true";
            else {
                throw new InputMismatchException("Your Password is incorrect");
            }
        }catch (InputMismatchException e)
        {
            return "Your Password is incorrect";

        }
        return output;
    }

    public int getVerificationcode() {
        return verificationcode;
    }

    public void setVerificationcode(int verificationcode) {
        this.verificationcode = verificationcode;
    }

    public String getAddress() {
        return address;
    }


    public double getBalance() {
        Path realOutput_file = Path.of("Database/MyBalance.txt");
        try {
            String MyBalanceOutput = Files.readString(realOutput_file);
            balance = Double.parseDouble(MyBalanceOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        File f1 = new File("Database/MyBalance.txt");
        FileOutputStream fos1 = null;
        try {
            fos1 = new FileOutputStream(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter pw1 = new PrintWriter(fos1);
        pw1.write(String.valueOf(balance));
        pw1.flush();
        try {
            fos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw1.close();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public  boolean isValid(String s)
    {
        Pattern p = Pattern.compile("(010|012|011)[0-9]{8}");

        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
    public String checkphone() {
        String number = getPhone();
        Boolean valid= false;
        String output="false";
        try {
        valid=isValid(number);

            if (valid) {
                output = "true";
            }
            else {
                throw new InputMismatchException("Your Phone is incorrect");
            }
        }catch (InputMismatchException e)
        {
            return  "Your Phone is incorrect";
        }
        return output;
    }
    public String changephone(String newphone){
        String oldphone= getPhone();
        this.phone= newphone;
        try {
            if (checkphone() == "true") {
                this.phone = newphone;
                return "true";
            } else {
                this.phone = oldphone;
                throw new InputMismatchException("Your Phone is incorrect");
            }
        }
        catch (InputMismatchException e)
        {
            return  "Your Phone is incorrect";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public String checkemail()
    {   String email = getEmail();
        String output="false";
        try {
            String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            boolean correct = patternMatches(email, regexPattern);
            if (correct)
                output = "true";
            else
                throw new InputMismatchException("Your Email is incorrect");
        }catch (InputMismatchException e)
        {
            return  "Your Email is incorrect";
        }

        return output;

    }
    public String changeemail(String newemail){
        String oldemail = this.getEmail();
        this.email= newemail;
        try {
            if (checkemail() == "true") {
                this.email = newemail;
                return "true";
            } else {
                this.email = oldemail;
                throw new InputMismatchException("Your Email is incorrect");
            }
        }
        catch (InputMismatchException e)
        {
            return  "Your Email is incorrect";
        }

    }

    public void createCertificate(double amount, Date timing) {

        Certificate certificate = new Certificate(amount,timing);
        certificates.add(certificate);

    }

    public void setBankstatement( String bankstatement) {
        String bankstatement1= new String(bankstatement);
       this.bankstatement.add(bankstatement1);

    }
}




