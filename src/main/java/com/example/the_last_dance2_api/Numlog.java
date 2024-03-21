package com.example.the_last_dance2_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;

@Entity
public class Numlog extends numberRequest {

        private String Operation;
        private int Result;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Use an appropriate strategy
        private Integer id; // Assuming a Long identifier


    public Numlog(String Operation, int Result, numberRequest NumbeRequest, Integer id) {
        this.Operation = Operation;
        this.Result = Result;
        this.id = id;
    }

    public Numlog() {

    }
/*
    public Numlog(String Operation, int Result, numberRequest numberRequest, SingularAttribute<AbstractPersistable, Serializable> id) {
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public int getRisultato() {
        return Result;
    }

    public void setRisultato(int risultato) {
        Result = risultato;
    }

    @Override
    public String toString() {
        return "Numlog{" +
                "id=" + id +
                ", Operation='" + Operation + '\'' +
                ", Risultato=" + Result +
                '}';
    }
}