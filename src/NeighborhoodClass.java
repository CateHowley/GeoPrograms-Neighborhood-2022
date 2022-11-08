public class NeighborhoodClass extends World {
    public void go()
    {
    plane.showBackGround();

    int X = 600;
    int Y = 200;

        for (int z = 0; z < 2; z++) {
        plane.teleport(X, Y);
        X = X - 400;
        Y = Y + 100;

        for (int i = 0; i < 2; i++) {
            System.out.println(X);
            if (X < 0){
                plane.setColor(200, 100, 2);
            }
            if (X > 0){
                plane.setColor(100, 200, 0);
            }
            plane.isTrail = true;
            plane.trailWidth = 10;
            plane.house(100);
//            plane.setColor(250, 30, 56);

        }
            plane.pausetime=0;
            plane.teleport(50,100);
            plane.setColor(255,255,153);
            plane.fillCircle(100);
            plane.trailWidth=100;
            plane.teleport(30,50);
            plane.setColor(255,255,153);
            plane.square(50);




    }


    }
}

