/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import pojo.App;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author informatica
 */
public class AppConfigParser {

    /**
     * Effettua il parse di un xml nella classe Config
     * @param filename
     * @return
     * @throws URISyntaxException in caso di file non trovato
     * @throws JAXBException  in caso di xml non well formed
     */
    public App parse(String filename) throws URISyntaxException, JAXBException {
        //cerca il file nel classpath
        URL resource = getClass().getClassLoader().getResource(filename);
        File file = new File(resource.toURI());
        //istanzia il parser
        JAXBContext jaxbContext = JAXBContext.newInstance(App.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        //effettua il parse del contenuto del file all'interno di una istanza della classe
        App app = (App) jaxbUnmarshaller.unmarshal(file);
        return app;
    }

}
