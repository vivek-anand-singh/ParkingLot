import java.sql.Date;

public class Payment {
    private long id;
    private long amount;
    private Date paymentTime;
    private PaymentMode paymentMode;
    private Status status;

    public Payment(long id, long amount, Date paymentTime, PaymentMode paymentMode, Status status) {
        this.id = id;
        this.amount = amount;
        this.paymentTime = paymentTime;
        this.paymentMode = paymentMode;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
