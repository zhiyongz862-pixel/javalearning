package Demo;

import java.util.Scanner;

public class SwitchStructure {
    public static void main(String[] args) {
    /*
    switch (表达式) {
	case 1:
		语句体1;
		break;
	case 2:
		语句体2;
		break;
	...
	default:
		语句体n+1;
		break;
}
     */
        //定义想吃的面条
        Scanner sc = new Scanner(System.in);
        String noodles = "兰州拉面";
        // switch当中case不能重复，并且case后面的不能是变量
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面 ":
                System.out.println("吃兰州拉面");
                break;
            case "海鲜龙虾面":
                System.out.println("吃兰州拉面");
                break;
            case "陕西油泼面":
                System.out.println("吃兰州拉面");
                break;
            default:
                System.out.println("吃方便面");
                break;

        }
    }
}
