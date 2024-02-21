package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarcketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);

    // Контракт на приход клиента на возврат
    public void acceptToReturnMarket(iActorBehaviour actor);

    public void releseFromMarket(List<Actor> actors);

    // Контракт на ухода клиента после возврата
    public void releseFromMarketReturn(List<Actor> actorsReturn);

    public void update();

    public void marketReturn();
}
