package adv_prog_ass2;

import java.util.List;

public class Order {
    private int orderID, custID, q1, q2, q3;
    private String restName, orderDate, menu1, menu2, menu3;
    private double totalprice, price1, price2, price3;
    private List<OrderItem> orderItems;

    public Order(int orderID, int custID, String orderDate, String restName, String menu1, String menu2, String menu3,
                 double price1, int q1, double price2, int q2, double price3, int q3,
                 double totalprice) {
        this.orderID = orderID;
        this.custID = custID;
        this.restName = restName;
        this.orderDate = orderDate;
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.totalprice = totalprice;
    }

    // Calculate total price
   public double calculateTotalPrice() {
        return (price1 * q1) + (price2 * q2) + (price3 * q3);
    }

    public int getCustomerId() {
        return custID;
    }

    public String getRestaurantName() {
        return restName;
    }

    public String getDateOrdered() {
        return orderDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getTotalAmount() {
        return totalprice;
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    public double getPrice3() {
        return price3;
    }

    public void setPrice3(double price3) {
        this.price3 = price3;
    }

    public String getMenu1() {
        return menu1;
    }

    public void setMenu1(String menu1) {
        this.menu1 = menu1;
    }

    public String getMenu2() {
        return menu2;
    }

    public void setMenu2(String menu2) {
        this.menu2 = menu2;
    }

    public String getMenu3() {
        return menu3;
    }

    public void setMenu3(String menu3) {
        this.menu3 = menu3;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getQ1() {
        return q1;
    }

    public void setQ1(int q1) {
        this.q1 = q1;
    }

    public int getQ2() {
        return q2;
    }

    public void setQ2(int q2) {
        this.q2 = q2;
    }

    public int getQ3() {
        return q3;
    }

    public void setQ3(int q3) {
        this.q3 = q3;
    }

    @Override
    public String toString() {
        return  "\nOrder ID : " + getOrderID() +
               "\nCustomer ID : " + getCustomerId() +
               "\nOrder Date : " + getOrderDate() +
               "\nMenu Item 1 : " + getMenu1() + ", Price Item 1 : RM " + getPrice1() +
               "\nMenu Item 2 : " + getMenu2() + ", Price Item 2 : RM " + getPrice2() +
               "\nMenu Item 3 : " + getMenu3() + ", Price Item 3 : RM " + getPrice3() +
               "\nTotal Price : RM " + getTotalprice();
    }
    
}
