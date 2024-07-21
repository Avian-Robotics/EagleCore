package com.avianroboticscms.swerve

import com.ctre.phoenix6.configs.CANcoderConfiguration
import com.ctre.phoenix6.hardware.CANcoder
import com.ctre.phoenix6.hardware.TalonFX

class SwerveModule(
    driverMotorId: Int,
    steerMotorId: Int,
    canCoderId: Int
) {
    private val driverMotor: TalonFX = TalonFX(driverMotorId)
    private val steerMotor: TalonFX = TalonFX(steerMotorId)
    private val encoder: CANcoder = CANcoder(canCoderId)

    init {
        encoder.configurator.apply {
            CANcoderConfiguration()
        }
    }
}