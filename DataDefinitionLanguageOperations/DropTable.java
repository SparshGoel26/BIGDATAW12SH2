package DataDefinitionLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DropTable {
	public static void main(String[] args) throws IOException {
		Configuration c = HBaseConfiguration.create(); // Instantiate
														// configuration class
		HBaseAdmin ad = new HBaseAdmin(c); // Instantiate HBaseAdmin class
		ad.disableTable("FirstTable"); // disable the table
		ad.deleteTable("FirstTable"); // Delete the table
		System.out.println("Table is droped with name FirstTable");
	}
}