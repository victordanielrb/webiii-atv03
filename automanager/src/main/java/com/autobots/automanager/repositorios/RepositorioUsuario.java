package com.autobots.automanager.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobots.automanager.entitades.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	List<Usuario> findByEmpresaId(Long empresaId);
}
