# Where do we start?

1. I need to make the UI. Start with a mock UI and build later on.

2. How are we storing the data?
   Use variables => store as an array of the todo

3. What id the structure of storing data?
   What are the fields? name, isCompleted, isDeleted, createdAt

## Process

### Adding Todo

1. The user enters todo title
2. The user preses save
3. Item gets added to the array of items

### List Items

1. Loop through all the items
2. Create HTML Structure

### Persist ToDo Items

#### Save

1. When user creates todo item save to storage

#### Load

1. When page is loaded get data from localstorage
2. Add data to the variable
