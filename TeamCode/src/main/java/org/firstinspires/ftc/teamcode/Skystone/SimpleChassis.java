package org.firstinspires.ftc.teamcode.Skystone;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class SimpleChassis extends LinearOpMode {

    public DcMotor left;
    public DcMotor right;

    final static double SPEED = 37.25;
    final static boolean LEFT = true;
    final static boolean RIGHT = false;

    public SimpleChassis () {
        left = hardwareMap.dcMotor.get("LeftMotor");
        right = hardwareMap.dcMotor.get("RightMotor");
    }


    //Please ignore this method. write your own runOpMode in your autonomous class
    public void runOpMode() {
        waitForStart();
    }

    public void moveBackward(double distance) {
        double sleepTime = distance/SPEED * 1000;
        left.setPower(-0.5);
        right.setPower(0.5);
        sleep((long) sleepTime);
        left.setPower(0);
        right.setPower(0);
    }

    public void moveForward(double distance) {
        double sleepTime = distance/SPEED * 1000;
        left.setPower(0.5);
        right.setPower(-0.5);
        sleep((long) sleepTime);
        left.setPower(0);
        right.setPower(0);
    }

    public void inPlaceTurn(double amount, boolean direction) {

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

    public void regularTurn(double amount, boolean direction) {

        double degrees = amount/45*333;

        if (direction = LEFT){
            left.setPower(0);
            right.setPower(0.5);
            sleep((long) degrees);
        }else {
            left.setPower(0.5);
            right.setPower(0);
            sleep((long) degrees);
        }
        left.setPower(0);
        right.setPower(0);
    }


}
