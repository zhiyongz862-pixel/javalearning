package Demo;

// JDK12之后，switch-case的匹配可以一直改变
// 在这种情况下 -> {}中的{}可以替代break
public class SwitchJDK12 {
    public static void main(String[] args) {
        int number =10;
        switch (number){
            case 1 -> {
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }
    }
}
