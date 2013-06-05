import org.x52North.cosmSensorMl.CosmSensorMlDocument;
import org.x52North.cosmSensorMl.CosmSensorMlDocument.CosmSensorMl;

public class CosmSensorMLTest {

	static CosmSensorMlDocument sensor;

	public static void main(String args[]) {
		sensor = CosmSensorMlDocument.Factory.newInstance();
		CosmSensorMl ml = sensor.addNewCosmSensorMl();
	
		

	}
}
