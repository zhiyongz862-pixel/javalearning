package HW;

public class Employee {
    private String id;
    private  String name;
    private  String jobTitle;

    public Employee() {
    }

    public Employee(String id, String name, String jobTitle) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 设置
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", jobTitle = " + jobTitle + "}";
    }
}
