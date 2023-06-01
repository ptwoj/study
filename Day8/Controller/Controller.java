package Day8.Controller;

import Day8.service.Service;

import java.util.Scanner;

public class Controller {
    private final Scanner sc;//1

    private Service service; //9 바꿀일이 없으니까 파이널 설정?

    public Controller(Scanner sc) {
        this.sc = sc;
        service = Service.getInstance();
    }

    public void selectMode() {//2
        int mode = 0;

        mode = sc.nextInt();

        if (mode == 1) {
            // TODO : insert 기능 만들 것
            service.insert(sc.nextInt());//9, 하나를 더 받는다.서비스가 다른 클래스로 간다.
        }else if (mode == 2) {
            // TODO : 전체 찾기 기능 만들 것
        }else if(mode == 3) {
            // TODO : 인덱스를 입력 받아
        }else{
            // TODO : selctMode 다시 실행
            //next 라인을 받던 인트를 받는 것은 취향 차이
            // 그 다음 int mode = 를 한거
        }
    }
}
