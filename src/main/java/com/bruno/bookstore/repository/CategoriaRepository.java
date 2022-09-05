/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.bookstore.repository;

import com.bruno.bookstore.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author herison.lopes
 */
@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>{
    
}
