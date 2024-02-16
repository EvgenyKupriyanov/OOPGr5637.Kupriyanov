package Domen;

public class HotDrink extends Product{

    private int temp;
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public HotDrink(int price, int place, String name, long id, int temp) {
        super(price, place, name, id);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Temp = " + temp ;
    }
}

