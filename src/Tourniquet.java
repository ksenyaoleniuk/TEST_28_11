/**
 * Created by olenyuk on 28.11.2016.
 */
public class Tourniquet {
//I should add checkng by the validity
    boolean check;
    int days;
    int lifts;
    Card card;
    public Tourniquet(Card card){
        this.card = card;
        if (card.getLifts() != 0){
            IGetPass();

        }
        else{
            System.out.println("I did not get pass");
        }
    }
    public void IGetPass(){
        card.setLifts();
        System.out.println("I got pass!!!!");
    }

}
