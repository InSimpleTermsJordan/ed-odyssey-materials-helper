package nl.jixxed.eliteodysseymaterials.enums;

public enum HorizonsModifier {
    DAMAGE,
    THERMAL_LOAD,
    RELOAD_TIME,
    AMMO_CAPACITY,
    MASS,
    OPTIMAL_MASS,
    INTEGRITY,
    BOOT_TIME,
    POWER_DRAW,
    //edengineer
    RANGE,
    SPIN_UP_TIME,
    OPTIMAL_MULTIPLIER,
    RATE_OF_FIRE,
    SHIELD_BOOST,
    BURST_SIZE,
    BURST_RATE_OF_FIRE,
    FACING_LIMIT,
    DURATION,
    SHIELD_REINFORCEMENT,
    OPTIMAL_STRENGTH,
    AMMO_MAXIMUM,
    BROKEN_REGEN_RATE,
    SCAN_ANGLE,
    SCAN_RANGE,
    SCAN_TIME,
    PROBE_RADIUS,
    MAXIMUM_RANGE,
    ALL_RESISTANCES,
    HULL_REINFORCEMENT,
    DISTRIBUTOR_DRAW,
    EXPLOSIVE_RESISTANCE,
    KINETIC_RESISTANCE,
    THERMAL_RESISTANCE,
    POWER_GENERATION,
    HULL_BOOST,
    POWER_CAPACITY,
    POWER_RECHARGE,
    WEAPONS_CAPACITY,
    WEAPONS_RECHARGE,
    SYSTEMS_CAPACITY,
    SYSTEMS_RECHARGE,
    ENGINES_CAPACITY,
    ENGINES_RECHARGE,
    HEAT_EFFICIENCY,
    DAMAGE_FALLOFF_START,
    ARMOUR_PIERCING,
    SHOT_SPEED,
    JITTER,
    CLIP_SIZE,
    DAMAGE_BOOST,
    REFILL,
    JUMP_RANGE,
    REPAIR_SPEED,
    HULL_STRENGTH,
    FUEL_EFFICIENCY,
    HEAT_DISSIPATION,
    LIMPETS,
    WING_SHIELD_REGENERATION_INCREASED,
    TARGET_WING_SHIELDS_REGENERATED,
    DAMAGE_INCREASES_WITH_HEAT_LEVEL,
    TARGET_HEAT_INCREASED,
    HEAT_REDUCED_WHEN_STRIKING_A_TARGET,
    DAMAGE_PARTIALLY_KINETIC,
    PART_OF_DAMAGE_THROUGH_SHIELDS,
    TARGET_MODULES_MALFUNCTIONS,
    TARGET_SIGNATURE_INCREASED,
    DAMAGE_PARTIALLY_THERMAL,
    NO_DAMAGE_TO_UNTARGETED_SHIPS,
    AUTO_RELOAD_WHILE_FIRING,
    TARGET_ARMOR_HARDNESS_REDUCED,
    TARGET_PUSHED_OFF_COURSE,
    DAMAGE_PARTIALLY_EXPLOSIVE,
    SHIELDED_TARGET_HEAT_INCREASED,
    TARGET_GIMBAL_TURRET_TRACKING_REDUCED,
    TARGET_SENSOR_ACUITY_REDUCED,
    EFFECTIVENESS_INCREASE_AGAINST_MUNITIONS,
    TARGET_MODULE_DAMAGE,
    TARGET_FSD_REBOOTS,
    TARGET_FSD_INHIBITED,
    TARGET_SHIELD_GENERATOR_DAMAGED,
    TARGET_THRUSTERS_REBOOT,
    AREA_HEAT_INCREASED_SENSORS_DISRUPTED,
    AREA_FSDS_REBOOT,
    TARGET_LOSES_TARGET_LOCK,
    RELOAD_FROM_SHIP_FUEL,
    TARGET_SHIELD_CELL_DISRUPTED,
    MAXIMUM_FUEL_PER_JUMP,
    TARGET_SPEED_REDUCED,
    REGEN_RATE,
    ANTI_XENO_DAMAGE;

    public static HorizonsModifier forName(final String name) {
        try {
            return HorizonsModifier.valueOf(name.toUpperCase());
        } catch (final IllegalArgumentException ex) {
            return null;
        }
    }

    public String getLocalizationKey() {
        return "modifier.horizons.name." + this.name().toLowerCase();
    }
}