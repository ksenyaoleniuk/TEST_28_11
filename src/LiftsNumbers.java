/**
 * Created by olenyuk on 28.11.2016.
 */
public enum   LiftsNumbers {
    TEN, TWENTY, FIFTY, HUNDRIED;
    public int enumToInt() {
        if (this.equals(TEN)) {
            return 10;
        }
        if (this.equals(TWENTY)) {
            return 20;

        }
        if (this.equals(FIFTY)) {
            return 50;

        }
        if (this.equals(HUNDRIED)) {
            return 100;
        }
        return 0;
    }}
