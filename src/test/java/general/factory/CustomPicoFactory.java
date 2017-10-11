package general.factory;

import cucumber.runtime.java.picocontainer.PicoFactory;
import data.ScenarioEenData;
import data.ScenarioTweeData;

public class CustomPicoFactory extends PicoFactory {
    public CustomPicoFactory(){
        //addClass(ScenarioEenData.class);
        addClass(ScenarioTweeData.class);
    }
}
