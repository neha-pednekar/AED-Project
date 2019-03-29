/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Hospital.Patient;
import Business.RegisterDonar.Donar;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author BHAVIK
 */
public abstract class WorkRequest {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
   // private Organ organ;
    private String organName;
    private int availability;
    private String type;
    private Patient patient;
    private int quantity;
    private String organizationName;
    
    
    
    private String hospitalName;
    private Donar donar;
    private int age;
    
    private String labName;
    private String labStatus;
    private String organbankName;
    private String obStatus;

    public String getObStatus() {
        return obStatus;
    }

    public void setObStatus(String obStatus) {
        this.obStatus = obStatus;
    }

    public String getOrganbankName() {
        return organbankName;
    }

    public void setOrganbankName(String organbankName) {
        this.organbankName = organbankName;
    }
            

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = labStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Donar getDonar() {
        return donar;
    }

    public void setDonar(Donar donar) {
        this.donar = donar;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
    
    public WorkRequest(){
        requestDate = new Date();
//        organ = new Organ();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

//    public Organ getOrgan() {
//        return organ;
//    }
//
//    public void setOrgan(Organ organ) {
//        this.organ = organ;
//    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    
    
  
    @Override
    public String toString()
    {
        return this.message;
    }
}
