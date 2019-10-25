package DataDefinitionLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DisableTable {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create(); // Instantiate
														// configuration class
		HBaseAdmin ad = new HBaseAdmin(c); // Instantiate HBaseAdmin class
		boolean bool = ad.isTableDisabled("FirstTable"); // Verifying weather the
														// table is disabled
		if (!bool) {
			ad.disableTable("FirstTable"); // Disabe the table using HBaseAdmin
										// object
			System.out.println("Table is disabled"); // It will print “Table is
														// disabled”
		}
	}
}