class Aeroplane {
    public void takeoff() {
        System.out.println("The Plane is take off");
    }

    public void fly() {
        System.out.println("The Plane is Flaying");
    }
}

class cargoPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("Cargo plane carry Goods");
    }

    public void fly() {
        System.out.println("CargoPlane fly at low hight");
    }

}

class passengerPlane extends Aeroplane {
    public void fly() {
        System.out.println("PassengerPlanes fly at high hight");
    }

    public void takeoff() {
        System.out.println("passenger plane carry passengers");
    }

}

public class types {
    public static void main(String[] args) {
        Aeroplane ap = new Aeroplane();
        ap.fly();
        ap.takeoff();

        cargoPlane cp = new cargoPlane();
        cp.fly();
        cp.takeoff();

        passengerPlane pp = new passengerPlane();
        pp.fly();
        pp.takeoff();
    }

}