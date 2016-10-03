package parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cmu.arktweetnlp.Tagger;
import cmu.arktweetnlp.Tagger.TaggedToken;

/**
 * Wrapper of Parser
 * @author xiaolei
 *
 */
public class ParserWrapper {
	private String modelFilename = "/cmu/arktweetnlp/model.20120919";
	private Tagger tagger;
	public ParserWrapper() throws IOException{
		tagger = new Tagger();
		tagger.loadModel(modelFilename);
	}
	
	/**
	 * Parse one well formatted tweet
	 * @param tweet
	 * @return a list of tokens
	 */
	public List<Pair<String, String>> parse1tweet(String tweet){
		List<TaggedToken> taggedTokens = tagger.tokenizeAndTag(tweet);
		List<Pair<String, String>> result = new ArrayList<Pair<String, String>>();
		
		for(TaggedToken token : taggedTokens){
			result.add(new Pair<String, String>(token.token, token.tag));
		}
		return result;
	}
	
	/**
	 * Parse a list of well-formatted tweets
	 * @param tweets
	 * @return a list of lists of tokens
	 */
	public List<List<Pair<String, String>>> parseNtweets(List<String> tweets){
		List<List<Pair<String, String>>> result = new ArrayList<List<Pair<String, String>>>();
		for(String tweet : tweets){
			result.add(this.parse1tweet(tweet));
		}
		return result;
	}
	
	/**
	 * The object to save tokens, because TaggedToken class does not
	 * provide API to access value, like getXXX(), so Python can not 
	 * get its value directly.
	 * @author xiaolei
	 *
	 * @param <K>
	 * @param <V>
	 */
	class Pair<K,V> implements Map.Entry<K, V>{
		private final K key;
	    private V value;
	    
		public Pair(K key, V value){
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		public V getValue() {
			// TODO Auto-generated method stub
			return this.value;
		}

		public V setValue(V value) {
			// TODO Auto-generated method stub
			this.value = value;
			return value;
		}
	}
}
