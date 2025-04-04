import java.util.ArrayList;

public class Reservationsystem {
    private ArrayList<Event> events = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);}
    public void addEvent (String name, double price){
        events.add(new Event(name, price));
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void addCustomer (String firstName, String lastName, String email) {
        customers.add(new Customer(firstName, lastName, email));
    }
    public Event findEvent (String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }
public Customer findCustomer (String lastName) {
        for (Customer customer : customers) {
            if (customer.getLastName().equals(lastName)) {
                return customer;
            }
        }
        return null;
}
public void makeReservation (Event event, Customer customer) {
        if(customer != null && event != null) {
            customer.addReservation(event);
        }else{
            System.out.println("Customer or event is unvalid");
        }
}
public void changeEventPrice (String name,double newPrice){
        Event event = findEvent(name);
        if (event != null) {
            event.setPrice(newPrice);
            System.out.println("Price for"+ name+ "changed to " + newPrice);
        }else{
            System.out.println("Customer or event is unvalid");

        }
}

}