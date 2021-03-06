package com.vmware.samples.sms;

import com.vmware.apputils.Log;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.SmAppUtil;
import com.vmware.apputils.SmServiceConnection;
import com.vmware.vim.sms.DbConnectionSpec;
import com.vmware.vim.sms.SmPortType;

/**
 *<pre>
 * his sample implements a function that
 * 
 * ul&gt;
 * li&gt; Updates the connectivity information for the vCenter database using SMS API 
 * li&gt; If the user does not specify jdbcUser and jdbcPassword then in dbConnectionSpec value of these fields is &quot;&quot;. 
 * li&gt; If the user does not specify jdbcUrl then dbconnectionSpec is null 
 * /ul&gt;
 * 
 * b&gt;Command: To update the VC database connection information&lt;/b&gt; 
 * un.bat com.vmware.samples.sms.UpdateVcDbConnectionInfo --url &lt;webserviceurl&gt; 
 * -username &lt;username&gt; --password &lt;password&gt;  --jdbcUrl &lt;JDBC url&gt; --jdbcUsername &lt;JDBC username&gt;  --jdbcPassword &lt;JDBC password&gt;
 * 
 * ample Command Line 
 * un.bat com.vmware.samples.sms.UpdateVcDbConnectionInfo --url http://localhost/sdk --username administrator --password password 
 * -ignorecert --jdbcUrl &quot;jdbc:sqlserver://localhost\SQLEXP_VIM;databaseName=VIM_VCDB;integratedSecurity=true&quot; 
 * -jdbcUsername  &quot;&quot; --jdbcPassword &quot;&quot;
 *</pre>
 */

public class UpdateVcDbConnectionInfo {
	private static SmPortType service;
	private static com.vmware.vim.sms.ManagedObjectReference si;

	private static SmAppUtil cb = null;
	Log log = new Log();

	public void execute() throws Exception {
		SmServiceConnection conn = cb.getSmConnection();
		service = conn.getService();

		// Create a db Connection Spec
		DbConnectionSpec dbConnectionSpec = new DbConnectionSpec();

		String username = cb.getOption("jdbcUsername");
		if (username == null) {
			username = "";
		}
		dbConnectionSpec.setUsername(username);

		String password = cb.getOption("jdbcPassword");
		if (password == null) {
			password = "";
		}
		dbConnectionSpec.setPassword(password);

		String url = cb.getOption("jdbcUrl");
		if (url == null) {
			dbConnectionSpec = null;
		} else {
			dbConnectionSpec.setUrl(url);
		}

		service.updateVcDbConnectionInfo(si, dbConnectionSpec);
		System.out
				.println("The connection information for the VC database has been updated.");
	}

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("jdbcUsername", "String", 0,
				"JDBC username", null);
		useroptions[1] = new OptionSpec("jdbcPassword", "String", 0,
				"JDBC password", null);
		useroptions[2] = new OptionSpec("jdbcUrl", "String", 0, "JDBC url",
				null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		UpdateVcDbConnectionInfo obj = new UpdateVcDbConnectionInfo();
		cb = SmAppUtil.initialize("UpdateVcDbConnectionInfo",
				UpdateVcDbConnectionInfo.constructOptions(), args);

		cb.connect();
		obj.execute();
		cb.disConnect();
	}
}
