package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;

import java.io.*;
import java.util.Properties;

public class SessionService {

    private static final Properties properties = new Properties();

    public static void create(String id, String name){
        properties.put("id", id);
        properties.put("name",name);
        try {
            properties.store(new FileOutputStream("src/main/resources/session.properties"), "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static User current() {
        try {
            properties.load(new FileInputStream("src/main/resources/session.properties"));
            return new User(properties.getProperty("id"), properties.getProperty("name"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void destroy() {
        properties.put("id", "");
        properties.put("name","");
        try {
            properties.store(new FileOutputStream("src/main/resources/session.properties"), "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
