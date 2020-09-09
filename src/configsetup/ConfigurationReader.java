package configsetup;

import java.io.*;
import java.util.Scanner;

public abstract class ConfigurationReader {

    protected String config_file;
    protected FileReader file_reader;
    protected BufferedReader buffer_reader;

    public ConfigurationReader(String file_name){
        this.config_file = file_name;
    }

    public abstract void execute();
}

