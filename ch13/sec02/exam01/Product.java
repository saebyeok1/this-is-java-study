package ch13.sec02.exam01;

//제네릭 타입
public class Product<K, M> {
    //피륻
    private K kind;
    private M model;

    //메소드
    public K getKind() {
        return this.kind;}
    public M getModel(){
        return this.model;}

    public void setKind(K kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
