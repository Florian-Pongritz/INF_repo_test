public class Person {
    private String name;
    private String firstname;
    public Integer age;

    public Person(String ln, String fn) {
        name = ln;
        firstname = fn;
    }

    public Person() {
    }

    public void setname(String fn, String ln) {
        name = ln;
        firstname = fn;
    }

    public String fullname() {
        String fullname = firstname + " " + name;
        return fullname;
    }

    public String getln() {
        return name;
    }

    public String getfn() {
        return firstname;
    }
}
