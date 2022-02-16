package uz.jl.hibernate.models.m2o;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import uz.jl.hibernate.utils.HibernateUtils;

import java.util.ArrayList;
import java.util.List;

public class M2oTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.sessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();


        Computer computer = new Computer();
        computer.setComputerName("Lenovo Legion");


        List<Item> items = new ArrayList<>() {{
            add(new Item("HDD"));
            add(new Item("SSD"));
            add(new Item("RAM"));
        }};

//        items.forEach(session::save);

        computer.setItems(items);
        session.persist(computer);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
