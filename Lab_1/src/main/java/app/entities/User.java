package app.entities;

public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rename(String new_name) {
        this.name = new_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' + '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result;
        return result;
    }
}