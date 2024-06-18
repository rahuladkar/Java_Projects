package Banking_Managaement_Sytem;

public class Validation {

    public static  boolean  validateMob(long mobNum){
        int count = 0;
        long temp = mobNum;
        while (temp > 0){
            temp /= 10;
            count++;
        }

        if (count == 10 && mobNum >= 6000000000l){
            return true;
        }
        else {
            return false;
        }
    }

    public static  boolean  validateAdhar(long adharNum){
        int count = 0;
        while (adharNum > 0){
            adharNum /= 10;
            count++;
        }

        if (count == 12){
            return true;
        }
        else {
            return false;
        }
    }


}

