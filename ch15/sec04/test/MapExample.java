package ch15.sec04.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수 받은 아이디 저장 변수
        int maxScore = 0; //최고 점수 저장변수
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> entry:entrySet){
            if(entry.getValue()>maxScore){
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore  += entry.getValue();
        }

        int avgScore = maxScore/map.size();
        System.out.println("평균 점수 : "+avgScore);

        System.out.println("최고 점수 : "+maxScore);
        System.out.println("최고 점수를 받은 아이디 : "+name);




    }
}
