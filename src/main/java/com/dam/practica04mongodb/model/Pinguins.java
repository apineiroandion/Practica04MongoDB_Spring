package com.dam.practica04mongodb.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "pinguins")
public class Pinguins {

    private List<Pinguin> pinguins;

    @XmlElement(name = "pinguin")
    public List<Pinguin> getPinguins() {
        return pinguins;
    }

    public void setPinguins(List<Pinguin> pinguins) {
        this.pinguins = pinguins;
    }
}
