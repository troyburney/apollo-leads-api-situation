package online.softwareshinobi.kanbanflow.apollo;

import jakarta.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = {SQLException.class})
public class ApolloContactService {

    ApolloContactRepository apolloContactRepository;

    @Autowired
    public ApolloContactService(ApolloContactRepository apolloContactRepository) {

        this.apolloContactRepository = apolloContactRepository;

    }

    public ApolloContact save(ApolloContact project) {

        return this.apolloContactRepository.save(project);

    }

    public List<ApolloContact> findAll() {

        return this.apolloContactRepository.findAll();

    }

    public ApolloContact findById(Long id) {

        return this.apolloContactRepository.findById(id).orElse(null);

    }

    public void delete(Long id) {

        this.apolloContactRepository.deleteById(id);

    }

}
