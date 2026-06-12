package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
//        boolean aButton = gamepad1.a; // press TRUE, depress FALSE
//
//        if (aButton) {
//            telemetry.addData("A button", "Pressed!");
//        }
//        else {
//            telemetry.addData("A button", "Not Pressed");
//        }
//
//        telemetry.addData("A button State", aButton);
//        double leftY = -gamepad1.left_stick_y;
//
//        if (leftY< 0) {
//            telemetry.addData("Left Stick", "isNegative");
//        } else if (leftY > 0) {
//            telemetry.addData("Left Stick", "> 0");
//        }
//        else {
//            telemetry.addData("Left Stick", "is Zero");
//        }
//        telemetry.addData("Left Sitck value", leftY);

//        double leftY = gamepad1.left_stick_y;;
//
//        if (leftY < 0.1 && leftY > -0.1) {
//            telemetry.addData("Left Stick", "In Dead Zone");
//        }
//        telemetry.addData("Left Stick value", leftY);

        /*
        1. make a turbo button. If the a button is Not pressed, multiple the motor speed by 0.5. Otherwise, use the standard speed
         */

        double motorSpeed = gamepad1.left_stick_y;

        boolean aButton = gamepad1.a;

        if (!aButton) {
            motorSpeed *= 0.5;
        }
        else {
            // 2x motor speed
            motorSpeed *= 2;
        }
        telemetry.addData("Left Stick value", motorSpeed);

        // make a slow button. if the b button is pressed, mulitple the motor speed by 0.5. otherwise, use the standard speed.





    }
}



/*
And && if (leftY < 0.5 && leftY > 0) {
or ||
Not !


 */