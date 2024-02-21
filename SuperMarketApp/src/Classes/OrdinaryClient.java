package Classes;

public class OrdinaryClient extends Actor {

    private static int typeClient = 1;

    public OrdinaryClient(String name) {
        super(name);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    @Override
    public boolean isTakeMoney() {
        return super.isTakeMoney;
    }

    @Override
    public void setReturnOrder(boolean val) {
        super.isReturnOrder = val;
    }

    @Override
    public void setTakeMoney(boolean val) {
        super.isTakeMoney = val;
    }

    @Override
    public int getIdPromo() {
        return 0;
    }

    @Override
    public int getCountIdPromo() {
        return 0;
    }

    @Override
    public int getTypeClient() {
        return 0;
    }
}