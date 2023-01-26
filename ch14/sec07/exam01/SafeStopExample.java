package ch14.sec07.exam01;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        printThread.setStop(true); //PrintThread를 종료하기 위해 stop 필드값 변경
    }
}
