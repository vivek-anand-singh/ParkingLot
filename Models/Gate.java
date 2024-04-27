public class Gate {
    private long id;
    private int number;
    private Status status;
    private Operator operator;
    private GateType type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Gate(long id, int number, Status status, Operator operator, GateType type) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.operator = operator;
        this.type = type;
    }
}
