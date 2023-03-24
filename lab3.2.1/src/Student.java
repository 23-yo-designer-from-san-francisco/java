import java.util.Date;

public class Student {

    public int id;
    public String lastName;
    public String firstName;
    public String patronymic;
    public Date birthday;
    public String address;
    public int phone;
    public String faculty;
    public int course;
    public String group;

    public Student() {
    }

    public Student(int id, String lastName, String firstName, String patronymic, Date birthday, String address, int phone, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }

    public int getCourse() {
        return course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void show() {
        System.out.println("ID: " + getId());
        System.out.println("Фамилия: " + getLastName());
        System.out.println("Имя: " + getFirstName());
        System.out.println("Отчество: " + getPatronymic());
        System.out.println("Дата рождения: " + getBirthday().getYear());
        System.out.println("Адрес: " + getAddress());
        System.out.println("Телефон: " + getPhone());
        System.out.println("Факультет: " + getFaculty());
        System.out.println("Курс: " + getCourse());
        System.out.println("Группа: " + getGroup());


    }
    //список студентов заданного факультета
    public void byFaculty(String faculty) {
        if ((this.getFaculty()).equals(faculty)) {
            System.out.println("ID: " + getId());
            System.out.println("Фамилия: " + getLastName());
            System.out.println("Имя: " + getFirstName());
            System.out.println("Отчество: " + getPatronymic());
            System.out.println("Дата рождения: " + getBirthday().getYear());
            System.out.println("Адрес: " + getAddress());
            System.out.println("Телефон: " + getPhone());
            System.out.println("Факультет: " + getFaculty());
            System.out.println("Курс: " + getCourse());
            System.out.println("Группа: " + getGroup());

        }

    }
    //списки студентов для каждого факультета и курса
    public void facCourse(String faculty, int course) {
        if (((this.getFaculty()).equals(faculty)) && (this.getCourse() == course)) {
            System.out.println("ID: " + getId());
            System.out.println("Фамилия: " + getLastName());
            System.out.println("Имя: " + getFirstName());
            System.out.println("Отчество: " + getPatronymic());
            System.out.println("Дата рождения: " + getBirthday().getYear());
            System.out.println("Адрес: " + getAddress());
            System.out.println("Телефон: " + getPhone());
            System.out.println("Факультет: " + getFaculty());
            System.out.println("Курс: " + getCourse());
            System.out.println("Группа: " + getGroup());
        }
    }
    //список студентов, родившихся после заданного года
    public void byBirthday(Date birthday){
        if ((this.getBirthday().getYear()) > (birthday.getYear())){
            System.out.println("ID: " + getId());
            System.out.println("Фамилия: " + getLastName());
            System.out.println("Имя: " + getFirstName());
            System.out.println("Отчество: " + getPatronymic());
            System.out.println("Дата рождения: " + getBirthday().getYear());
            System.out.println("Адрес: " + getAddress());
            System.out.println("Телефон: " + getPhone());
            System.out.println("Факультет: " + getFaculty());
            System.out.println("Курс: " + getCourse());
            System.out.println("Группа: " + getGroup());
        }
    }
    // список учебной группы, ну исправить 
    public void groupp(){
        if (!this.getGroup().equals("ИУ6-13М")){
            System.out.println("Группа: " + getGroup());

        }
    }
}