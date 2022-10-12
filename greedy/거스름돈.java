package greedy;

import java.util.*;

/***
* 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
* [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
* 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
* 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
* 표시하고 10원미만은 절삭
      ******************************************************
         요청금액 : 126520 원
         50000 : 2매
         10000 : 2매
         5000 : 1매
         1000 : 1매
         500 : 1개
         100 : 0개
         50 : 0개
         10 : 2개
      ********************************************************
 */
class 거스름돈 {
    public static void main(String[] args) {
        거스름돈 solution = new 거스름돈();
        Scanner scanner = new Scanner(System.in);
        System.out.println("요청금액 : ");
        int money = scanner.nextInt();
        System.out.println(solution.solution(money));
    }
    String solution(int money){
        return String.format(
        "******************************************************"
        +"\n요청금액 : %d 원"
        +"\n********************************************************", money);
    }
}
