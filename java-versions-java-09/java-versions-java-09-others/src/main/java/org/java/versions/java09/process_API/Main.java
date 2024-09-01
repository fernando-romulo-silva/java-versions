package org.java.versions.java09.process_API;

import static java.lang.System.out;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

class Main {

	static void processInformation() {

		ProcessHandle self = ProcessHandle.current();
		long PID = self.pid();
		ProcessHandle.Info procInfo = self.info();

		Optional<String[]> args = procInfo.arguments();
		Optional<String> cmd = procInfo.commandLine();
		Optional<Instant> startTime = procInfo.startInstant();
		Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

		out.println("PID " + PID);
		out.println("args " + args.get());
		out.println("cmd " + cmd.get());
		out.println("startTime " + startTime.get());
		out.println("cpuUsage " + cpuUsage.get());
	}

	public static void main(String[] args) {
		processInformation();
	}

}
