package Основы.lesson10.TrafficLight;

public class TrafficLight {
	private String name;
	private Color light;
	private long lightTime;
	private long lastSwitchTime;
	private Color prevLight; 
	
	public TrafficLight (Color light, long lightTime, String name) {
		this.light = light;
		this.lightTime = lightTime;
		this.name = name;
	}

	// Переключение цветов светофора.
	public void switchLight() {
		if (light == Color.RED && isTimeToSwitch()) {
			light = Color.YELLOW;
			prevLight = Color.RED;
			lastSwitchTime = System.currentTimeMillis();
			
			} else if (light == Color.GREEN && isTimeToSwitch()) {
				light = Color.YELLOW;
				prevLight = Color.GREEN;
				lastSwitchTime = System.currentTimeMillis();
			} else if (light == Color.YELLOW && isTimeToSwitch() && prevLight.equals("red")){
				light = Color.GREEN;
			} else if (light == Color.YELLOW && isTimeToSwitch() && prevLight.equals("green")) {
				light = Color.RED;
			}
	}
	
	//Вывод.
	public void light() {
		System.out.println(name + "-" + light.name());
	}
	
	
	private boolean isTimeToSwitch() {
		long currentTime = System.currentTimeMillis();
		if (lastSwitchTime + lightTime < currentTime) {
			return true;
		}
		return false;
	}
	
}
