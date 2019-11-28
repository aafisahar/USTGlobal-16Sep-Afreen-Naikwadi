function myfun(){
    const a = document.getElementById("password").nodeValue;
    if(a.length < 6){
        document.getElementById("password").innerHTML="**Password length must be greater than 6 characters";
        return false;
    }
}