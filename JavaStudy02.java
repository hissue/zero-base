// 미니과제02_백엔드 스쿨_지수현

import java.util.Scanner;

public class MiniStudy02 {
public static int solution(int amount){
    int result;

    if(amount/10 >= 300){
        result = 300;
    }else{
        result = (amount/1000)*100;
    }
return result;

}
public static void main(String[] args){
    System.out.println("[캐시백 계산]");
    System.out.print("결제 금액을 입력해 주세요.(금액) :");

    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();


    System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",amount,solution(amount));
    }
}
