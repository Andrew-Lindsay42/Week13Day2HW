package com.codeclan.files_folders_hw.repositories;

import com.codeclan.files_folders_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
