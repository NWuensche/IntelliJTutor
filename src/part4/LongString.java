package part4;

public class LongString {

    public String longString = "This is a way too long String which should be splitted onto two lines, so that you can read the whole text without moving your window.";

    public LongString longCall() {
        return this.longCall().longCall().longCall().longCall().longCall().longCall().longCall().longCall().longCall().longCall().longCall();
    }
}
