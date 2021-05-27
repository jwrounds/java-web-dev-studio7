package org.launchcode.studio7;

public abstract class BaseDisk {

    private boolean running = false;
    private String title;
    private int size;
    private final String type;
    private int contents;


    public BaseDisk(String aTitle, int aSize, String aType, int someContents) {
        title = aTitle;
        size = aSize;
        type = aType;
        contents = someContents;
    }

    public boolean addData(int data) {
        if (contents + data <= size) {
            contents += data;
            System.out.println("Added " + data + " MBs to disk.");
            return true;
        } else {
            System.out.println("Cannot add data. Disk full.");
            return false;
        }
    }

    public boolean getRunning() { return running; }
    public void setRunning() { running = !running; }
    public String getTitle() { return title; }
    public void setTitle(String someTitle) { title = someTitle; }
    public int getSize() { return size; }
    public void setSize(int someSize) { size = someSize; }
    public String getType() { return type; }
    public int getContents() { return contents; }
    public void setContents(int newContents) { contents = newContents; }
}
