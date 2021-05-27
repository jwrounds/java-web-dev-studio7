package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myFirstCd = new CD("American Idiot - Green Day", 800, "Compact Disc", 400);
        DVD myFirstDvd = new DVD ("Star Wars: A New Hope", 4700, "Digital Video Disc", 3000);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myFirstCd.spinDisk(500);
        myFirstDvd.spinDisk(1500);

        myFirstCd.writeDisk(200);
        myFirstCd.writeDisk(250);
        myFirstDvd.writeDisk(1500);
        myFirstDvd.writeDisk(2000);

        myFirstCd.readDisk();
        myFirstDvd.readDisk();

        myFirstCd.reportDiskInfo();
        myFirstDvd.reportDiskInfo();
    }
}
