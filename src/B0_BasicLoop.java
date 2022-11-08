public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.pausetime = 0;
        plane.trailWidth=3;
        //plane.house(100);
        for  (int row = 0; row < 20; row = row + 1)
        {
            for (int col=0; col < 20; col = col + 1) {


                int a = (int) (Math.random() * 10) + 1;
                System.out.println(a);
                plane.teleport(50 * col, row * 30);
                plane.setColor(  50+10*row,  12*col, 150);
                plane.house(10 );
            }
                //for  (int y = 0; y < 10; y = y + 1) {
                //int a =(int)(Math.random()*355);
                //int b = (int) (Math.random() * 256);

        }
    }

    public void house() {

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

    }
}

