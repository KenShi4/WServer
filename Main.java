/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.itismeucci;

import it.itismeucci.pojo.App;
import it.itismeucci.parser.AppConfigParser;
import java.net.URISyntaxException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author informatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            AppConfigParser configParser = new AppConfigParser();
            App config = configParser.parse("it/itismeucci/app.xml");
            System.out.println(config);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
    
}
