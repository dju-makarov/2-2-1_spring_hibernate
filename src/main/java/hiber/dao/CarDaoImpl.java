package hiber.dao;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Car findOne(Long id) {
        return sessionFactory.getCurrentSession().get(Car.class, id);
    }

    @Override
    public List<Car> findAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Car").getResultList();
    }

    @Override
    public Car save(Car car) {
        return findOne((Long) sessionFactory.getCurrentSession().save(car));
    }
}