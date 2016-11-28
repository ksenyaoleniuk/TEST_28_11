import java.util.InvalidPropertiesFormatException;

/**
 * Created by olenyuk on 28.11.2016.
 */
public class WorkingDays implements PassType{
    LiftsNumbers lifts;
    DaysNumbers days;
    public WorkingDays(LiftsNumbers lifts, DaysNumbers days)
    {

    }
    public String getType(){
        return "Working days";
    }
    public int getDays(){
        return days.daysToInt();
    }
    public int getLifts(){
        return lifts.enumToInt();
    }

}
