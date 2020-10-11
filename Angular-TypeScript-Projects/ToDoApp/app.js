let TODO_ITEMS = [];
const STORAGE_KEY = "TODO_ITEMS";

// console.log(`TODO_ITEMS Initial --> ${TODO_ITEMS.length} `);

function saveToDo(todoItem) {
    TODO_ITEMS.push(todoItem);

    const localStorageData = JSON.stringify(TODO_ITEMS);

    localStorage.setItem(STORAGE_KEY, localStorageData);

    // console.log("todo item --> ", todoItem);
    // console.log(`local storage data --> ${localStorageData}`);
}

function loadTodoData() {
    const localData = localStorage.getItem(STORAGE_KEY);

    const todoItem = localData ? JSON.parse(localData) : [];

    TODO_ITEMS.push(...todoItem);

    loadList();
}

function loadList() {
    let listStructure = "";

    for (let index = 0; index < TODO_ITEMS.length; index++) {
        const todo = TODO_ITEMS[index];

        const listItem = `
        <div class="todo-item">
                <div class="todo-title">
                    ${todo.name}
                </div>
                <div class="todo-action">
                    <button>Mark Complete</button>
                    <button>Delete</button>
                </div>
            </div>
        `;
        listStructure += listItem;
    }
    document.querySelector("#item-list").innerHTML = listStructure;
}

function addTodoItem() {
    const todoInput = document.querySelector("#todo-title");
    const todoTitle = todoInput.value;

    const createdAt = new Date().toJSON();

    const todoItem = {
        name: todoTitle,
        createdAt,
        isCompleted: false,
        isDeleted: false,
    };

    // TODO_ITEMS.push(todoItem);

    // console.log(`TODO_ITEMS After --> ${TODO_ITEMS.length} `);
    todoInput.value = "";

    saveToDo(todoItem);

    loadList();
    // console.log(todoTitle);
}

loadTodoData();
