package akbulut.oguzhan.service;

import akbulut.oguzhan.model.TodoData;
import akbulut.oguzhan.model.TodoItem;

public interface ITodoItemService {
    void addItem(TodoItem toAdd);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem toUpdate);

    TodoData getData();

}
