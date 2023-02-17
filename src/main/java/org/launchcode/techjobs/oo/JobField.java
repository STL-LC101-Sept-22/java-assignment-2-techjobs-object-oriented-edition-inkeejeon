package org.launchcode.techjobs.oo;
import java.util.Objects;

public abstract class JobField {  //abtract to prevent creation of JobField
    //Fields
    private int id;
    private static int nextId = 1;
    private String value;

    //Constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;
    }
    //CUstom Methods
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return getId() == that.getId();
    }
    @Override
        public int hashCode() {
            return Objects.hash(getId());
        }

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }
