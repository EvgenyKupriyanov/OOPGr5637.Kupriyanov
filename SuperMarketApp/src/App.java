import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new OrdinaryClient("masha");
        iActorBehaviour client3 = new SpecialClient("prezident", 1);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client5 = new PromotionClient("Vova", 1, "Biglion");
        iActorBehaviour client6 = new PromotionClient("Dima", 2, "Biglion");
        iActorBehaviour client7 = new PromotionClient("Ivan", 3, "Biglion");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        // magnit.acceptToMarket(client5);
        magnit.acceptToReturnMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);

        magnit.update();
        System.out.println("-------------------------------------------------");
        magnit.marketReturn();

    }
}
