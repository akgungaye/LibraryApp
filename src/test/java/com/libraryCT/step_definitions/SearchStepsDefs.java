package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class SearchStepsDefs {

    @Then("user should be able to search following categories books")
    public void user_should_be_able_to_search_following_categories_books(List<String> searchTypes) {
        Assert.assertTrue(new BooksPage().compareSearchResults(new BooksPage().categoriesDropdown,searchTypes));
    }

}
