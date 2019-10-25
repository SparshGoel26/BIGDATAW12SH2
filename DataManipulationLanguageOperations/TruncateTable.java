package DataManipulationLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class TruncateTable {

	public static void main(String[] args) throws IOException {
		Configuration config = HBaseConfiguration.create();
		Connection connection = ConnectionFactory.createConnection(config);
		Admin admin = connection.getAdmin();
		admin.disableTables("Employee");
		admin.truncateTable(TableName.valueOf("Employee"), true);
		admin.close();
	}
}
