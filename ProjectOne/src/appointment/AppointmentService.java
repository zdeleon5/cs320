package appointment;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private final Map<String, Appointment> appointments = new HashMap<>();

    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null.");
        }
        if (appointments.containsKey(appointment.getAppointmentId())) {
            throw new IllegalArgumentException("Appointment with this ID already exists.");
        }
        appointments.put(appointment.getAppointmentId(), appointment);
    }

    public void deleteAppointment(String appointmentId) {
        if (appointmentId == null || appointmentId.isEmpty()) {
            throw new IllegalArgumentException("Appointment ID cannot be null or empty.");
        }
        if (!appointments.containsKey(appointmentId)) {
            throw new IllegalArgumentException("No appointment found with this ID.");
        }
        appointments.remove(appointmentId);
    }
}
