package org.lompo.dive.deep.ninth.life.processes;

public class ProcessHelper {

	public static void showProcessInfos(int limit) {
		ProcessHandle.allProcesses().limit(limit).forEach(ph -> System.out.println(ph.info()));
	}
	
	public static void main(String[] args) {
		showProcessInfos(10);
	}
	
}
