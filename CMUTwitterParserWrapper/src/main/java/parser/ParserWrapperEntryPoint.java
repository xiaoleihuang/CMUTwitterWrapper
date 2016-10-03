package parser;

import java.io.IOException;
import py4j.GatewayServer;

/**
 * Entry point of wrapper
 * @author xiaolei
 */
public class ParserWrapperEntryPoint {
	private ParserWrapper wrapper;
	
	/**
	 * Initialize
	 * @throws IOException 
	 */
	public ParserWrapperEntryPoint() throws IOException{
		wrapper = new ParserWrapper();
	}
	
	/**
	 * Return the wrapper
	 * @return wrapper of parser
	 */
	public ParserWrapper getWrapper(){
		return wrapper;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GatewayServer gatewayServer = new GatewayServer(new ParserWrapperEntryPoint());
		gatewayServer.start();
		System.out.println("Gateway Server Started");
	}
}