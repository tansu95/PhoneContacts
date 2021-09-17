import java.util.Objects;

public class Contact implements Comparable<Contact> {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return number == contact.number && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }


    @Override
    public int compareTo(Contact o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Телефон: " + number;
    }
}