package com.fixnow.todoappch8.todoapp

import com.fixnow.todoappch8.TodoViewModel
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class TodoViewModelTest {
    // The system under test recreated before each test
    private lateinit var viewModel: TodoViewModel

    @Before
    fun setUp(){
        viewModel = TodoViewModel()
    }

    @Test
    fun addTask_withValidTitle_appearsInList(){
        // Arrange - the setUp() already created an empty ViewModel

        // Act-- call the function we want to test
        viewModel.addTask("Buy Groceries")

        // Assert - check the result
        assertEquals(1, viewModel.getTaskCount())
        assertTrue(viewModel.containsTask("Buy Groceries"))
    }

    @Test
    fun addTask_withValidTitle_appearsInList_ExtraChallenge(){

        viewModel.addTask("Do Homework")

        assertEquals(1, viewModel.getTaskCount())
        assertTrue(viewModel.containsTask("Do Homework"))
    }


}