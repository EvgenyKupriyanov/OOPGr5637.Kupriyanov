package Interfaces;

public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor);

    public void releaseFromQueue();

    // Контракт на очередь на возврат
    public void takeInQueueReturn(iActorBehaviour actor);

    // Контракт на выход из очереди на возврат
    public void releaseFromQueueReturn();

    public void takeOrder();

    public void giveOrder();
    // public void geActor ();
}
