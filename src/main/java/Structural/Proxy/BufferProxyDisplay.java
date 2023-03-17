package Structural.Proxy;

import java.util.ArrayList;

public class BufferProxyDisplay implements Display{
    private ScreenDisplay screenDisplay;
    private ArrayList<String> buffer = new ArrayList<>();
    private int bufferSize;

    public BufferProxyDisplay(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String contents) {
        buffer.add(contents);

        if(buffer.size()== bufferSize){
            flush();
        }
    }

    public void flush(){
        if(screenDisplay == null){
            screenDisplay = new ScreenDisplay();
        }
        String lines = String.join("\n", buffer);
        screenDisplay.print(lines);
        buffer.clear();
    }
}
