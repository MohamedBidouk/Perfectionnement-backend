package com.example.stageperfectionnementbackend.restController;

import com.example.stageperfectionnementbackend.entities.Category;
import com.example.stageperfectionnementbackend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class CatergoryRestController {
    @Autowired
    CategoryRepository categoryRepository;
    @RequestMapping(method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    @RequestMapping(value = "/{idCat}")
    public Category getCategoryById(@PathVariable("idCat")Long idCat){
        return categoryRepository.findById(idCat).get();
    }
    @RequestMapping(method = RequestMethod.POST)
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
    @RequestMapping(value = "/{idCat}",method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable("idCat")Long idCat){
        categoryRepository.deleteById(idCat);
    }
    @RequestMapping(value = "/{idCat}", method = RequestMethod.PUT)
    public Category updateCategory(@PathVariable("idCat")Long idCat, @RequestBody Category category){
        Category category1 = categoryRepository.findById(idCat).get();
        category1.setName(category.getName());
        category1.setDescription(category.getDescription());
        return categoryRepository.save(category1);
    }
}
