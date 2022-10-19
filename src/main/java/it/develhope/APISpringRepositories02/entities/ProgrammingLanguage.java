package it.develhope.APISpringRepositories02.entities;

import javax.persistence.*;
import java.time.Year;

@Entity
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Year firstAppearance;

    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Year firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
