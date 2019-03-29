/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisterDonar;

import java.time.Year;
import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class Donar {
    
    private int donarID;
    private String name;
    private int year;
    private String address;
    private int zipCode;
    private String ssnNumber; //Unique Identification Number of a Donor;
    private boolean donate;
    private boolean died;
    private String gender;
    static int countID;
    private String contactNo;
    private String emgContantno;
    private ArrayList<Organ> organList;
    
    public boolean isDonate() {
        return donate;
    }

    public void setDonate(boolean donate) {
        this.donate = donate;
    }

    public boolean isDied() {
        return died;
    }

    public void setDied(boolean died) {
        this.died = died;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmgContantno() {
        return emgContantno;
    }

    public void setEmgContantno(String emgContantno) {
        this.emgContantno = emgContantno;
    }
    
    public Donar()
    {
        countID ++;
        donarID = countID;
        died = false;
        organList = new ArrayList<Organ>();
    }

    public int getDonarID() {
        return donarID;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public ArrayList<Organ> getOrganList() {
        return organList;
    }

    public void setOrganList(ArrayList<Organ> organList) {
        this.organList = organList;
    }
    @Override
    public String toString()
    {
        return String.valueOf(this.donarID);
    }
    
    public int getAge()
    {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        return age;
        
    }
    public Organ addorgan()
    {
        Organ o = new Organ();
        organList.add(o);
        return o;
    }
    
    
    
    
}
