package project.hotel.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import project.hotel.Model.workflowNotification;

public interface workflowNotificationRepository extends JpaRepository<workflowNotification, Integer> {
    List<workflowNotification> findTop40ByAudienceOrderByCreatedAtDesc(String audience);

    @Transactional
    long deleteByAudience(String audience);
}
