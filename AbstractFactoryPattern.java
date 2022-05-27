abstract class VehicleFactory{
    public abstract Vehicle getVehicle(String tyep);
    public static VehicleFactory getVehicleFactory(String type){
        if(type.equals("Bike"))
        return new Bike();
        else if(type.equals("Car"))
        return new Car();
        else return null;
    }
}
class Bike extends VehicleFactory{
    public Vehicle getVehicle(String type){
        if(type.equals("Pulsar"))
        return new Pulsar();
        else if(type.equals("MT"))
        return new MT();
        else if(type.equals("FZ"))
        return new FZ();
        else return null;
    }
}
interface Vehicle{
    public void purchaseVehicle();
}
class Pulsar implements Vehicle{
    @Override
    public void purchaseVehicle() {
         System.out.println("I bought Pulsar Bike");
    }
}
class FZ implements Vehicle{
    @Override
    public void purchaseVehicle() {
         System.out.println("I bought FZ Bike");
    }
}
class MT implements Vehicle{
    @Override
    public void purchaseVehicle() {
         System.out.println("I bought MT Bike");
    }
}
class Car extends VehicleFactory{
    public Vehicle getVehicle(String type){
        if(type.equals("RR"))
        return new MT();
        else if(type.equals("BENZ"))
        return new FZ();
        else return null;
    }
}
class RR implements Vehicle{
    @Override
    public void purchaseVehicle() {
         System.out.println("I bought RR CAr");
    }
}
class BENZ implements Vehicle{
    @Override
    public void purchaseVehicle() {
         System.out.println("I bought BENZ Car");
    }
}
class AbstractFactoryPattern{
    public static void main(String[] args) {
        VehicleFactory vehicleFactory=VehicleFactory.getVehicleFactory("Bike");
        Vehicle vehicle=vehicleFactory.getVehicle("FZ");
        vehicle.purchaseVehicle();
    }
}