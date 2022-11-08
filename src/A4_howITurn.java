

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 250, 154);
        plane.move(100);
        plane.turn(90);
        plane.setColor(32, 178, 170);
        plane.move(100);
        plane.turn(90);
        plane.setColor(240, 128, 128);
        plane.move(100);
        plane.turn(90);
        plane.move(100);




    }


}
