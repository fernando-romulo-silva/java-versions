package org.java.versions.java06.scripting_support;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class Main {

    
    // This allowed developers to embed scripting languages such as JavaScript, Groovy, and others directly into their Java applications.
    public static void main(String[] args) throws ScriptException {
	
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("Groovy");

        String script = "println 'Hello from Groovy script!')";
        engine.eval(script);
    }

}
