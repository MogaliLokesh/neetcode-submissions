class Solution {

    class Car {
        int position;
        double time;
        Car(int pos, double time){
            this.position=pos;
            this.time=time;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        
    Car[] cars = new Car[position.length];
    
    for(int i=0;i<position.length;i++){
        cars[i] = new Car(position[i], (double)(target-position[i])/speed[i]);
    }

    Arrays.sort(cars, (a,b)->Double.compare(b.position,a.position));

    double lastFleetTime=0;
    int fleets=0;

    for(Car car : cars){
        if(car.time > lastFleetTime){
            fleets++;
            lastFleetTime=car.time;
        }
    }

    return fleets;

    }
}
