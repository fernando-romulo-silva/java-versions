package org.java.versions.java11.flight_recorder;

public class Main {
    //
    // (JFR) is now open-source in Open JDK, whereas it used to be a commercial
    // product in Oracle JDK.
    // JFR is a profiling tool that we can use to gather diagnostics and profiling
    // data from a running Java application.
    //
    // To start a 120 seconds JFR recording, we can use the following parameter:
    //
    // -XX:StartFlightRecording=duration=120s,settings=profile,filename=java-demo-app.jfr
    //
    // In order to analyze and visualize the data, we need to make use of another
    // tool called JDK Mission Control (JMC).

    // https://www.baeldung.com/java-flight-recorder-monitoring

}
