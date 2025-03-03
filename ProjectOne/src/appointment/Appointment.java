package appointment;

import java.util.Date;

public class Appointment {
    private final String appointmentId;
    private Date appointmenDate;
    private String description;

    public Appointment(String appointmentId, Date appointmenDate, String description) {
        if (appointmentId == null || appointmentId.length() > 10 ) {
            throw new IllegalArgumentException("Appointment ID cannot be null, empty, or longer than 10 characters.");
        }

        if (appointmenDate == null || appointmenDate.before(new Date())) {
            throw new IllegalArgumentException("Appointment date cannot be null or in the past.");
        }

        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description cannot be null, empty, or longer than 50 characters.");
        }

        this.appointmentId = appointmentId;
        this.appointmenDate = appointmenDate;
        this.description = description;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmenDate() {
        return appointmenDate;
    }

    public String getDescription() {
        return description;
    }

    public void setAppointmenDate(Date appointmenDate) {
        if (appointmenDate == null || appointmenDate.before(new Date())) {
            throw new IllegalArgumentException("Appointment date cannot be null or in the past.");
        }
        this.appointmenDate = appointmenDate;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description cannot be null, empty, or longer than 50 characters.");
        }
        this.description = description;
    }
}