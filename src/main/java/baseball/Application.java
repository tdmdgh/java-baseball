package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static boolean isString_in_1to9(String str){
        return str.matches("[1-9.]+");
    }
    public static boolean isValidInput(String input){
        //정규 표현식을 이용해 Input이 숫자가 아닌 모든 경우와 Input의 범위가 1~9사이가 아닌 경우를 동시에 처리
        if(!isString_in_1to9(input)) return false;
        return true;
    }
    public static List<Integer> createTargetNums(){
        List<Integer> targetNums = new ArrayList<>();
        while(targetNums.size() < 3){
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!targetNums.contains(randomNumber)) {
                targetNums.add(randomNumber);
            }
        }

        return targetNums;
    }
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String input="";
        try {
            if(!isValidInput(input))
                throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            //어플리케이션 종료
        }
    }
}
