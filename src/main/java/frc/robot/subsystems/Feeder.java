/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;
public class Feeder extends SubsystemBase {
  public Spark Feeder = new Spark(3);
  public Feeder() {

  }
  public void FeedBall(double speed){
    Feeder.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
