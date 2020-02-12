/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author mahdi
 */
public class Offre {
    private int idOffre;
    private Date dateDeb,dateFin;
    private String code;

    public Offre() {
    }

    public Offre(int idOffre, Date dateDeb, Date dateFin, String code) {
        this.idOffre = idOffre;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.code = code;
    }

    public int getIdOffre() {
        return idOffre;
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getCode() {
        return code;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Offre{" + "idOffre=" + idOffre + ", dateDeb=" + dateDeb + ", dateFin=" + dateFin + ", code=" + code + '}';
    }
    
    
}
