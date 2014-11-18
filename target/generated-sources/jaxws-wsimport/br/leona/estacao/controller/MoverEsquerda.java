
package br.leona.estacao.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MoverEsquerda complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MoverEsquerda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="graus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoverEsquerda", propOrder = {
    "graus"
})
public class MoverEsquerda {

    protected String graus;

    /**
     * Obtém o valor da propriedade graus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraus() {
        return graus;
    }

    /**
     * Define o valor da propriedade graus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraus(String value) {
        this.graus = value;
    }

}
