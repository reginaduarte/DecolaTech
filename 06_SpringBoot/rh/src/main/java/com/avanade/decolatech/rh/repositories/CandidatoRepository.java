package com.avanade.decolatech.rh.repositories;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

import com.avanade.decolatech.rh.entities.Candidato;

public interface CandidatoRepository extends JpaAttributeConverter<Candidato, String>{

}
