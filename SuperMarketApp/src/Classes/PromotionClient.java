package Classes;

// Класс, описывающий акционного клиента.
public class PromotionClient extends Actor {
    private int idPromo;
    private String namePromo;
    private static int typeClient = 1;
    private static int countIdPromo = 1;

    public int getTypeClient() {
        return 1;
    }

    public PromotionClient(String name, int idPromo, String namePromo) {
        super(name);
        this.idPromo = idPromo;
        this.namePromo = namePromo;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public String getNamePromo() {
        return namePromo;
    }

    public void setNamePromo(String namePromo) {
        this.namePromo = namePromo;
    }

    @Override
    public String toString() {
        return "Id акционного клиента =" + idPromo + ", название акции=" + namePromo + ".";
    }

    @Override
    public Actor geActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
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
    public int getCountIdPromo() {
        return countIdPromo;
    }

}
