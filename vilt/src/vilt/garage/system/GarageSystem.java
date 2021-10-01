package vilt.garage.system;
import java.util.ArrayList;
import java.util.Collection;

public class GarageSystem {

/////////////////////////////////////////////////////////////////////////////////////////////

    public interface Vehicle {

        public String getName();

        public int getWheelCount();

        public double getTotalRepairCost();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public class Car implements Vehicle {

        private String name;

        public String getName() {
            return this.name;
        }

        public int getWheelCount() {
            return 4;
        }

        private double totalRepairCost;

        @Override
        public double getTotalRepairCost() {
            return this.totalRepairCost;
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////

    public class Truck extends Car implements Vehicle {

        public int getWheelCount() {
            return 6;
        }

        private boolean hasTrailer = false;

        public boolean HasTrailer() {
            return this.hasTrailer;
        }
    }

 //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public interface IWarranty{

        public boolean IsValid();

    }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public class Motorcycle extends Car implements IWarranty{

        public int getWheelCount() {
            return 2;
        }

        private boolean isValid = true;

        public boolean IsValid(){
            return this.isValid;
        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static class Garage {

        private Collection<Truck> vehicles = new ArrayList<Truck>();

        public void StartVehicleRepair(Truck x) {
            this.vehicles.add(x);
        }

        public void CloseVehicleRepair(Truck x) {
            this.vehicles.remove(x);
        }

        public double CalculateSumOfAllRepairsInGarage() {
            return this.vehicles.size();
        }

        public int CalculateCountOfAllTrailersInGarage() {
            int i = 0;
            for (Truck v : vehicles) {
                if (v.HasTrailer()) {
                    i++;
                }
            }
            return i;
        }
    }

}