package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
//    @Override
//    public List<Car> getListCar(Integer count) {
//        return carDao.getListCar(count);
//    }
        @Override
        public List<Car> getListCarFull () {
            //return CarDao.getListCarFull;
            return null;
        }
    }
}
