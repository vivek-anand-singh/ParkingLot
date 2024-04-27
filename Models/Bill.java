import java.sql.Date;
import java.util.List;



public class Bill {
    private long id;
    private Ticket ticket;
    private Date exitTime;
    private long amount;
    private Status status;

    public Bill(long id, Ticket ticket, Date exitTime, long amount, List<Payment> payment, Status status) {
        this.id = id;
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.amount = amount;
        this.payment = payment;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private List<Payment> payment;
}
