package com.example.manytoooneDemo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ItemsRepository extends JpaRepositoryImplementation<Items, Integer> {

}
