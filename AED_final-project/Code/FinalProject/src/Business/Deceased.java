/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.RegisterDonar.Donar;
import java.util.Date;

/**
 *
 * @author Chintan
 */
public class Deceased {
    
    private int deceasedID;
    private Donar donar;
    private Date datetime;
    private boolean processed;
    private String hospitalName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getOrganBankName() {
        return organBankName;
    }

    public void setOrganBankName(String organBankName) {
        this.organBankName = organBankName;
    }
    private String organBankName;
     static int count;
     
     public Deceased()
     {
         count++;
         deceasedID = count;
         datetime = new Date();
         processed = false;
     }

    public int getDeceasedID() {
        return deceasedID;
    }

   

    public Donar getDonar() {
        return donar;
    }

    public void setDonar(Donar donar) {
        this.donar = donar;
    }

    public Date getDatetime() {
        return datetime;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.donar);
    }
  
    
}
