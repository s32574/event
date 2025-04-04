import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Event> reservationList = new ArrayList<>();
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Customer (String firstName,String lastName,String email){
        this(firstName,lastName);
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void addReservation(Event event){
        reservationList.add(event);
        event.reserveSeat();
        System.out.println ("Reservation made for"+ firstName + " " + lastName+ " to " + event.getName());
    }
    public void displayReservations(){
        if(reservationList.isEmpty()){
            System.out.println("No reservations found");
        }else{
            System.out.println("Reservation List:");
            for(Event e : reservationList){
                System.out.println(e);
            }
        }
    }
    public void cancelReservation(Event event){
        if (reservationList.contains(event)){
            reservationList.remove(event);
            System.out.println("Reservation cancelled");
        }
        else{
            System.out.println("No reservations found");
        }
    }
}
