package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarcketBehaviour, iQueueBehaviour {

    private List<iActorBehaviour> queue;
    private List<iActorBehaviour> queueReturn;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
        this.queueReturn = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    // Клиент пришел сдавать товар
    @Override
    public void acceptToReturnMarket(iActorBehaviour actor) {
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин сдать товар");
        takeInQueueReturn(actor);
    }

    // @Override
    // public void takeInQueue(iActorBehaviour actor) {
    // if (actor.getTypeClient() == 1) && actor.getIdPromo() >=
    // actor.getCountIdPromo()) {
    // System.out.println(actor.geActor().getName() + " акция закончилась. Клиенту
    // отказано в обслуживании.");
    //
    // } else {
    // this.queue.add(actor);
    // System.out.println(actor.geActor().getName() + " клиент добавлен в очередь
    // ");
    // }

    // }
    private int count = 0;

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        if (actor.getTypeClient() == 1) {
            count++;
            if (count >= actor.getCountIdPromo()) {
                System.out.println(actor.geActor().getName() + " акция закончилась. Клиенту отказано в обслуживании.");
            } else {
                this.queue.add(actor);
                System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
            }
        } else {
            this.queue.add(actor);
            System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
        }

    }

    // Очередь на возврат
    public void takeInQueueReturn(iActorBehaviour actor) {
        this.queueReturn.add(actor);
        System.out.println(actor.geActor().getName() + " клиент добавлен в очередь на возврат");
    }

    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    // Выход клиента после возврата
    @Override
    public void releseFromMarketReturn(List<Actor> actorsReturn) {
        for (Actor actor : actorsReturn) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    // Метод возврата товара
    public void marketReturn() {
        returnOrder();
        returnMoney();
        releaseFromQueueReturn();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    // Клиент получил возврат
    @Override
    public void releaseFromQueueReturn() {
        List<Actor> releaseActorsReturn = new ArrayList<>();
        for (iActorBehaviour actor : queueReturn) {
            if (actor.isTakeMoney()) {
                releaseActorsReturn.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActorsReturn);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент сделал заказ ");

            }
        }
    }

    // Метод возврата товара
    public void returnOrder() {
        for (iActorBehaviour actor : queueReturn) {
            if (!actor.isReturnOrder()) {
                actor.setReturnOrder(true);
                System.out.println(actor.geActor().getName() + " клиент сдал заказ ");
            }
        }

    }

    // Метод возврата денег
    public void returnMoney() {
        for (iActorBehaviour actor : queueReturn) {
            if (actor.isReturnOrder()) {
                actor.setTakeMoney(true);
                System.out.println(actor.geActor().getName() + " клиент получил деньги ");
            }
        }
    }

}
