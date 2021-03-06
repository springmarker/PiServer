package Server.pojo;

public class Parame {

	private Integer temperature; //温度
	private Integer humidity;    //湿度
	private String shortDistance; //短距离
	private String longDistance;  //长距离
	private long time;
	

	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public String getShortDistance() {
		return shortDistance;
	}
	public void setShortDistance(String shortDistance) {
		this.shortDistance = shortDistance;
	}
	public String getLongDistance() {
		return longDistance;
	}
	public void setLongDistance(String longDistance) {
		this.longDistance = longDistance;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
}
