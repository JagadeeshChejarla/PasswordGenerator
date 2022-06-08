package Com.practice;

public enum Environment {
	    upperCase("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), 
	    lowerCase("abcdefghijklmnopqrstuvwxyz"), 
	    numbers("0123456789"), 
	    characters("!@#$%^&*,)/-|_*/");
	 
	    private String url;
	 
	    Environment(String envUrl) {
	        this.url = envUrl;
	    }
	 
	    public String getUrl() {
	        return url;
	    }
}
