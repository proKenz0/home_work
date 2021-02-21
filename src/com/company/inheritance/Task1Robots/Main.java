package com.company.inheritance.Task1Robots;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotCoocker robotCoocker = new RobotCoocker();
        RobotDancer robotDancer = new RobotDancer();

        robot.work();
        coffeRobot.work();
        robotCoocker.work();
        robotDancer.work();

        Robot[] robots = new Robot[]{robot, coffeRobot, robotCoocker, robotDancer};
        for (var r : robots){
            r.work();
        }
    }
}
