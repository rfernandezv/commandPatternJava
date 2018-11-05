package commandPattern2;


public class BuyStock implements Order{
   private Stock buyStock;

   public BuyStock(Stock stock){
      this.buyStock = stock;
   }

   @Override
   public void execute() {
      buyStock.buy();
   }
}
