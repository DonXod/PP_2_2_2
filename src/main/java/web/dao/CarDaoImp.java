package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{


    List<Car> list = new ArrayList<>();
    {
        list.add(new Car("audi", 255, true));
        list.add(new Car("bmw", 122, true));
        list.add(new Car("lada", 666, false));
        list.add(new Car("ford", 22, true));
        list.add(new Car("audi", 255, false));
    }

    @Override
    public List<Car> listCars(int count) {
        return list.subList(0, count);
    }
}
