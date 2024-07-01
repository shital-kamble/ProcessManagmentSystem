package ManagementSystem;


import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		 ProcessManager processManager = new ProcessManager();

	        // Add processes
	        processManager.addProcess(new Process(1, "Process 1", "Pending"));
	        processManager.addProcess(new Process(2, "Process 2", "Running"));
	        processManager.addProcess(new Process(3, "Process 3", "Completed"));
	        
	        System.out.println("All Process:" +processManager.listAllProcesses());
	        // Remove process
	        boolean isRemoved = processManager.removeProcess(1);
	        System.out.println("Process removed: " + isRemoved);

	        // Search for a process
	        Process process = processManager.searchProcess(2);
	        if (process != null) {
	            System.out.println("Process found: " + process.getProcessName());
	        } else {
	            System.out.println("Process not found.");
	        }

	        // List all processes
	        List<Process> allProcesses = processManager.listAllProcesses();
	        System.out.println("Aftee Removing All processes:");
	        for (Process p : allProcesses)
	        {
	            System.out.println(p.getProcessName());
	        }

	        // Update process status
	        boolean isUpdated = processManager.updateProcessStatus(2, "Running");
	        System.out.println("Process status updated: " + isUpdated);

	        // Add pending and completed process history
	        processManager.addPendingProcess(new Process(1, "Process 1", "Pending"));
	        processManager.addCompletedProcess(new Process(3, "Process 3", "Completed"));

	        // Get pending process history
	        List<Process> pendingProcesses = processManager.getPendingProcessesHistory();
	        System.out.println("Pending processes history:");
	        for (Process p : pendingProcesses)
	        {
	            System.out.println(p.getProcessName());
	        }

	        // Get completed process history
	        List<Process> completedProcesses = processManager.getCompletedProcessesHistory();
	        System.out.println("Completed processes history:");
	        for (Process p : completedProcesses) {
	            System.out.println(p.getProcessName());
	        }
	    }}
