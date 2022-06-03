package org.example.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    Properties prop;

    public ReadConfig() {
       File src=new File("./Configurations/config.properties");
        try
        {
            FileInputStream fis=new FileInputStream(src);
            prop= new Properties();
            prop.load(fis);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public String getApplicationURL()
    {
        return prop.getProperty("baseURL");
    }
    public String getUsername()
    {
        return prop.getProperty("username");
    }
    public String getPassword()
    {
        return prop.getProperty("password");
    }

}
