package DataDefinitionLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class TableExistance {
	public static void main(String args[]) throws IOException {
		Configuration c = HBaseConfiguration.create(); // Instantiate
														// configuration class
		HBaseAdmin ad = new HBaseAdmin(c); // Instantiate HBaseAdmin class
		boolean bool = ad.tableExists("FirstTable"); // Cheking the existance of
													// the table
		System.out.println(bool);
	}
}