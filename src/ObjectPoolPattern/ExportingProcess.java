package ObjectPoolPattern;

public class ExportingProcess {

    private long processNo;

    public ExportingProcess (long processNo) {
        this.processNo = processNo;

        System.out.println("Object with process number " + processNo + " was created.");
    }

    public long getProcessNo() {
        return processNo;
    }
}
