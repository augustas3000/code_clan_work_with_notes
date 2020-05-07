package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        int indx = this.stock.indexOf(item);

        if (indx != -1) {
            this.stock.remove(indx);
        }
    }

    public Double totalPotentialProfit() {
      Double profit = 0.0;

      for (ISell item : this.stock) {
          profit += item.calculateMarkup();
      }
        return profit;
    };


//    getters

    public ArrayList<ISell> getStock() {
        return stock;
    }

//    setters


    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }
}
