package com.zh.web.model.bean;

import java.util.Date;
import com.zh.core.base.model.IdataObject;

public class Flight implements IdataObject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_FLIGHT.ID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_FLIGHT.TECHNOLOGICALPROCESSID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Integer technologicalprocessid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_FLIGHT.FLIGHTNUMBER
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String flightnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_FLIGHT.STARTDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Date startdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_FLIGHT.ENDDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Date enddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_FLIGHT.PLACE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String place;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_FLIGHT.AIRPORTPEOPLEID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Integer airportpeopleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_FLIGHT.ID
     *
     * @return the value of T_FLIGHT.ID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_FLIGHT.ID
     *
     * @param id the value for T_FLIGHT.ID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_FLIGHT.TECHNOLOGICALPROCESSID
     *
     * @return the value of T_FLIGHT.TECHNOLOGICALPROCESSID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Integer getTechnologicalprocessid() {
        return technologicalprocessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_FLIGHT.TECHNOLOGICALPROCESSID
     *
     * @param technologicalprocessid the value for T_FLIGHT.TECHNOLOGICALPROCESSID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setTechnologicalprocessid(Integer technologicalprocessid) {
        this.technologicalprocessid = technologicalprocessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_FLIGHT.FLIGHTNUMBER
     *
     * @return the value of T_FLIGHT.FLIGHTNUMBER
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getFlightnumber() {
        return flightnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_FLIGHT.FLIGHTNUMBER
     *
     * @param flightnumber the value for T_FLIGHT.FLIGHTNUMBER
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_FLIGHT.STARTDATE
     *
     * @return the value of T_FLIGHT.STARTDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_FLIGHT.STARTDATE
     *
     * @param startdate the value for T_FLIGHT.STARTDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_FLIGHT.ENDDATE
     *
     * @return the value of T_FLIGHT.ENDDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_FLIGHT.ENDDATE
     *
     * @param enddate the value for T_FLIGHT.ENDDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_FLIGHT.PLACE
     *
     * @return the value of T_FLIGHT.PLACE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_FLIGHT.PLACE
     *
     * @param place the value for T_FLIGHT.PLACE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_FLIGHT.AIRPORTPEOPLEID
     *
     * @return the value of T_FLIGHT.AIRPORTPEOPLEID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Integer getAirportpeopleid() {
        return airportpeopleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_FLIGHT.AIRPORTPEOPLEID
     *
     * @param airportpeopleid the value for T_FLIGHT.AIRPORTPEOPLEID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setAirportpeopleid(Integer airportpeopleid) {
        this.airportpeopleid = airportpeopleid;
    }
}