package RealWorldProblems.BookMovieSystem;

import RealWorldProblems.BookMovieSystem.Notification.EmailNotification;
import RealWorldProblems.BookMovieSystem.Notification.NotificationService;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movie dabangg = new Movie("dabang",2, Date.from(Instant.now(Clock.systemUTC())));
        Movie singham = new Movie("singham", 3, Date.from(Instant.now()));

        ShowTime showTime1 = new ShowTime(2, -1);
        ShowTime showTime2 = new ShowTime(2, 3);

        ShowTime showTime3 = new ShowTime(3, -2);
        ShowTime showTime4 = new ShowTime(3, 4);

        dabangg.setShowTimes(List.of(showTime1, showTime2));
        singham.setShowTimes(List.of(showTime3, showTime4));

        Hall hall1 = new Hall();
        hall1.setShowTimes(showTime1);
        hall1.setShowTimes(showTime4);

        Hall hall2 = new Hall();
        hall2.setShowTimes(showTime2);
        hall2.setShowTimes(showTime3);

        Cinema cinema = new Cinema();
        cinema.addHall(hall1);
        cinema.addHall(hall2);

        NotificationService service = new EmailNotification();

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the movie to be booked.");
            String movie = sc.nextLine();

            System.out.println("The available shows are");
            List<ShowTime> showTimes = dabangg.getShowTimes();
            for(ShowTime s1 : showTimes){
                if(s1.getStartTime() > 1)
                    System.out.println(s1.getStartTime());
            }

            System.out.println("please choose the Show Time");
            int show = sc.nextInt();

            ShowTime selected = null;
            for(ShowTime s1 : showTimes){
                if(s1.getStartTime() == show){
                    selected = s1;
                    break;
                }
            }

            System.out.println("The available seats for this showTime "+ selected.getStartTime() + " are ");
            List<Seat> availableSeats = selected.showAvailableSeats();
            for(Seat seat : availableSeats) System.out.print(seat.getSeatNo()+", ");
            System.out.println();
            List<Seat> seatToBooked = new ArrayList<>();
            System.out.println("Please select the seats from the above shown available seats.");
            String inp = sc.nextLine();

            String input[] = inp.split(" ");
            for(String s : input){
                for(Seat s1 : availableSeats){
                    if(Integer.parseInt(s) == s1.getSeatNo()){
                        seatToBooked.add(s1);
                        break;
                    }
                }
            }
            Booking booking = new Booking(selected, dabangg, seatToBooked);
            System.out.println("Please enter the name");
            String name = sc.nextLine();

            System.out.println("Please enter the phoneNo");
            String phoneNu = sc.nextLine();

            Customer person = new Customer(name, phoneNu);
            System.out.println("Do you wish to continue this booking please type : yes or no");
            String continueBooking = sc.nextLine();

            if(continueBooking.equalsIgnoreCase("yes")){
                person.createBooking(booking);
                service.notify(person);
            }

            System.out.println("Do you wish to book more type y/n.");
            String in = sc.nextLine();
            if(in.equalsIgnoreCase("y"))continue;
            else break;
        }

    }
}
