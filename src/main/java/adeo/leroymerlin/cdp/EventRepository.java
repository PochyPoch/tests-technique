package adeo.leroymerlin.cdp;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface EventRepository extends Repository<Event, Long> {

    void save(Event event);

    void delete(Long eventId);

    List<Event> findAllBy();
}
