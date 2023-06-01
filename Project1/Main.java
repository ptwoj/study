package Project1;


import Project1.vo.Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();


   Movie movie1 = new Movie("ㅏ아바타", "SF");
   movie1.setName("나 이거 바꿀거야");
   movieList.add(movie1);
        
   Movie movie2 = new Movie("타이타닉", "로맨스");
   movieList.add(movie2);//이거 넣은거

   for (Movie movie : movieList) {
       System.out.println("영화 이름: " + movie.getName());
       System.out.println("장르: " + movie.getGenre());
       System.out.println();
         }
    }
}
