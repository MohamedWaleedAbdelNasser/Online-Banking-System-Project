package Main.Package1;

import java.util.Calendar;
import java.util.Date;

public class Certificate {
    private double amountofcert;
    private Date timing;
    private final double interest = 0.18;


    public Certificate(double amountofcert, Date timing) {
        this.amountofcert = amountofcert;
        this.timing = timing;
    }

}
