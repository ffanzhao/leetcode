package comyifan.hash.table;

import java.util.ArrayList;
import java.util.List;

public class Encode_and_Decode_TinyURL {

	
	public static List<String> urls = new ArrayList<String>();  
    
    // Encodes a URL to a shortened URL.  
    public String encode(String longUrl) {  
        urls.add(longUrl);  
        return String.valueOf(urls.size() - 1);  
    }  
  
    // Decodes a shortened URL to its original URL.  
    public String decode(String shortUrl) {  
        int index = Integer.parseInt(shortUrl);  
        return urls.get(index);  
    }  

}
