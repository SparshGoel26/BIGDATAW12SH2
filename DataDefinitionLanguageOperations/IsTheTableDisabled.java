package packag;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class IsTheTableDisabled {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create(); // Instantiate
														// configuration class
		HBaseAdmin ad = new HBaseAdmin(c); // Instantiate HBaseAdmin class
		boolean bool = ad.isTableDisabled("FirstTable"); // Verifying weather
															// the
															// table is disabled
		System.out.println(bool);
	}
}