package src.chapter1;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hashInvitation() {
        return invitation != null;
    }

    private boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public long hold(Ticket ticket) {
        if (hashInvitation()) {
            setTicket(ticket);
            return 0L;
        }

        minusAmount(ticket.getFee());
        setTicket(ticket);
        return ticket.getFee();
    }
}
