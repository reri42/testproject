package step.definitions;

import cucumber.api.java.nl.Stel;
import general.steps.StepContext;
import general.steps.StepData;

public class ScenarioEen extends StepContext{


    public ScenarioEen(StepData data) {
        super(data);
    }

    @Stel("ik doe iets met (.*)")
    public void doeIetsMet(String waarde) {
        System.out.println(waarde);
        System.out.println(data.getData());
    }
}
