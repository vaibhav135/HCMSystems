package HCM;

public class Department extends CommonInfo {
    private String name;
    private String id;

    Department(String name, String departmentId) {
        this.name = name;
        this.id = departmentId;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }
}
