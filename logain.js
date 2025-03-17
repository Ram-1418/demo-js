const username =document.getElementById('username')
const password=document.getElementById('password')
const loginForm =document.getElementById('loginForm')




function validation() {
 
    const isvalid=true;

    const user =document.getElementById('username').value 
    if (user.length<6) {
        alert('usernamr must be 6 character')
        isvalid=false;
    }
    const pass=password.value 
    if (pass.length < 8) {
        alert('password must be 8 character')
        isvalid=false;
    }
    
   return isvalid;
}



loginForm.addEventListener('submit',(e)=>{
    e.preventDefault()
    if (validation()) {
        window.open('/','_self')
    }
})