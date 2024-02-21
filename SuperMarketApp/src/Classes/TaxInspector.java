package Classes;

import Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;
    private boolean isTakeMoney;
    // private static int typeClient = 1;

    public TaxInspector() {
        this.name = "Tax Audit";
    }

    public String getName() {
        return name;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        isMakeOrder = val;
    }

    @Override
    public Actor geActor() {
        return new OrdinaryClient(name);
    }

    @Override
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

    @Override
    public boolean isTakeMoney() {
        return isTakeMoney;
    }

    @Override
    public void setReturnOrder(boolean val) {
        isReturnOrder = val;
    }

    @Override
    public void setTakeMoney(boolean val) {
        isTakeMoney = val;
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
