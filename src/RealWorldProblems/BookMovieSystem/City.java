package RealWorldProblems.BookMovieSystem;

import java.util.List;

public class City {

    private String name;
    private String address;
    private List<Cinema> cinemas;

    public City(String name, String address, List<Cinema> cinemas) {
        this.name = name;
        this.address = address;
        this.cinemas = cinemas;
    }

    public void addCinema(Cinema c){
        this.cinemas.add(c);
    }

}
