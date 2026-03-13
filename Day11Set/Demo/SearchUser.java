package Demo;

import java.util.ArrayList;

public class SearchUser {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User(1, "ZhangSan", "123");
        User u2 = new User(2, "LiSi", "123");
        User u3 = new User(3, "WangWu", "123");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println(checkUser(list,4));

    }

    public static boolean checkUser(ArrayList<User> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) return true;
        }
        return false;

    }
}
