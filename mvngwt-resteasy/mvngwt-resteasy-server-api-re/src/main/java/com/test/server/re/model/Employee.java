package com.test.server.re.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class Employee {
    
    private String employeeId;
    private String employeeName;
    private String job;
    
    @XmlElement
    public String getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    @XmlElement
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    @XmlElement
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public String toString()
    {
    	return new StringBuilder().append("id").append(":").append(employeeId).append(";name:").append(employeeName).toString();
    }
    
}
