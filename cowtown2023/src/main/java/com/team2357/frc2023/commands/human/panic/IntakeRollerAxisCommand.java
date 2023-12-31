package com.team2357.frc2023.commands.human.panic;

import com.team2357.frc2023.Robot;
import com.team2357.frc2023.controls.AxisInterface;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeRollerAxisCommand extends CommandBase {
    private AxisInterface m_topRollerAxis;
    private AxisInterface m_bottomRollerAxis;

    public IntakeRollerAxisCommand(AxisInterface topRollerAxis, AxisInterface bottomRollerAxis) {
        m_topRollerAxis = topRollerAxis;
        m_bottomRollerAxis = bottomRollerAxis;
        addRequirements(Robot.intakeRoller);
    }

    @Override
    public void execute() {
        Robot.intakeRoller.setAxisRollerSpeeds(m_topRollerAxis.getValue(), m_bottomRollerAxis.getValue());
    }

    @Override
    public void end(boolean interrupt) {
        Robot.intakeRoller.stop();
    }
}
