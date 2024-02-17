package org.cloudbus.cloudsim.examples.auction.AuctionExample5;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.auction.auctioneer.Auctioneer;
import org.cloudbus.cloudsim.core.CloudSim;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import org.cloudbus.cloudsim.examples.auction.AuctionExample5.BidderDatacenterFactory5;

/**error
 * An example containing five bidder datacenters and 20 broker bids.
 * 
 * @author Youness Teimoury
 * Blog: http://youness-teimoury.blogspot.com/
 * Email: youness126@gmail.com
 * Created on 2011/9/19
 */

public class AuctionExample5 {

	/**
	 * Creates main() to run this example
	 */
	public static void main(String[] args) {
		Log.printLine("Starting AuctionExample5...");

		try {
			// First step: Initialize the CloudSim package. It should be called
			// before creating any entities.
			int num_user = 1;   // number of grid users
			Calendar calendar = Calendar.getInstance();
			boolean trace_flag = false;  // mean trace events

			// Initialize the CloudSim library
			CloudSim.init(num_user, calendar, trace_flag);
			Auctioneer.initAuctioneer();
			
			// Second step: Create bidder datacenters
			//Datacenters are the resource providers in CloudSim. We need at list one of them to run a CloudSim simulation
			Datacenter datacenter1 = BidderDatacenterFactory5.createDatacenter1();
			Datacenter datacenter2 = BidderDatacenterFactory5.createDatacenter2();
			Datacenter datacenter3 = BidderDatacenterFactory5.createDatacenter3();
			Datacenter datacenter4 = BidderDatacenterFactory5.createDatacenter4();
			Datacenter datacenter5 = BidderDatacenterFactory5.createDatacenter5();
			Datacenter datacenter6 = BidderDatacenterFactory5.createDatacenter6();
			Datacenter datacenter7 = BidderDatacenterFactory5.createDatacenter7();

			//Third step: Create bidder broker
			DatacenterBroker broker1 = BidderBrokerFactory5.createBroker1();
			DatacenterBroker broker2 = BidderBrokerFactory5.createBroker2();
			DatacenterBroker broker3 = BidderBrokerFactory5.createBroker3();
			DatacenterBroker broker4 = BidderBrokerFactory5.createBroker4();
			DatacenterBroker broker5 = BidderBrokerFactory5.createBroker5();
			DatacenterBroker broker6 = BidderBrokerFactory5.createBroker6();
			DatacenterBroker broker7 = BidderBrokerFactory5.createBroker7();
			DatacenterBroker broker8 = BidderBrokerFactory5.createBroker8();
			DatacenterBroker broker9 = BidderBrokerFactory5.createBroker9();
			DatacenterBroker broker10 = BidderBrokerFactory5.createBroker10();
			DatacenterBroker broker11 = BidderBrokerFactory5.createBroker11();
			DatacenterBroker broker12 = BidderBrokerFactory5.createBroker12();
			DatacenterBroker broker13 = BidderBrokerFactory5.createBroker13();
			DatacenterBroker broker14 = BidderBrokerFactory5.createBroker14();
			DatacenterBroker broker15 = BidderBrokerFactory5.createBroker15();
			DatacenterBroker broker16 = BidderBrokerFactory5.createBroker16();
			DatacenterBroker broker17 = BidderBrokerFactory5.createBroker17();
			DatacenterBroker broker18 = BidderBrokerFactory5.createBroker18();
			DatacenterBroker broker19 = BidderBrokerFactory5.createBroker19();
			DatacenterBroker broker20 = BidderBrokerFactory5.createBroker20();

			// Forth step: Starts the simulation
			CloudSim.startSimulation();

			// Final step: Print results when simulation is over
			CloudSim.stopSimulation();

			printCloudletList(broker1.getCloudletReceivedList());
			printCloudletList(broker2.getCloudletReceivedList());
			printCloudletList(broker3.getCloudletReceivedList());
			printCloudletList(broker4.getCloudletReceivedList());
			printCloudletList(broker5.getCloudletReceivedList());
			printCloudletList(broker6.getCloudletReceivedList());
			printCloudletList(broker7.getCloudletReceivedList());
			printCloudletList(broker8.getCloudletReceivedList());
			printCloudletList(broker9.getCloudletReceivedList());
			printCloudletList(broker10.getCloudletReceivedList());
			printCloudletList(broker11.getCloudletReceivedList());
			printCloudletList(broker12.getCloudletReceivedList());
			printCloudletList(broker13.getCloudletReceivedList());
			printCloudletList(broker14.getCloudletReceivedList());
			printCloudletList(broker15.getCloudletReceivedList());
			printCloudletList(broker16.getCloudletReceivedList());
			printCloudletList(broker17.getCloudletReceivedList());
			printCloudletList(broker18.getCloudletReceivedList());
			printCloudletList(broker19.getCloudletReceivedList());
			printCloudletList(broker20.getCloudletReceivedList());

			//Print the debt of each user to each datacenter
			datacenter1.printDebts();
			datacenter2.printDebts();
			datacenter3.printDebts();
			datacenter4.printDebts();
			datacenter5.printDebts();
			datacenter6.printDebts();
			datacenter7.printDebts();
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        

			Log.printLine("AuctionExample5 finished!");
		} catch (Exception e) {
            Log.printLine("Unwanted errors happened");
			e.printStackTrace();
		}
	}

	/**
	 * Prints the Cloudlet objects
	 * @param list  list of Cloudlets
	 */
	private static void printCloudletList(List<Cloudlet> list) {
		int size = list.size();
		Cloudlet cloudlet;

		String indent = "    ";
		Log.printLine();
		Log.printLine("========== OUTPUT ==========");
		Log.printLine("Cloudlet ID" + indent + "STATUS" + indent +
				"Data center ID" + indent + "VM ID" + indent + indent + "Time" + indent + "Start Time" + indent + "Finish Time");

		DecimalFormat dft = new DecimalFormat("###.##");
		for (int i = 0; i < size; i++) {
			cloudlet = list.get(i);
			Log.print(indent + cloudlet.getCloudletId() + indent + indent);

			if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS){
				Log.print("SUCCESS");

				Log.printLine( indent + indent + cloudlet.getResourceId() + indent + indent + indent + cloudlet.getVmId() +
						indent + indent + indent + dft.format(cloudlet.getActualCPUTime()) +
						indent + indent + dft.format(cloudlet.getExecStartTime())+ indent + indent + indent + dft.format(cloudlet.getFinishTime()));
			}
		}

	}
}