package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean val);

    public void setMakeOrder(boolean val);

    public Actor geActor();

    // Добавил контракт на возврат товара и денег
    public boolean isReturnOrder();

    public boolean isTakeMoney();

    public void setReturnOrder(boolean val);

    public void setTakeMoney(boolean val);

    public int getIdPromo();

    public int getCountIdPromo();

    public int getTypeClient();

}
