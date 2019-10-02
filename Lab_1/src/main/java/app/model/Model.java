package app.model;
import app.entities.*;
import java.util.*;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private ArrayList<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public void remove(String name) {
        Object obj = null;
        for (User mp: model) {
            if (Objects.equals(mp.getName(), name))
            {
                obj = mp;
            }
        }
        model.remove(obj);
    }

    public void rename(String name, String new_name) {
        for (User mp: model) {
            if (Objects.equals(mp.getName(), name))
            {
                mp.rename(new_name);
            }
        }
    }

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
