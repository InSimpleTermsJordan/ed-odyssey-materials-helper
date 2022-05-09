package nl.jixxed.eliteodysseymaterials.domain;

import nl.jixxed.eliteodysseymaterials.enums.*;

import java.util.List;
import java.util.Map;

public class HorizonsModuleBlueprint extends HorizonsBlueprint implements HorizonsEngineeringBlueprint {
    private final List<Engineer> engineers;

    public HorizonsModuleBlueprint(final HorizonsBlueprintName horizonsBlueprintName, final HorizonsBlueprintType horizonsBlueprintType, final HorizonsBlueprintGrade horizonsBlueprintGrade, final Map<? extends HorizonsMaterial, Integer> materials, final List<Engineer> engineers) {
        super(horizonsBlueprintName, horizonsBlueprintType, horizonsBlueprintGrade, materials, engineers);
        this.engineers = engineers;
    }

    public HorizonsModuleBlueprint(final HorizonsBlueprintName horizonsBlueprintName, final HorizonsBlueprintType horizonsBlueprintType, final HorizonsBlueprintGrade horizonsBlueprintGrade, final Map<? extends HorizonsMaterial, Integer> materials, final Map<HorizonsModifier, HorizonsModifierValue> modifiers, final List<Engineer> engineers) {
        super(horizonsBlueprintName, horizonsBlueprintType, horizonsBlueprintGrade, materials, modifiers, engineers);
        this.engineers = engineers;
    }

    //experimentals
    public HorizonsModuleBlueprint(final HorizonsBlueprintName horizonsBlueprintName, final HorizonsBlueprintType horizonsBlueprintType, final Map<? extends HorizonsMaterial, Integer> materials, final Map<HorizonsModifier, HorizonsModifierValue> modifiers, final List<Engineer> engineers) {
        super(horizonsBlueprintName, horizonsBlueprintType, materials, modifiers, engineers);
        this.engineers = engineers;
    }

    @Override
    public List<Engineer> getEngineers() {
        return this.engineers;
    }

    public boolean hasSingleEngineerPerRegion() {
        return this.engineers != null && this.engineers.size() == 2;
    }
}