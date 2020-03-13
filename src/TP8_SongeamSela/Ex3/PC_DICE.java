package TP8_SongeamSela.Ex3;

public class PC_DICE {
    String PC_id;
    String status;

    public PC_DICE(String PC_id, String status) {
        this.PC_id = PC_id;
        this.status = status;
    }

    public String getPC_id() {
        return PC_id;
    }

    public void setPC_id(String PC_id) {
        this.PC_id = PC_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
