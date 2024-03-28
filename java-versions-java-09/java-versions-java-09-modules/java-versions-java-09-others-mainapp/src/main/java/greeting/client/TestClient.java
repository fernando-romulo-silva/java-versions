package greeting.client;

import static java.lang.System.out;

import java.util.ServiceLoader;

import greeting.api.MessageService;

public class TestClient {

    public static void main(String[] args) {

	// The type greeting.util.NonExportedClass(from mod01) is not accessible
	// greeting.util.NonExportedClass.NonExportedClass.

	out.print("starting!");

	ServiceLoader<MessageService> ms = ServiceLoader.load(MessageService.class);

	for (MessageService m : ms) {
	    out.println(m.getMessage());
	}
    }
}
