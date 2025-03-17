const input = document.getElementById("input");
const container = document.getElementById("container");
const btn = document.getElementById("btn");

// Function to validate and add a new message
function valid() {
    const inputText = input.value;
    if (inputText === "") {
        alert("Please enter a valid message.");
        return;
    } else {
        const newMessage = document.createElement("p");

        newMessage.textContent = inputText;
        container.appendChild(newMessage);

        const remove = document.createElement("button");
        remove.classList.add("remove-btn");

        remove.textContent = "Delete";
        newMessage.appendChild(remove);

        remove.addEventListener("click", () => {
            remove.parentElement.remove();

        });



        const edit = document.createElement('button')
        edit.textContent = 'Edit';
        edit.classList.add(edit - btn);
        newMessage.appendChild(edit)

        edit.addEventListener('click', () => {
            document.getElementById('demo').focus()
        })

        let messages = JSON.parse(localStorage.getItem("messages")) || [];

        messages.push(inputText);

        localStorage.setItem("messages", JSON.stringify(messages));

        input.value = "";
    }
}

// Function to display all messages from localStorage
function displayMessages() {
    const messages = JSON.parse(localStorage.getItem("messages")) || [];
    messages.forEach((message) => {
        const newMessage = document.createElement("p");
        newMessage.textContent = message;
        container.appendChild(newMessage);
    });
}

// Event listener for the button click
btn.addEventListener("click", () => {
    valid();
});

// Display messages when the page loads
window.addEventListener("load", () => {
    displayMessages();
});

input.addEventListener('keydown', (e) => {
    if (e.key === 'Enter') {
        valid();
    }
})

const tap=document.getElementById('tap')
tap.addEventListener('click',()=>{
    window.open('/welcome.html','_self')

})