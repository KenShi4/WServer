/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author informatica
 */
@XmlRootElement
public class Config {

            
    private String path;
    
    private String auth;

    public String getAuth() {
        return auth;
    }

    public String getPath() {
        return path;
    }

    
    public void setPath(String path) {
        this.path = path;
    }

    
    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "Config{" + "path=" + path + ", auth=" + auth + '}';
    }
    
}
