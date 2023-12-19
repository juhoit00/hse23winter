import React, { useState, useEffect } from 'react';
import TodoList from './TodoList';
import TodoForm from './TodoForm';
import axios from 'axios';
import './App.css';

const App = () => {
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    // Fetch the initial list of todos from the backend when the component mounts
    axios.get('http://localhost:8080/api/todos')
      .then(response => setTodos(response.data))
      .catch(error => console.error('Error fetching todos:', error));
  }, []);

  const handleTodoAdded = (newTodo) => {
    // Add the new todo to the existing list
    setTodos([...todos, newTodo]);
  };

  return (
    <div className="app-container">
      <h1>Todo App</h1>
      <TodoForm onTodoAdded={handleTodoAdded} />
      <TodoList todos={todos} />
    </div>
  );
};

export default App;
