package java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptRun {

	public static void main(String[] args) {
	 
		// TODO Auto-generated method stub
   ScriptEngineManager manager= new ScriptEngineManager();
   ScriptEngine engine= manager.getEngineByName("nashorn");
 String script=" var name='hussein alrubaye';name";
 
 try {
Object result=	engine.eval(script);
System.out.println(result);
} catch (ScriptException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
	}

}
