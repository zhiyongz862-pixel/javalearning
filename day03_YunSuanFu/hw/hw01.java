package hw;

public class hw01 {
    public static void main(String[] args) {
        double father = 177.0, mother = 165.0;
        double son = (father + mother) * 1.08 / 2;
        double daughter = (father * 0.923 + mother) / 2;
        System.out.println("儿子身高为" + son + "厘米");
        System.out.println("女儿身高为" + daughter + "厘米");


    }
}
