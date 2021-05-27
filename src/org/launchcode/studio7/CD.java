package org.launchcode.studio7;

public class CD extends BaseDisk implements OpticalDisk {

    public CD(String aTitle, int aSize, String aType, int someContents) {
        super(aTitle, aSize, aType, someContents);
    }

    @Override
    public boolean spinDisk(int speed) {
        if (getRunning()) {
            System.out.println("Disk already running");
            return false;
        } else if (speed > 500 || speed < 200) {
            System.out.println("Improper speed for " + getType());
            return false;
        } else {
            setRunning();
            System.out.println("Running disk at" + speed + " rpm");
            return true;
        }
    }

    @Override
    public boolean writeDisk(int data) {
        return addData(data);
    }

    @Override
    public boolean readDisk() {
        if (getRunning()) {
            System.out.println("Reading disk information. Reading " + getContents() + "MB");
            return true;
        }
        System.out.println("Starting disc, cannot read yet.");
        int defaultSpeed = 500;
        return spinDisk(defaultSpeed);
    }

    @Override
    public void reportDiskInfo() {
        System.out.println("\nTitle: " + getTitle() + "\nSize: " + getSize() + " MB" + "\nContents: " + getContents() + " MB" + "\nDisk Type: " + getType());
    }
}
