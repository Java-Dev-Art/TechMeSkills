
/**
 * 1) Создать класс User для хранения о обработки данных о пользователе.
 * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
 * - Возврата имени и фамилии полностью
 * - Увеличения возраста
 * - Вывода общей информации о пользователе
 * В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
 * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
 * В этом конструкторе сделать вызов другого конструктора этого же класса.
 * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
 */
public class User {
    private String name;
    private String firstName;
    private String sex;
    private int age;

    @Deprecated
    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public User(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public User(String name, String firstName) {
        String sex = "MEL";
        int age = 30;
        this.name = name;
        this.firstName = firstName;
        setAge(age);
        setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
