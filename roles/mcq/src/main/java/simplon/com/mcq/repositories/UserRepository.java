package simplon.com.mcq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import simplon.com.mcq.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
