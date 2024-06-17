package com.FanCode.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {

    public Properties prop;
    public static String baseURI;

    public base() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("./src/main/resources/prod_config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        baseURI = prop.getProperty("URI");
    }
}
