package homework.seminar2;

import homework.DSstore_seminar2.Car;
import homework.DSstore_seminar2.Motorcycle;
import homework.DSstore_seminar2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class VehicleTest {
    Car car = new Car("Hunday", "Solaris", 2022);
    Motorcycle moto = new Motorcycle("Kawasaki", "Vulkan", 2020);

    //- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void instanceOf() {
        //Car car = new Car("Hunday", "Solaris", 2022);
        assertThat(car instanceof Vehicle);
    }

    //- проверка того, объект Car создается с 4-мя колесами
    @Test
    void WheelsCar() {
        //Car car = new Car("Hunday", "Solaris", 2022);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // - проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void MotorcycleWheels() {
        //Motorcycle moto = new Motorcycle("Kawasaki", "Vulkan", 2020);
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park,
    // т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void parkCar() {
        car.testDrive();
        //System.out.println(car.getSpeed());
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park
    // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        //System.out.println(moto.getSpeed());
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
