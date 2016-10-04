package parser;

import java.util.List;

import cmu.arktweetnlp.Twokenize;

/**
 * Wrapper of Tokenizer
 * @author xiaolei
 *
 */
public class TokenizerWrapper {	
	/**
	 * 
	 * @param tweet
	 * @return
	 */
	public List<String> tokenizeRawTweet(String tweet){
		return Twokenize.tokenizeRawTweetText(tweet);
	}
	/**
	 * 
	 * @param tweet
	 * @return
	 */
	public List<String> tokenizesSimpleTweet(String tweet){
		return Twokenize.tokenize(tweet);
	}
}