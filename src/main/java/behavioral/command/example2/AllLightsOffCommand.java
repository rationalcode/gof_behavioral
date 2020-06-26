package behavioral.command.example2;

import java.util.List;

public class AllLightsOffCommand implements Command {

  private List<Light> lights;

  public AllLightsOffCommand(List<Light> lights) {
    this.lights = lights;
  }

  @Override
  public void execute() {
    for (Light light : lights) {
      if (light.isOn()) {
        light.toggle();
      }
    }
  }
}
