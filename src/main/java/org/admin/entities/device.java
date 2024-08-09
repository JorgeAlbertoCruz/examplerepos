package org.admin.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "device")
public class device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deviceid")
    private Integer deviceid;

    @Column(name = "devicename", nullable = false)
    private String devicename;

    @Column(name = "operatingsystem", nullable = false)
    private String operatingsystem;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "dateofentry", nullable = false)
    private Date dateofentry;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "areaid", nullable = false)
    private area area;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    private Set<deviceassignment> deviceassignments;

    public int getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(int deviceid) {
        this.deviceid = deviceid;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getOperatingsystem() {
        return operatingsystem;
    }

    public void setOperatingsystem(String operatingsystem) {
        this.operatingsystem = operatingsystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getDateofentry() {
        return dateofentry;
    }

    public void setDateofentry(Date dateofentry) {
        this.dateofentry = dateofentry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public area getArea() {
        return area;
    }

    public void setArea(area area) {
        this.area = area;
    }

    public Set<deviceassignment> getDeviceassignments() {
        return deviceassignments;
    }

    public void setDeviceassignments(Set<deviceassignment> deviceassignments) {
        this.deviceassignments = deviceassignments;
    }
}
