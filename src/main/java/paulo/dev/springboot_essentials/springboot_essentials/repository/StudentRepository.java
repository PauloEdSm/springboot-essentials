package paulo.dev.springboot_essentials.springboot_essentials.repository;

import org.springframework.data.repository.CrudRepository;
import paulo.dev.springboot_essentials.springboot_essentials.model.Student;

import java.util.List;

public interface StudentRepository extends CrudRepository <Student, Long> {
    List<Student> findByNameIgnoreCaseContaining(String name);
}
