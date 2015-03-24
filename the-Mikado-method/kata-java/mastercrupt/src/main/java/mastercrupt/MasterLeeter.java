package mastercrupt;

public class MasterLeeter implements Leeter {
	@Override
    public String leet(String message) {
		return message.replace('e', '3');
	}
}
