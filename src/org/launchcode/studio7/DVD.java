package org.launchcode.studio7;

public class DVD extends BaseDisk implements OpticalDisk {

    public DVD(String aTitle, int aSize, String aType, int someContents) {
        super(aTitle, aSize, aType, someContents);
    }

    @Override
    public boolean spinDisk(int speed) {
        if (getRunning()) {
            System.out.println("Disk already running");
            return false;
        } else if (speed > 1600 || speed < 570) {
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
        int defaultSpeed = 1200;
        return spinDisk(defaultSpeed);
    }

    @Override
    public void reportDiskInfo() {
        System.out.println("\nTitle: " + getTitle() + "\nSize: " + getSize() + " MB" + "\nContents: " + getContents() + " MB" + "\nDisk Type: " + getType());
    }
}
