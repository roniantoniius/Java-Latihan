package roniantonius.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.repository.CategoryRepository;

@Component
public class CategoryService {
    @Getter
    private CategoryRepository categoryRepository;

    // melakukan setter dependency injection (DI) namun tanpa public constructor, melainkan dengan setter method
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
}
