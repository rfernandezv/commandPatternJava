package commandPattern2;

public class SellStock implements Order{
    private Stock sellStock;

    public SellStock(Stock stock){
      this.sellStock = stock;
    }

    @Override
    public void execute() {
      sellStock.sell();
    }
}
