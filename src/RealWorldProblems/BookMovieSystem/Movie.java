package RealWorldProblems.BookMovieSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {

    private int movieNo;
    private String name;
    private int duration;
    private Date releaseDate;
    private List<ShowTime> showTimes;

    public Movie(String name, int duration, Date releaseDate) {
        this.name = name;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.showTimes = new ArrayList<>();
    }

    public int getMovieNo() {
        return movieNo;
    }

    public void setMovieNo(int movieNo) {
        this.movieNo = movieNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<ShowTime> getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(List<ShowTime> showTimes) {
        this.showTimes = showTimes;
    }

}
