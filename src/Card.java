/**
 * Created by olenyuk on 28.11.2016.
 */
public class Card {
    String type;
    int days;
    int lifts;
    public Card(String indentityNum, PassType type,PassType days,PassType lifts){
        this.type = type.getType();
        this.days = days.getDays();
        this.lifts = lifts.getLifts();}
        public int getDays(){
        return days;}
    public int getLifts(){
        return lifts;}


    public void setLifts(){
        this.lifts = lifts - 1;

    }}


