
public class Main {

    public static void main(int totalWarehouse,int annualOrders,int orderLine,int totalorderLines, int boxCosts,int netSales,int annualNet){
        int warehouseCosts = totalWarehouse - annualOrders;
        int orderLines = (orderLine - totalorderLines) / 100;
        int boxCost = (boxCosts - netSales) / annualOrders;
        int annualCosts = (netSales * 100) - (totalWarehouse / annualNet) * 100;
        System.out.println(warehouseCosts);
        System.out.println(orderLines);
        System.out.println(boxCost);
        System.out.println(annualCosts);
    }
}

