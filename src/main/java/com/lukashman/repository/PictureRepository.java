package com.lukashman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lukashman.model.Picture;

@RepositoryRestResource(collectionResourceRel = "picture", path = "picture")
public interface PictureRepository extends JpaRepository<Picture, Long> {

}
