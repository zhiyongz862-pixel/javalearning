package Demo;
// 范型类 当一个类中，某个变量的数据类型不确定
// 不同范型用逗号间隔
public class FanxingClass <E,Q> {

    Object [] obj = new Object[10];

    int size;
    // E代表我们使用的类型
    public boolean add(E e){
        obj[size++] = e;
        return true;
    }
    public E get(int index){
        E e = (E) obj[index];
        return e;
    }
    // 泛型方法 写在修饰符的后面 这个是在 方法被调用的时候决定的 show(String x) show(int x) 这样
    public <T> void show(T t){

    }
    public static <T> void show_static(T t)
    {

    }
}
