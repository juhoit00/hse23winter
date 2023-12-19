import React, { useState } from 'react';
import api from './api';
import './TodoForm.css';

const TodoForm = ({ onTodoAdded }) => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const handleAddTodo = () => {
    // Create a new todo object
    const newTodo = {
      title,
      description,
      completed: false,
    };

    // Send a POST request to add the new todo
    api.post('/todos', newTodo)
      .then(response => {
        // Invoke the callback to inform the parent component about the new todo
        onTodoAdded(response.data);
        // Clear the form fields
        setTitle('');
        setDescription('');
      })
      .catch(error => console.error('Error adding todo:', error));
  };

  return (
    <div className="todo-form-container">
      <h2>Add Todo</h2>
      <div className="form-fields">
        <label>Title:</label>
        <input type="text" value={title} onChange={(e) => setTitle(e.target.value)} />
      </div>
      <div className="form-fields">
        <label>Description:</label>
        <input type="text" value={description} onChange={(e) => setDescription(e.target.value)} />
      </div>
      <button className="add-button" onClick={handleAddTodo}>Add Task</button>
    </div>
  );
};

export default TodoForm;
