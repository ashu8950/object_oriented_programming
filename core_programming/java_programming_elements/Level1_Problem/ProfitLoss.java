class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        double profit = 0, loss = 0, percentage = 0;

        if (costPrice < sellingPrice) {
            // Calculate profit and profit percentage
            profit = sellingPrice - costPrice;
            percentage = ((double) profit / costPrice) * 100;
            System.out.printf(
                "The Cost Price is INR %d and the Selling Price is INR %d\nThe Profit is INR %.2f and the Profit Percentage is %.2f%%\n", 
                costPrice, sellingPrice, profit, percentage);
        } 
        else if (sellingPrice < costPrice) {
            // Calculate loss and loss percentage
            loss = costPrice - sellingPrice;
            percentage = ((double) loss / costPrice) * 100;
            System.out.printf(
            "The Cost Price is INR %d and the Selling Price is INR %d\nThe Loss is INR %.2f and the Loss Percentage is %.2f%%\n", 
            costPrice, sellingPrice, loss, percentage);
        } 
        else {
            System.out.printf("The Cost Price is INR %d and the Selling Price is INR %d\nNo Profit, No Loss.\n", costPrice, sellingPrice);
        }
    }
}
