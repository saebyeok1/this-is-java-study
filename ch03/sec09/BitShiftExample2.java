package ch03.sec09;

public class BitShiftExample2 {
    public static void main(String[] args) {
        int value = 772; //[0000000] [0000000] [0000011] [0000100]

        //우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [0000000]
        byte byte1 = (byte) (value >>>24 );
        int int1 = byte1 & 255; //논리곱 연산 수행
        System.out.println("첫 번째 바이트 부호 없는 값: "+ int1);

        //우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [0000000]
        byte byte2 = (byte) (value>>>16);
        int int2 = Byte.toUnsignedInt(byte2); //자바 API 이용
        System.out.println("두 번쨰 바이트 부호 없는 값: "+ int2);

        //우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [0000011]
        byte byte3 = (byte) (value >>>8 );
        int int3 = byte3 & 255; //논리곱 연산 수행
        System.out.println("세 번째 바이트 부호 없는 값: "+ int3);

        //끝 1바이트만 읽음: [0000100]
        byte byte4 = (byte) (value);
        int int4 = Byte.toUnsignedInt(byte4); //자바 API 이용
        System.out.println("네 번쨰 바이트 부호 없는 값: "+ int4);


    }
}
