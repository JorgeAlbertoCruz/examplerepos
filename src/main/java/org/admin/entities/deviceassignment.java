package org.admin.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "deviceassignment")
public class  deviceassignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignmentid")
    private Integer assignmentid;

    @Column(name = "assignentdate", nullable = false)
    private Date assignmentdate;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private user user;

    @ManyToOne
    @JoinColumn(name = "deviceid", nullable = false)
    private device device;

    public int getAssignmentid() {
        return assignmentid;
    }

    public void setAssignmentid(int assignmentid) {
        this.assignmentid = assignmentid;
    }

    public Date getAssignmentdate() {
        return assignmentdate;
    }

    public void setAssignmentdate(Date assignmentdate) {
        this.assignmentdate = assignmentdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public org.admin.entities.user getUser() {
        return user;
    }

    public void setUser(org.admin.entities.user user) {
        this.user = user;
    }

    public org.admin.entities.device getDevice() {
        return device;
    }

    public void setDevice(org.admin.entities.device device) {
        this.device = device;
    }
}


