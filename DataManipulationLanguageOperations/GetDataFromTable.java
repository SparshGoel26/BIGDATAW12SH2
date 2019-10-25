package DataManipulationLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class GetDataFromTable {
	public static void main(String[] args) throws IOException {
		Configuration c = HBaseConfiguration.create(); // Instantiate
														// Configuration class
		HTable table = new HTable(c, "Employee"); // Instantiate HTable class
		Get g = new Get(Bytes.toBytes("001")); // Instantiate Get class
		Result result = table.get(g); // Read the data
		// Read values from Result class object
		byte[] value = result.getValue(Bytes.toBytes("OfficialDetails"),
				Bytes.toBytes("Name"));
		String name = Bytes.toString(value); // Print the values
		System.out.println("Name: " + name);
	}
}