// UPDATE 31/7 (FINALIZED)
package adv_prog_ass2;
import java.util.ArrayList;
import java.util.TreeSet;

public class Client {

    private TreeSet<Customer> cust = new TreeSet<>();
    private TreeSet<Restaurant> rest = new TreeSet<>();
    private ArrayList<Order> orders = new ArrayList<>();

    // Constructor
    public Client(TreeSet<Customer> customers, TreeSet<Restaurant> restaurants, ArrayList<Order> orders) {
        this.cust = customers;
        this.rest = restaurants;
        this.orders = orders;
    }

    public boolean isCustomerRegistered(int id) {
        for (Customer c : cust) {
            if (c.getCid() == id) {
                return true;
            }
        }
        return false;
    }

    public Customer getCustomerById(int custId) {
        for (Customer c : cust) {
            if (c.getCid() == custId) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Order> getOrdersByCustomerId(int customerId) {
    ArrayList<Order> customerOrders = new ArrayList<>();
    for (Order ord : orders) {
        if (ord.getCustomerId() == customerId) {
            customerOrders.add(ord);
        }
    }
    return customerOrders;
}


    public boolean isRestaurantRegistered(int id) {
        for (Restaurant r : rest) {
            if (r.getRid() == id) {
                return true;
            }
        }
        return false;
    }

    public Restaurant getRestaurantById(int restId) {
        for (Restaurant r : rest) {
            if (r.getRid() == restId) {
                return r;
            }
        }
        return null;
    }
}
