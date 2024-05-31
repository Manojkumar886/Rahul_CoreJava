package Core_Java.Console_App01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account_Details
{
    private String AccountHoldername;
    private long AccountNumber;
    private String IFSC_code;
    private String Address;
    private double Accountbalance;

}
