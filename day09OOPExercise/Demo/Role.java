package Demo;

import java.util.Random;

public class Role {
    private  String name;
    private  int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }

    public void attack(Role r){
        Random r1 = new Random();
        int hurt = r1.nextInt(20) + 1;
        System.out.println(this.getName() + "攻击了" + r.getName() + "造成了" + hurt + "点伤害");
        // 这里我的逻辑错了 因为可能达成0了 血量
        int remainBlood = (r.getBlood() - hurt) >=0 ? (r.getBlood() - hurt):0;
        r.setBlood(remainBlood);
    }


}
