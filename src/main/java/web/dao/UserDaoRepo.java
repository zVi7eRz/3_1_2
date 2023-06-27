package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.User;
@Repository
public interface UserDaoRepo extends JpaRepository<User, Long> {
}
