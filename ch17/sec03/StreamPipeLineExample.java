package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동",10),
                new Student("홍길동",20),
                new Student("홍길동",30)
        );
        /*
        //방법1
        Stream<Student> studentStream = list.stream();
        //중간처리(학생객체를점수로매핑)
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        //최종처리(평균점수)
        double avg = scoreStream.average().getAsDouble();
        */

        //방법2
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("평균점수:" + avg);
    }
}
