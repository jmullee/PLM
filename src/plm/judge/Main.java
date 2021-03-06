package plm.judge;

import plm.core.lang.*;

/**
 * The main class. This should be the entry point of the Judge.
 * @author Tanguy
 *
 */
public class Main {
	private static String host;
	private static String port;

	public static void initSupportedProgLang() {
		LangJava java = new LangJava(ClassLoader.getSystemClassLoader(), false);
		LangScala scala = new LangScala(ClassLoader.getSystemClassLoader(), false);
		LangPython python = new LangPython(false);
		LangBlockly blockly = new LangBlockly(false);

		ProgrammingLanguage.registerSupportedProgLang(java);
		ProgrammingLanguage.registerSupportedProgLang(scala);
		ProgrammingLanguage.registerSupportedProgLang(python);
		ProgrammingLanguage.registerSupportedProgLang(blockly);
	}

	public static void main(String[] argv) {
		host = System.getenv("MESSAGEQUEUE_ADDR");
		port = System.getenv("MESSAGEQUEUE_PORT");
		host = host != null ? host : "localhost";
		port = port != null ? port : "5672";

		initSupportedProgLang();

		Connector connector = new Connector(host, Integer.parseInt(port));
		Judge judge = new Judge(connector);

		// Let the judge handle one request before exiting
		for (int i=0; i<100; i++)
			judge.handleMessage();

		connector.closeConnections();
		System.exit(0);
	}
}
