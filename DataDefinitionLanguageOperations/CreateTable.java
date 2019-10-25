package DataDefinitionLanguageOperations;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class CreateTable {
	public static void main(String[] args) throws IOException {
		HBaseConfiguration hc = new HBaseConfiguration(new Configuration());
		HTableDescriptor ht = new HTableDescriptor("Student");

		ht.addFamily(new HColumnDescriptor("ColumnFamily1"));
		ht.addFamily(new HColumnDescriptor("ColumnFamily2"));
		System.out.println("connecting");
		HBaseAdmin hba = new HBaseAdmin(hc);

		System.out.println("Creating Table");
		hba.createTable(ht);
		System.out.println("Done......");
	}
}