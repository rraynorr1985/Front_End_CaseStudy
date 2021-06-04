function validate()
{
    if(document.getElementById('namew').value == '')
    {
        alert("Enter your name");
        document.myForm.name.focus();   
        return false;
    }
    else{
        var fname = document.getElementById('namew').value;
    }

    if(document.getElementById('email').value == '')
    {
        alert("Enter your email");
        document.myForm.email.focus();
        return false;  
    }
    else {
        if(emailRegex())
        {
            var email = document.getElementById('email').value
        }
        else
        {
            return false;
        }
        
    }
    if(document.getElementById('passw').value == '')
    {
        alert("enter password");
        document.myForm.pass.focus();
        return false;
    }
    else
    {
        var pass = document.getElementById('passw').value;
        alert("Name: "+ fname + " Email: " + email + " Password: "+ pass);
        return true;
    } 
}
function emailRegex()
{   var email = document.getElementById('email').value;

         atPos = email.indexOf("@");
        dotPos = email.lastIndexOf(".");
        if(atPos <1 || dotPos-atPos <2)
        {
            alert("please Enter correct Email ID(ex: name@domname.com")
            return false;
        }
        else{
            return true;
        }
        
}


function loginvalidation()
{
    if(document.getElementById("email").value == '')
    {
        alert("Please provide your email");
        document.myForm2.email.focus();
        return false;
    }
    if(document.getElementById("passw").value == '')
    {
        alert("Please provide you password");
        document.myForm2.passw.focus();
        return false;
    }
    else{
        if(emailRegex())
        {
            var data = [document.getElementById("email").value, document.getElementById("passw").value]
            alert("Your login is: "+data[0]+" Your password is: "+ data[1]);
             return true;
        }
        else
        {
            return false;
        }
    
        }
     
}

function mouseout()
{
    var img = document.getElementById('logo');
    img.style.width = "50px";
    img.style.heigth = "50px";
}

function mouseenter()
{
    var img = document.getElementById('logo');
    img.style.width = "150px";
    img.style.heigth = "150px";
}

function getValue()
{
    var selected_list = document.getElementsByClassName('custom-select');
    console.log(selected_list[0].value);
    console.log(selected_list[1].value);
    console.log(selected_list[2].value);
    console.log(selected_list[3].value);
    
    var val = document.getElementById('showValue');
    val.innerHTML=selected_list[0].value;
    val = document.getElementById('showValue2');
    val.innerHTML=selected_list[1].value;
    val = document.getElementById('showValue3');
    val.innerHTML=selected_list[2].value;
    val = document.getElementById('showValue4');
    val.innerHTML=selected_list[3].value;
}

function selectAll()
{
    var array = document.getElementsByName('checker');

    for(var i=0;i<array.length;i++)
    {
        if(array[i].type == 'checkbox')
        {
            array[i].checked =true;
        }
    }
}

function unselectAll()
{
    var array = document.getElementsByName('checker');

    for(var a in array)
    {
        if(array[a].type == 'checkbox')
        {
            array[a].checked=false;
        }
    }
}

function feedback()
{
    var array = document.getElementsByName('checker');
    for(var a in array)
    {
        if(array[a].type == 'checkbox')
        {
        if(array[a].checked==true)
        {
        alert("Your site is: "+array[a].value);
        }
        else{continue;}
    }
    else{continue;}
    }
}
