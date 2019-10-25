package DataDefinitionLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DropAllTables {
	public static void main(String[] args) throws IOException {
		Configuration c = HBaseConfiguration.create(); // Instantiate
														// configuration class
		HBaseAdmin ad = new HBaseAdmin(c); // Instantiate HBaseAdmin class
		ad.disableTables("t1");
		ad.deleteTables("t1");
		System.out.println("All the tables are dropped");
	}
}