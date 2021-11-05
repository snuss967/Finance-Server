package java.me.snuss.website.domain;

import javax.persistence.*;
import java.util.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany
    private Set<Executive> executives;

    public Company() {
    }

    public Company(String name, Set<Executive> executives) {
        this.name = name;
        this.executives = executives;
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

    public Set<Executive> getExecutives() {
        return executives;
    }

    public void setExecutives(Set<Executive> executives) {
        this.executives = executives;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", executives=" + executives +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
