public class A6_house extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go(){
        plane.isTrail = true;
        plane.pausetime = 0;
       plane.teleport(300,400);


    for(int h = 0; h<5; h++ ) {
        int Q = (int) (Math.random() * 3) + 1;
        if (Q == 1) {

         house();
        }
        plane.teleport((int)(Math.random()*600), (int)(Math.random()*600));
        if ( Q == 2) {

            mysquare();
        }
        if ( Q == 3) {

            mytriangle();
        }
        }

//equitriangle(500);
//plane.teleport(90, 500);
//house();
//plane.teleport(700, 500 );
//house();
//plane.teleport(500, 500 );
//house();
//plane.teleport(300, 500 );
//
//plane.teleport(700, 300 );
//house();


    //}


//       // plane.move(111);
//       // plane.turn(90);
//        plane.move(111);
//        plane.turn(90);
//        plane.move(111);
//        plane.turn(90);
//        plane.move(111);
//        plane.turn(90);


    }

    public void small(int a, int b) {
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);


    }
    public void mytriangle(){plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 250, 154);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(32, 178, 170);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(240, 128, 128);

        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 250, 154);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(32, 178, 170);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(240, 128, 128);

        }
        public void mysquare(){plane.startingAngle(90);
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
    public void house() {

//            plane.startingAngle(90);
//            plane.isTrail = true;
//            plane.trailWidth = 10;
//            plane.setColor(0, 250, 154);
//            plane.move(100);
//            plane.turn(90);
//            plane.setColor(32, 178, 170);
//            plane.move(100);
//            plane.turn(90);
//            plane.setColor(240, 128, 128);
//            plane.move(100);
//            plane.turn(90);


            mysquare();
            plane.turn(180);
            equitriangle(100);
        }
//        public void mysquare(){plane.startingAngle(90);
//            plane.isTrail = true;
//            plane.trailWidth = 10;
//            plane.setColor(0, 250, 154);
//            plane.move(100);
//            plane.turn(90);
//            plane.setColor(32, 178, 170);
//            plane.move(100);
//            plane.turn(90);
//            plane.setColor(240, 128, 128);
//            plane.move(100);
//            plane.turn(90);
//            plane.move(100);
//
//        plane.isTrail = true;
//        plane.startingAngle(0);
//        square(50);
//        plane.isTrail = false;
//        plane.startingAngle(270);
//        plane.move(200);
//        plane.isTrail = true;
//        plane.pausetime = 0;
//        sun(20);
//    }

    public void square(int a) {
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
    }

    public void equitriangle(int b) {
        plane.move(b);
        plane.turn(120);
        plane.move(b);
        plane.turn(120);
        plane.move(b);
        plane.turn(120);
       // equitriangle (b:20);
    }

    public void rectangle(int a, int b) {
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);

    }

    public void fillRec(int a, int b) {


    }

    public void tree(int a) {

    }

    public void sun(int a) {
        plane.setColor(255, 255, 0);
        plane.fillCircle(a);
    }

}


/*

Methods:
- fillCircle(int x)
   fillCircle() draws a filled circle with a radius size specified in the parameter.
   plane.fillCircle(10); draws a circle of radius 10 pixels.

- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int pausetime
   pausetime is used to speed up or slow down the plane. The default value is 5.
   plane.pausetime = 10; slows the plane down.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/
