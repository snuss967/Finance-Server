package java.me.snuss.website.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Executive {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "executive_companies", joinColumns = @JoinColumn(name = "executive_id"), inverseJoinColumns = @JoinColumn(name = "company_id")
    private Set<Company> companies;

    public Executive() {
    }

    public Executive(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Executive executive = (Executive) o;
        return Objects.equals(id, executive.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
