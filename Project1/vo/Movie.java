package Project1.vo;

public class Movie {
    private String name;
    // 네임을 쓸거고
    private String genre;
    // 장르를 쓸거다

    public Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
//    이제 여가서 무비 개체 안에 네임 그리고 장르를 쓰기 위해서 이렇게 쓴다.
    }

    public String getName() {
        return name;
        //영화 이름을 보여줘야되서 리턴으로 받는다.
    }
    public  String getGenre() {
        return genre;
        // 여기까지가 이름과 장르르 보여주기 위한 코드
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




    }
