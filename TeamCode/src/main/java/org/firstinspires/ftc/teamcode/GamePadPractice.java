package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    int loop_count = 500;

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // 50 times a sec
        float speedForward = - gamepad1.left_stick_y;

        telemetry.addData("left x", gamepad1.left_stick_x);
        telemetry.addData("left y", speedForward);
        telemetry.addData("a button", gamepad1.a);

        loop_count++; // loop_count = loop_count + 1;
        telemetry.addData("loop count", loop_count);

        telemetry.addData("right x", gamepad1.right_stick_x);
        telemetry.addData("right y", gamepad1.right_stick_y);
        telemetry.addData("b button", gamepad1.b);

        float difference = gamepad1.left_stick_x - gamepad1.right_stick_x;
        telemetry.addData("difference of leftx and rightx", difference);

        // tell telemetry the sum of the two rear triggers
        telemetry.addData("sum of triggers", gamepad1.left_trigger + gamepad1.right_trigger);

    }
}
