/**
 * Created by olenyuk on 28.11.2016.
 */
public enum DaysNumbers {
    ONE, TWO, FIVE;
    public int daysToInt(){
        if (this.equals(ONE)){
            return 1;}
        if (this.equals(TWO)){
            return 2;}
        if (this.equals(FIVE)){
            return 5;
        }
        else{
            return 0;
        }



    }
}
