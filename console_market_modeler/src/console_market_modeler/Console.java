package console_market_modeler;

public class Console {
    private Integer users;
    private String name;

    Console(String name, Integer users) {
        this.name = name;
        this.users = users;
    }

    String getName() {
        return this.name;
    }

    public Integer getUsers() {
        return this.users;
    }

    void setUsers(Integer users) {
        this.users = users;
    }
}
