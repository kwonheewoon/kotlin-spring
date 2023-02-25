package org.khw.kotlinspring.category.controller

import lombok.RequiredArgsConstructor
import org.khw.kotlinspring.category.domain.dto.CategoryApiDto
import org.khw.kotlinspring.category.domain.dto.CategoryDto
import org.khw.kotlinspring.category.domain.dto.CategoryViewApiDto
import org.khw.kotlinspring.category.domain.entity.CategoryEntity
import org.khw.kotlinspring.category.service.CategoryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
class CategoryRestController(val categoryService: CategoryService) {

    @GetMapping("")
    fun findAllCategory() : List<CategoryViewApiDto>{
        return categoryService.findAllCategory()
    }

    @PostMapping("")
    fun saveCategory(@RequestBody categoryDto: CategoryDto) : CategoryViewApiDto {
        return categoryService.saveCategory(categoryDto)
    }
}