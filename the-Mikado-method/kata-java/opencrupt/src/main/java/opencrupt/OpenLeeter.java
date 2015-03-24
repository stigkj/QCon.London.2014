package opencrupt;

import lib.Leeter;

public class OpenLeeter implements Leeter {
	@Override
    public String leet(String message) {
		return message.replace('e', 'o');
	}
}
