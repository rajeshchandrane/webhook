package Zwayam;

import java.util.ArrayList;

public class WebhookResponse {
    private final String speech;
    private final String displayText;
    private final Object data;
    private final String contextOut;
    private final String source;

    public WebhookResponse() {
        this.speech = "hello";
        this.displayText = "hai";
        this.data = "welcome to zwayam";
        this.contextOut = "welcome to zwayam" ;
        this.source = "Zwayam";
    }

    public String getSpeech() {
        return speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public String getSource() {
        return source;
    }
    public Object getData(){
    	return data;
    }
    public String getContext(){
    	return contextOut;
    }
}
