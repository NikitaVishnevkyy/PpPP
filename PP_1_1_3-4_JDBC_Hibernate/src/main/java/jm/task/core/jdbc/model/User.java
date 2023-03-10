package jm.task.core.jdbc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table
public class User {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Byte age;
    @Override
    public User() {

    }
    @Override
    public User(String name, String lastName, Byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public Long getId() {

        return id;
    }
    @Override
    public void setId(Long id) {

        this.id = id;
    }
    @Override
    public String getName() {

        return name;
    }
    @Override
    public void setName(String name) {

        this.name = name;
    }
    @Override
    public String getLastName() {

        return lastName;
    }
    @Override
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }


    @Override
    public Byte getAge() {

        return age;
    }
    @Override
    public void setAge(Byte age) {

        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("User {id = '%s', name = '%s', lastName = '%s', age = '%d'}", getId(), getName(), getLastName(), getAge());
    }
}
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    if (!Objects.equals(id, user.id)) return false;
    if (!Objects.equals(name, user.name)) return false;
    if (!Objects.equals(lastName, user.lastName)) return false;
    return Objects.equals(age, user.age);
}

@Override
public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (age != null ? age.hashCode() : 0);
    return result;
}
