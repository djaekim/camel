/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.calendar.stream;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleCalendarStreamComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleCalendarStreamComponent target = (GoogleCalendarStreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.calendar.GoogleCalendarClientFactory.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.calendar.stream.GoogleCalendarStreamConfiguration.class, value)); return true;
        default: return false;
        }
    }

}
