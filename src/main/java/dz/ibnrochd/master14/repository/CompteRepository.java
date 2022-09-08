package dz.ibnrochd.master14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Integer>{

}
