package src.chapter1;

public class TicketSeller {
    private TicketOffice ticketOffice;

    private TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    private TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
