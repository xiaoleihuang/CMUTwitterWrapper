package parser;

import java.io.IOException;
import py4j.GatewayServer;

/**
 * Entry point of wrapper
 * @author xiaolei
 */
public class ParserWrapperEntryPoint {
	private ParserWrapper parserwrapper;
	private TokenizerWrapper tokenizewrapper;
	
	/**
	 * Initialize
	 * @throws IOException 
	 */
	public ParserWrapperEntryPoint() throws IOException{
		parserwrapper = new ParserWrapper();
		tokenizewrapper = new TokenizerWrapper();
	}
	
	/**
	 * Return the parser wrapper
	 * @return wrapper of parser
	 */
	public ParserWrapper getParserWrapper(){
		return this.parserwrapper;
	}
	
	/**
	 * Return the tokenizer wrapper
	 * @return wrapper of tokenizer
	 */
	public TokenizerWrapper getTokenizerWrapper(){
		return this.tokenizewrapper;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GatewayServer gatewayServer = new GatewayServer(new ParserWrapperEntryPoint());
		gatewayServer.start();
		System.out.println("Gateway Server Started");
	}
}