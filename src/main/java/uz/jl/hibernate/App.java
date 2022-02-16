package uz.jl.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import uz.jl.hibernate.enums.BookType;
import uz.jl.hibernate.models.Book;
import uz.jl.hibernate.models.Car;
import uz.jl.hibernate.models.Engine;
import uz.jl.hibernate.utils.HibernateUtils;

import java.util.List;

public class App {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.sessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
//
        Car car = new Car();
        car.setName("Maluba 1");
        car.setEngineName("Engine");
        session.save(car);
//
//        Engine engine = new Engine();
//        engine.setName("jiguli");
//        session.save(engine);
//
//        car.setEngine(engine);
//        session.save(car);

//        Query query = session.createQuery("from Car");
//        List<Car> carList = (List<Car>) query.list();
//        System.out.println("carList = " + carList);
//        Query query = session.createQuery("from meningCarim ");
//        List<Car> engineList = (List<Car>) query.list();
//        System.out.println("engineList = " + engineList);
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
