package org.firstinspires.ftc.teamcode.examples.JavaTheBot;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous(name="JavaTheBotAutonomous")

public class JavaTheBotAutonomous extends LinearOpMode {

    DcMotor left;
    DcMotor right;

    final static double SPEED = 37.25;
    final static boolean LEFT = true;
    final static boolean RIGHT = false;
    @Override
    public void runOpMode() {

        left = hardwareMap.dcMotor.get("LeftMotor");
        right = hardwareMap.dcMotor.get("RightMotor");

        waitForStart();

        moveForward(12);

        sleep(3000);

        turn(90, LEFT);

        sleep(3000);

        moveForward(24);

        sleep(3000);

        turn(90, RIGHT);

        stop();

    }

    public void moveBackward(double distance) {

    }

    public void moveForward(double distance) {
        double sleepTime = distance/SPEED * 1000;
        left.setPower(0.5);
        right.setPower(-0.5);
        sleep((long) sleepTime);
        left.setPower(0);
        right.setPower(0);
    }

    public void turn(double amount, boolean direction) {

        double degrees = amount/45*333;

        if (direction = LEFT){
            left.setPower(-1);
            right.setPower(-1);
            sleep((long) degrees);
        }else {
            left.setPower(1);
            right.setPower(1);
            sleep((long) degrees);
        }
        left.setPower(0);
        right.setPower(0);
    }
}