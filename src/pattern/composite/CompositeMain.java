package pattern.composite;

/**
 * @author wangyu
 * @date 2021/12/22 15:04
 */
public class CompositeMain {
    public static void main(String[] args) {
        Person master = new Person("校长","王校长");

        Person teacher1 = new Person("老师","张老师");
        Person teacher2 = new Person("老师","李老师");

        Person student1 = new Person("学生","学生1");
        Person student2 = new Person("学生","学生2");
        Person student3 = new Person("学生","学生3");

        master.add(teacher1);
        master.add(teacher2);

        teacher1.add(student1);
        teacher1.add(student2);
        teacher1.add(student3);

        teacher2.add(student1);
        teacher2.add(student2);
        teacher2.add(student3);

        System.out.println(master);
        for(Person leadPerson:master.getPerson_list()){
            System.out.println(leadPerson);
            for(Person student:leadPerson.getPerson_list()){
                System.out.println(student);
            }
        }

    }
}
