package io.openems.edge.testdevice;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import io.openems.common.types.MeterType;

@ObjectClassDefinition(//
		name = "io.openems.edge.testdevice", //
		description = "Test device")
@interface Config {

	@AttributeDefinition(name = "Component-ID", description = "Unique ID of this Component")
	String id() default "io.openems.edge.testdevice0";

	@AttributeDefinition(name = "Alias", description = "Human-readable name of this Component; defaults to Component-ID")
	String alias() default "";

	@AttributeDefinition(name = "Is enabled?", description = "Is this Component enabled?")
	boolean enabled() default true;
	
	@AttributeDefinition(name = "Meter-Type", description = "Grid, Production (=default), Consumption")
	MeterType type() default MeterType.PRODUCTION;

	String webconsole_configurationFactory_nameHint() default "io.openems.edge.testdevice [{id}]";

}