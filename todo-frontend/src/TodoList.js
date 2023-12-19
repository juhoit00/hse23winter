import React, { useState, useEffect } from 'react';
import api from './api';
import './TodoList.css';

const TodoList = () => {
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    // Fetch the list of todos from the backend
    api.get('/todos')
      .then(response => setTodos(response.data))
      .catch(error => console.error('Error fetching todos:', error));
  }, []); // Empty dependency array ensures the effect runs only once

  return (
    <div className="todo-list-container">
      <h2>Todo List</h2>
      <ul className="todo-list">
        {todos.map(todo => (
          <li key={todo.id} className={`todo-item ${todo.completed ? 'completed' : 'pending'}`}>
            <span>{todo.title}</span>
            <span>{todo.description}</span>
            <span>{todo.completed ? 'Completed' : 'Pending'}</span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TodoList;
