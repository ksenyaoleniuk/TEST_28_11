/**
 * Created by olenyuk on 28.11.2016.
 */
public class ForSeason implements PassType{
    double NUM;
    double DAYS;
    public ForSeason(){
        Double NUM = Double.POSITIVE_INFINITY;
        Double DAYS = Double.POSITIVE_INFINITY;

        this.NUM = NUM;
        this.DAYS = NUM;

    }
    public String getType(){
        return "ForSeason";
    }
    public int getDays(){
        return 100000000;
    }
    public int getLifts(){
        return 1000000000;
    }
}
