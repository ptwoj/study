package Day8.service;


import java.util.ArrayList;
import java.util.List;

//single ton
public class Service {

    private final List<Integer> list = new ArrayList<>();


    public  void insert(int number){
        list.add(number);//모드 1에서 넘버로 들어온다? 왜?
        System.out.println(list);
    }

    private static Service instance; // 1
    public static Service getInstance(){ // 2
        if (instance == null) instance = new Service(); // 3
        return instance; // 4
    }
}
