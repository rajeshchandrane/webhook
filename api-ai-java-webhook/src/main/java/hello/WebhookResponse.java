package hello;

public class WebhookResponse {
    private final String speech;
    private final String displayText;

    private final String source = "java-webhook";

    public WebhookResponse(String obj) {
        this.speech = "Java Developer";
        this.displayText = "May I help you?";
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
}
