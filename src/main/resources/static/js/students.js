/* Shopping List Exercise

1. Toggles the .done class if user clicks on the list item

2. Add delete button next to each list item

3. When adding a new list item, the delete button is automatically added

*/

var userInput, enterBtn, shoppingList, listItems, deleteBtns;

userInput = document.getElementById('user-input');
enterBtn = document.getElementById('enter');
shoppingList = document.getElementById('list');
listItems = document.getElementsByTagName('li');
deleteBtns = document.getElementsByClassName('delete-btn');


// Create list item, which contains user input value and delete button
function createListItem() {
    // 1. create <li> and <button> element
    var li = document.createElement("li");
    var deleteBtn = document.createElement('button');

    // 2. add class name to the elements
    li.className = 'list-item';
    deleteBtn.className = 'btn delete-btn'

    // 3. add event listener to both elements
    li.addEventListener('click', lineThroughItem);
    deleteBtn.addEventListener('click', removeItem);

    // 4 append text node for both elements
    li.appendChild(document.createTextNode(userInput.value));
    deleteBtn.appendChild(document.createTextNode('X'));

    // 5. append button to li, and li to ul
    li.appendChild(deleteBtn);
    shoppingList.appendChild(li);

    // 6. clear user input
    userInput.value = "";
}

// Add item to shopping list when clicking add button
function addListAfterClick() {
    if (userInput.value.trim()) {
       createListItem();
    }
}

// Add item to shopping list when pressing enter key
function addListAfterEnter(event) {
    if (userInput.value.trim() && event.keyCode === 13) {
        createListItem();
    }
}

// Remove item from shopping list
function removeItem(event) {
    shoppingList.removeChild(event.target.parentElement);
}

// line through item
function lineThroughItem(event) {
   event.target.classList.toggle('done');
}

enterBtn.addEventListener('click', addListAfterClick);

userInput.addEventListener('keypress', addListAfterEnter);

// add event listener to the already existing list items and delete buttons
for (var i = 0; i < deleteBtns.length; i++) {
    listItems[i].addEventListener("click", lineThroughItem);
    deleteBtns[i].addEventListener("click", removeItem);
}