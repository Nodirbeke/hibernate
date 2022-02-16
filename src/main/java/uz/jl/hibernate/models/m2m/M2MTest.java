package uz.jl.hibernate.models.m2m;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import uz.jl.hibernate.utils.HibernateUtils;

import java.util.Arrays;

public class M2MTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.sessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        Student dilshod = new Student();
        dilshod.setAge(22);
        dilshod.setFullName("Dilshod Ahmedov");

        Student husan = new Student();
        husan.setAge(22);
        husan.setFullName("Narzullayev Husan");

        Subject subject1 = new Subject();
        subject1.setSubjectName("How To become successful team lead");
        subject1.setStudents(Arrays.asList(husan, dilshod));

        Subject subject2 = new Subject();
        subject2.setSubjectName("Keep alive hard situations");
        subject2.setStudents(Arrays.asList(husan, dilshod));

        session.persist(subject1);
        session.persist(subject2);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
