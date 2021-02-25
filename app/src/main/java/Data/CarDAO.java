package Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Model.Car;

//Класс для управления данными таблицы (CRUD)
@Dao
public interface CarDAO {

    @Insert
    public long addCar(Car car); //Insert возвращает id.  В метод передается объект класса Car

    @Update
    public void updateCar(Car car);

    @Delete
    public void deleteCar (Car car);

    //запрос всех данных из таблицы
    @Query("select * from cars") // метод возвращает список объектов Car
    public List<Car> getAllCars();

    //запрос одной строки из таблицы
    @Query("select * from cars where car_id ==:carId ")
    public Car getCar(long carId);

}
