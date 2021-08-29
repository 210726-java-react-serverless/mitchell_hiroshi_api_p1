package com.revature.p1.datasource.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Batch {

    @BsonProperty("id")
    private String id;
    private String shortName;
    private String name;
    private String status;
    private String description;
    private LocalDate registrationStart;
    private LocalDate registrationEnd;
    private List<String> usersRegistered = new ArrayList<>();

    public Batch() {
        super();
    }

    public Batch(String shortName, String name, String status, String description, LocalDate registrationStart, LocalDate registrationEnd) {
        this.shortName = shortName;
        this.name = name;
        this.status = status;
        this.description = description;
        this.registrationStart = registrationStart;
        this.registrationEnd = registrationEnd;

    }

    public Batch(String id, String shortName, String name, String status, String description, LocalDate registrationStart, LocalDate registrationEnd, List<String> usersRegistered) {
        this.id = id;
        this.shortName = shortName;
        this.name = name;
        this.status = status;
        this.description = description;
        this.registrationStart = registrationStart;
        this.registrationEnd = registrationEnd;
        this.usersRegistered = usersRegistered;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getRegistrationStart() {
        return registrationStart;
    }

    public void setRegistrationStart(LocalDate registrationStart) {
        this.registrationStart = registrationStart;
    }

    public LocalDate getRegistrationEnd() {
        return registrationEnd;
    }

    public void setRegistrationEnd(LocalDate registrationEnd) {
        this.registrationEnd = registrationEnd;
    }

    public List<String> getUsersRegistered() {
        return usersRegistered;
    }

    public void setUsersRegistered(List<String> usersRegistered) {
        this.usersRegistered = usersRegistered;
    }

    public void addUsersRegistered(String toAdd) {
        if (!this.usersRegistered.contains(toAdd))
        this.usersRegistered.add(toAdd);
    }

    public void removeBatchRegistrations(String toRemove) {
        this.usersRegistered.remove(toRemove);
    }

    @Override
    public String toString() {
        return "Batch{" +
                "id='" + id + '\'' +
                ", shortName='" + shortName + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", registrationStart=" + registrationStart +
                ", registrationEnd=" + registrationEnd +
                ", usersRegistered=" + usersRegistered +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batch batch = (Batch) o;
        return Objects.equals(id, batch.id) && Objects.equals(shortName, batch.shortName) && Objects.equals(name, batch.name) && Objects.equals(status, batch.status) && Objects.equals(description, batch.description) && Objects.equals(registrationStart, batch.registrationStart) && Objects.equals(registrationEnd, batch.registrationEnd) && Objects.equals(usersRegistered, batch.usersRegistered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName, name, status, description, registrationStart, registrationEnd, usersRegistered);
    }
}
