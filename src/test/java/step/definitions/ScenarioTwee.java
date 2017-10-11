package step.definitions;

import cucumber.api.java.nl.Stel;
import general.steps.StepContext;
import general.steps.StepData;

public class ScenarioTwee extends StepContext{

    public ScenarioTwee(StepData data) {
        super(data);
    }

    @Stel("ik iets uit waarbij je een waarde nodig hebt (.*)")
    public void the_following_animals(String waarde) {
        System.out.println(waarde);
        System.out.println(data.getData());
    }
}
