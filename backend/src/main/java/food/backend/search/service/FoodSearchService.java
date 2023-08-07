package food.backend.search.service;

import food.backend.search.dao.FoodDetailDAO;
import food.backend.search.dao.FoodListDAO;
import food.backend.search.dto.FoodDetailDTO;
import food.backend.search.dto.FoodListDTO;
import food.backend.search.model.KeywordAndNutrient;
import food.backend.search.dao.FoodKeywordDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class FoodSearchService {

    private final FoodKeywordDAO foodKeywordDAO;
    private final FoodListDAO foodListDAO;
    private final FoodDetailDAO foodDetailDAO;

    public List<String> getFoodByNameContaining(String keyword) {
        return foodKeywordDAO.getFoodByNameContaining(keyword);
    }

    public List<FoodListDTO> getFoodListByNameContaining(KeywordAndNutrient params) {
        return foodListDAO.getFoodListByNameContaining(params);

    }

    public FoodDetailDTO getFoodDetailById(Long foodId) {
        return foodDetailDAO.getFoodDataById(foodId);
    }



}