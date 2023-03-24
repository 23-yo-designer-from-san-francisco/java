import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student(
                1,
                "Иванов",
                "Иван",
                "Иванович",
                new Date(1990, 9, 9),
                "Москва",
                14251,
                "БМТ",
                3,
                "БМТ1-11"
        );
        students[1] = new Student(
                2,
                "Петров",
                "Петр",
                "Петрович",
                new Date(1991, 5, 6),
                "Санкт-Петербург",
                1231512,
                "ИУ",
                4,
                "ИУ6-13М"
        );
        students[2] = new Student(
                3,
                "Александров",
                "Александр",
                "Александрович",
                new Date(1992, 6, 19),
                "Пермь",
                142215,
                "ФН",
                2,
                "ФН12-11"
        );
        students[3] = new Student(
                4,
                "Семенов",
                "Семен",
                "Семенович",
                new Date(1988, 11, 19),
                "Иваново",
                5131341,
                "РЛ",
                3,
                "РЛ1-13М"
        );

        Date bday = new Date(1990, 9, 9);

        for (int i = 0; i <= 3; i++) {
            students[i].show();
        }

        System.out.println();
        for (int i = 0; i <= 3; i++) {
            students[i].byFaculty("ИУ");
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            students[i].facCourse("ИУ", 3);
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            students[i].byBirthday(bday);
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            students[i].groupp();
        }
    }
}
