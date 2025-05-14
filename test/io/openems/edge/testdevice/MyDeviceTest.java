package io.openems.edge.testdevice;

import org.junit.Test;

import io.openems.edge.common.test.AbstractComponentTest.TestCase;
import io.openems.edge.common.test.ComponentTest;
import io.openems.common.types.MeterType;
import io.openems.edge.common.test.DummyConfigurationAdmin;

public class MyDeviceTest {
	
	private static final String COMPONENT_ID = "component0";


	@Test
	public void test() throws Exception {
		new ComponentTest(new MyDeviceImpl()) //
				.activate(MyConfig.create() //
						.setId("component0") //
						.setType(MeterType.GRID) //
						.build()) //
				.next(new TestCase()) //
				.deactivate();
	}

}
