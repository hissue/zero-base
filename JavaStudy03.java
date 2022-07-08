// 미니과제03_백엔드 스쿨_지수현
import java.util.Scanner;

public class MiniStudy03 {
    public static int solution(int age, int time, char national, char card){
        int result =0;

        if(age >= 3){
            if(age < 13 || time >= 17){result = 4000;}
            else{
                if(national == 'y' || card =='y'){result = 8000;}
                else{result = 10000;}}
        }else{result = 0;}

        return result;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String national = sc.next();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = sc.next();

        System.out.printf("입장료: %d",solution(age,time, national.charAt(0), card.charAt(0)));

    }
}
