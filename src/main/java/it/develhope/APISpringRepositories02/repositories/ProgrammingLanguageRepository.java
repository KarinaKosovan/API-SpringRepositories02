package it.develhope.APISpringRepositories02.repositories;

import it.develhope.APISpringRepositories02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages",
        collectionResourceDescription = @Description("This is the repository for Programming Languages managing"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
