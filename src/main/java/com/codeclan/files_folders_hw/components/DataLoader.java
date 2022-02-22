package com.codeclan.files_folders_hw.components;

import com.codeclan.files_folders_hw.models.File;
import com.codeclan.files_folders_hw.models.Folder;
import com.codeclan.files_folders_hw.models.User;
import com.codeclan.files_folders_hw.repositories.FileRepository;
import com.codeclan.files_folders_hw.repositories.FolderRepository;
import com.codeclan.files_folders_hw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {
        User user = new User("Andrew");
        userRepository.save(user);

        Folder folder1 = new Folder("Homework", user);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Games", user);
        folderRepository.save(folder2);

        File file1 = new File("DataLoader", "java", 4, folder1);
        fileRepository.save(file1);

        File file2 = new File("Python", "py", 7, folder1);
        fileRepository.save(file2);

        File file3 = new File("Tetris", "exe", 2, folder2);
        fileRepository.save(file3);

        File file4 = new File("Super Mario", "exe", 3, folder2);
        fileRepository.save(file4);
    }
}
