package th.mfu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ch.qos.logback.core.util.Duration;

@Entity
public class Time {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) 
    private Long timeId;
    private Long durationInSeconds;

    //constructors 
    public Time() {
    }
    public Time(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
    
    //getter and setter 
    public Long getTimeId() {
        return timeId;
    }
    public void setTimeId(Long timeId) {
        this.timeId = timeId;
    }
    public Long getDurationInSeconds() {
        return durationInSeconds;
    }
    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
   
}