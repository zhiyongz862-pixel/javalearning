package Demo;

public class GameTest {
    public static void main(String[] args) {
        // 一定要new
        // 这个可以接收参数，但是这个不换行
        System.out.printf("%s 是第一个参数，%s是第二个参数","aa","bb");
        Role r1 = new Role("user1",100);
        Role r2 = new Role("user2",100);
        while (true){
            r1.attack(r2);
            if (r2.getBlood() <= 0){
                System.out.println(r1.getName() + "已经获胜" );
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() <= 0){
                System.out.println(r2.getName() + "已经获胜" );
                break;

            }
        }
    }
}
