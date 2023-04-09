

public class DeclareAndInitializeVariables {
    String motherBoardName;
    int motherBoardSocket;
    double graphicCardGhz;
    char processorType;
    boolean solidStateDrive;

    public DeclareAndInitializeVariables(String motherBoardName, int motherBoardSocket, double graphicCardGhz, char processorType, boolean solidStateDrive) {
        this.motherBoardName = motherBoardName;
        this.motherBoardSocket = motherBoardSocket;
        this.graphicCardGhz = graphicCardGhz;
        this.processorType = processorType;
        this.solidStateDrive = solidStateDrive;
    }

    @Override
    public String toString() {
        return "DeclareAndInitializeVariables{" +
                "motherBoardName='" + motherBoardName + '\'' +
                ", motherBoardSocket=" + motherBoardSocket +
                ", graphicCardGhz=" + graphicCardGhz +
                ", processorType=" + processorType +
                ", solidStateDrive=" + solidStateDrive +
                '}';
    }

    public static void main(String[] args) {
        DeclareAndInitializeVariables printValue =
                new DeclareAndInitializeVariables("Gigabyte", 1151, 5.1, 'i', true );
        System.out.println(printValue);

    }
}
