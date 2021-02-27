package Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import Model.Car;

@Database(entities = {Car.class}, version = 1)
public abstract class CarsAppDatabase extends RoomDatabase {

    //создаем абстрактный метод, который возвращает объект DAO
    public abstract CarDAO getCarDAO();
}
