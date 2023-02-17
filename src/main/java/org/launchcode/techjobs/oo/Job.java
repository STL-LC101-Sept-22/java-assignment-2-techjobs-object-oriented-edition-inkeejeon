package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
    this.id = nextId;
    nextId++;
}

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
  //  In the Job class, create a toString method that passes the first test. Since the test only checks if the returned string starts and ends with a blank line, make that happen.
//    ID:  _______
//    Name: _______
//    Employer: _______
//    Location: _______
//    Position Type: _______
//    Core Competency: _______
@Override
public String toString() {

//null and empty checks
    if(getName() == "") {
        setName("Data not available");
    }
    if(getEmployer().getValue() == "") {
        employer.setValue("Data not available");
    }
    if(getLocation().getValue() == "") {
        location.setValue("Data not available");
    }
    if(getPositionType().getValue() == "") {
        positionType.setValue("Data not available");
    }
    if(getCoreCompetency().getValue() == "") {
        coreCompetency.setValue("Data not available");
    }

    if (this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null) {
        return "OOPS! This job does not seem to exist.";
    }

    return "\n" +
            "ID: " + id +
            "\nName: " + name +
            "\nEmployer: " + employer.getValue() +//getValue make the value to strings on employer object.
            "\nLocation: " + location.getValue() +
            "\nPosition Type: " + positionType.getValue() +
            "\nCore Competency: " + coreCompetency.getValue() +
            "\n";

}


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
