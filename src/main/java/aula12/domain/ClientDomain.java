package aula12.domain;

import java.util.Objects;

public class ClientDomain implements GenericDomain<String> {

    private String id;
    private String name;
    private String occupation;

    public ClientDomain() {
    }

    public ClientDomain(String id, String name, String occupation) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        ClientDomain that = (ClientDomain) object;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects
                .equals(occupation, that.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, occupation);
    }

    @Override
    public String toString() {
        return "ClientDomain{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
