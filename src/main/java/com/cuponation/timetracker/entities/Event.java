package com.cuponation.timetracker.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.StringJoiner;

/**
 * Created by margareta on 7/10/17.
 */
@Entity
@Table(name = "Events", schema = "dbo", catalog = "Evidencija")
public class Event {

    @Id
    @Column(name = "EventID", nullable = false)
    private Integer eventId;
//    @Basic
//    @Column(name = "ControllerID", nullable = false)
//    private Integer controllerId;
//    @Basic
//    @Column(name = "Date", nullable = false)
//    private Date date;
//    @Basic
//    @Column(name = "Time", nullable = false)
//    @Temporal(value = TemporalType.TIME)
//    private Date time;
    @Basic
    @Column(name = "UsedButton", nullable = false)
    private Integer usedButton;
    @Basic
    @Column(name = "EventTypeID", nullable = false)
    private Integer eventTypeId;
//    @Basic
//    @Column(name = "CardID", nullable = false)
//    private Integer cardId;
//    @Basic
//    @Column(name = "CardNumber", nullable = false, length = 50)
//    private String cardNumber;
    @Basic
    @Column(name = "EmployeeID", nullable = false)
    private Integer employeeId;
    @Basic
    @Column(name = "EmployeeName", nullable = false, length = 200)
    private String employeeName;
//    @Basic
//    @Column(name = "PersonalNumber", nullable = false, length = 50)
//    private String personalNumber;
//    @Basic
//    @Column(name = "RealDate", nullable = true)
//    @Temporal(value = TemporalType.DATE)
//    private Date realDate;
//    @Basic
//    @Column(name = "RealTime", nullable = true)
//    @Temporal(value = TemporalType.TIME)
//    private Date realTime;
    @Basic
    @Column(name = "SysDateTime", nullable = false)
//    @Temporal(value = TemporalType.TIMESTAMP)
    private String sysDateTime;
//    @Basic
//    @Column(name = "Picture", nullable = true)
//    private byte[] picture;
//    @Basic
//    @Column(name = "ManualEntryUserID", nullable = true)
//    private Integer manualEntryUserId;
//    @Basic
//    @Column(name = "RealEventTypeID", nullable = true)
//    private Integer realEventTypeId;
//    @Basic
//    @Column(name = "Deleted", nullable = true)
//    private Boolean deleted;
//    @Basic
//    @Column(name = "ModifiedByUserID", nullable = true)
//    private Integer modifiedByUserId;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

//    public Integer getControllerId() {
//        return controllerId;
//    }
//
//    public void setControllerId(Integer controllerId) {
//        this.controllerId = controllerId;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Date getTime() {
//        return time;
//    }
//
//    public void setTime(Date time) {
//        this.time = time;
//    }
//
    public Integer getUsedButton() {
        return usedButton;
    }

    public void setUsedButton(Integer usedButton) {
        this.usedButton = usedButton;
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }
//
//    public Integer getCardId() {
//        return cardId;
//    }
//
//    public void setCardId(Integer cardId) {
//        this.cardId = cardId;
//    }
//
//    public String getCardNumber() {
//        return cardNumber;
//    }
//
//    public void setCardNumber(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

//    public String getPersonalNumber() {
//        return personalNumber;
//    }
//
//    public void setPersonalNumber(String personalNumber) {
//        this.personalNumber = personalNumber;
//    }
//
//    public Date getRealDate() {
//        return realDate;
//    }
//
//    public void setRealDate(Date realDate) {
//        this.realDate = realDate;
//    }
//
//    public Date getRealTime() {
//        return realTime;
//    }
//
//    public void setRealTime(Date realTime) {
//        this.realTime = realTime;
//    }
//
    public String getSysDateTime() {
        return sysDateTime;
    }

    public void setSysDateTime(String sysDateTime) {
        this.sysDateTime = sysDateTime;
    }
//
//    public byte[] getPicture() {
//        return picture;
//    }
//
//    public void setPicture(byte[] picture) {
//        this.picture = picture;
//    }
//
//    public Integer getManualEntryUserId() {
//        return manualEntryUserId;
//    }
//
//    public void setManualEntryUserId(Integer manualEntryUserId) {
//        this.manualEntryUserId = manualEntryUserId;
//    }
//
//    public Integer getRealEventTypeId() {
//        return realEventTypeId;
//    }
//
//    public void setRealEventTypeId(Integer realEventTypeId) {
//        this.realEventTypeId = realEventTypeId;
//    }
//
//    public Boolean getDeleted() {
//        return deleted;
//    }
//
//    public void setDeleted(Boolean deleted) {
//        this.deleted = deleted;
//    }
//
//    public Integer getModifiedByUserId() {
//        return modifiedByUserId;
//    }
//
//    public void setModifiedByUserId(Integer modifiedByUserId) {
//        this.modifiedByUserId = modifiedByUserId;
//    }
}
