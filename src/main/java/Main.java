import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Kristof", 27);
        Student student2 = new Student("Olaf", 68);
        Student student3 = new Student("Elsa", 23);
        Student student4 = new Student("Anna", 80);

        Map<String, Student> studentMap = new HashMap<String, Student>();

        studentMap.put("Kristof", student1);
        studentMap.put("Olaf", student2);
        studentMap.put("Else", student3);
        studentMap.put("Anna", student4);

        increaseGrade(studentMap);

    }

    public static Map<String, Student> increaseGrade(Map<String, Student> map) {
        map.forEach(
                (k, v) -> {
                    double increasedGrade = v.getGrade() * 1.1;
                    v.setGrade((int)increasedGrade);
                }
        );

        return map;
    }



}
