package CreationalPatterns;

import CreationalPatterns.ComputerFactory;
import CreationalPatterns.Computer;
public class TestFactory {

	public static void main(String[] args) {
			Computer pc = ComputerFactory.getComputer("pc","4 GB","1000 GB","2.6 GHz");
			Computer server = ComputerFactory.getComputer("server","32 GB","5 TB","4.9 GHz");
			System.out.println("Factory PC Config:"+pc);
			System.out.println("Factory Server Config:"+server);

	}

}