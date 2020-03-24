package managers;

import java.io.IOException;

import properties.getReportConfigPath;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager= new FileReaderManager();
	private static getReportConfigPath configFileReader;
	
	private FileReaderManager()
	{
		
	}
	public static FileReaderManager getInstance()
	{
		return fileReaderManager;
	}
	public getReportConfigPath getConfigReader() throws IOException
	{
		return ( configFileReader==null)?new getReportConfigPath():configFileReader;  
	}
}
