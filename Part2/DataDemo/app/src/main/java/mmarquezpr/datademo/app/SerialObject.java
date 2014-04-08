package mmarquezpr.datademo.app;

import java.io.Serializable;

/**
 * Created by enrique on 4/8/14.
 */
public class SerialObject implements Serializable {

    public String container;

    public SerialObject(String str){
        container = str;
    }
}
