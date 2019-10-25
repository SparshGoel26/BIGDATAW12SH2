package DataDefinitionLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class EnableTable {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create(); // Instantiate
														// configuration class
		HBaseAdmin ad = new HBaseAdmin(c); // Instantiate HBaseAdmin class
		boolean bool = ad.isTableEnabled("FirstTable"); // check whether the table
														// is enabled
		if (!bool) {
			ad.enableTable("FirstTable");
			System.out.println("Table is Enabled"); // Enable the table using
													// HBaseAdmin object
		}
	}
}