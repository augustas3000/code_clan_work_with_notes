package com.example.labday2.SpringRelationshipsFiles.repositories;

import com.example.labday2.SpringRelationshipsFiles.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Jparepository - data access object?
public interface FileRepository extends JpaRepository<File, Long> {

}
