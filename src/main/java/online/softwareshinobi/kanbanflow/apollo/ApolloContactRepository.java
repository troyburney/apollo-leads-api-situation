package online.softwareshinobi.kanbanflow.apollo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApolloContactRepository extends JpaRepository<ApolloContact, Long> {

    Optional<ApolloContact> findByIdAllIgnoreCase(Long id);

}
