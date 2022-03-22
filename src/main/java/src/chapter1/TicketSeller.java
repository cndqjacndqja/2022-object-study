package src.chapter1;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        if (audience.hasInvitation()) {
            audience.changeInvitation(getTicketOffice().getTickets());
            return;
        }
        buy(audience);
    }

    private void buy(Audience audience) {
        Ticket ticket = getTicketOffice().getTickets();
        audience.buy(ticket);
        getTicketOffice().plusAmount(ticket.getFee());
    }
}
