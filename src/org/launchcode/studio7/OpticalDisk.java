package org.launchcode.studio7;

public interface OpticalDisk {

    boolean spinDisk(int speed);
    boolean writeDisk(int dataSum);
    boolean readDisk();
    void reportDiskInfo();

}
