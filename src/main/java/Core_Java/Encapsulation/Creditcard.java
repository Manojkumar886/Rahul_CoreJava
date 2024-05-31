package Core_Java.Encapsulation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// tpstring(),getter,setter()
@NoArgsConstructor
@AllArgsConstructor
public class Creditcard
{
    private long cardnumber;
    private String cardaddress;
    private float cardbalance;

//    @Override
//    public String toString() {
//        return "Creditcard{" +
//                "cardnumber=" + cardnumber +
//                ", cardaddress='" + cardaddress + '\'' +
//                ", cardbalance=" + cardbalance +
//                '}';
//    }
//
//    public Creditcard(long cardnumber, String cardaddress, float cardbalance)
//    {
//        this.cardnumber=cardnumber;
//        this.cardaddress=cardaddress;
//        this.cardbalance=cardbalance;
//
//    }

//
//    public long getCardnumber() {
//        return cardnumber;
//    }
//
//    public void setCardnumber(long cardnumber) {
//        this.cardnumber = cardnumber;
//    }
//
//    public String getCardaddress() {
//        return cardaddress;
//    }
//
//    public void setCardaddress(String cardaddress) {
//        this.cardaddress = cardaddress;
//    }
//
//    public float getCardbalance() {
//        return cardbalance;
//    }
//
//    public void setCardbalance(float cardbalance) {
//        this.cardbalance = cardbalance;
//    }
}
