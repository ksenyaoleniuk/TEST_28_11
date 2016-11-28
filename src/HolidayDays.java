import java.util.InputMismatchException;
import java.util.InvalidPropertiesFormatException;

/**
 * Created by olenyuk on 28.11.2016.
 */
public class HolidayDays implements PassType{
    DaysNumbers days;
    LiftsNumbers lifts;
    public HolidayDays(DaysNumbers days, LiftsNumbers lifts){
        if (days.daysToInt() == 5)
            throw new InputMismatchException();
    this.days = days;
    this.lifts = lifts;


    }
    public String getType(){
        return "HolidaysDays";
    }
    public int getDays(){
        return days.daysToInt();
    }
    public int getLifts(){
        return lifts.enumToInt();
    }

}
