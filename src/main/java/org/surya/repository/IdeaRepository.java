package org.surya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.surya.dto.IdeaDto;



public interface IdeaRepository  extends JpaRepository<IdeaDto, Integer> {

}
