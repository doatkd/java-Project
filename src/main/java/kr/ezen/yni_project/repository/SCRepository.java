package kr.ezen.yni_project.repository;

import kr.ezen.yni_project.domain.SC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SCRepository extends JpaRepository<SC,Integer>, JpaSpecificationExecutor<SC> {
}
