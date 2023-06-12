function validarlogin(){
    //definir variables
    var correo;
    var clave;
    correo = document.getElementById('email').value;
    clave = document.getElementById('password').value;
    if(correo=== null || clave === ""){
        alert('El correo y/o la clave no pueden quedar vacios');
        window.location.reload();
        return false;
    }
    else{
        return true;
    }
}
function validarCrearUsuario()
{ 
    var nombreUsuario;
    var apellidoUsuario;
    var correoUsuario;
    var passwordUsuario;
    nombreUsuario = document.getElementById('name').value;
    apellidoUsuario = document.getElementById('apellido').value;
    correoUsuario =  document.getElementById('email').value;
    passwordUsuario = document.getElementById('password').value;
    mensaje="Ningún dato puede quedar vacío";
    mensajes2="El formato del teléfono no es válido";
    console.log(correoUsuario);
    if(nombreUsuario==="" || apellidoUsuario==="" || correoUsuario==="" || passwordUsuario==="" )
    {
        alert('Ningún dato puede quedar vacío');
        window.location.reload();
        return false;
    }
    else{
        return true;
    }
}
function validarCrearEmp(){
    var numDocEmpleado;
    var tipoDocEmpleado;
    var nombreEmpleado;
    var apellidoEmpleado;
    var direccionEmpleado;
    var telefonoEmpleado;
    numDocEmpleado = document.getElementById('numDocEmpleado').value;
    tipoDocEmpleado = document.getElementById('tipoDocEmpleado').value;
    nombreEmpleado = document.getElementById('nombreEmpleado').value;
    apellidoEmpleado = document.getElementById('apellidoEmpleado').value;
    direccionEmpleado = document.getElementById('direccionEmpleado').value;
    telefonoEmpleado = document.getElementById('telefonoEmpleado').value;
    if(numDocEmpleado==="" || tipoDocEmpleado==="" || nombreEmpleado==="" || apellidoEmpleado==="" || direccionEmpleado==="" || telefonoEmpleado==="" ){
        alert('Ningún dato puede quedar vacío');
        window.location.reload();
        return false;
    }
    else{
        return true;
    }
}

function validarci(){
    var fechaCita;
    var horaCita;
    fechaCita = document.getElementById('fechaCita').value;
    horaCita = document.getElementById('horaCita').value;
    mensajes="Ningún dato puede quedar vacío";
    mensajes2="El formato del teléfono no es válido";
if(fechaCita === "" || horaCita===""){
    alert('Ningún dato puede quedar vacío');
        return false;
}
}
function validarEditarCuentacli(){
var newpass;
var newdir;
var newtel;
var pass;
var dir;
var tel;
newpass = document.getElementById('newpass').value;
newdir = document.getElementById('newdir').value;
newtel = document.getElementById('newtel').value;
pass = document.getElementById('pass').value;
dir = document.getElementById('dir').value;
tel = document.getElementById('tel').value;
if(newpass === "" & newdir=== "" & newtel=== ""){
    alert('Ningún dato puede quedar vacío');
    window.location.reload();
    return false;
}
if(pass === newpass, dir === newdir, tel === newtel){
    alert('Si va a modificar su información, edite los valores primero');
    window.location.reload();
    return false;
}
}
function validarCrearSer(){
var nombreServicio;
var descripcionServicio;
nombreServicio = document.getElementById('nombreServicio').value;
descripcionServicio = document.getElementById('descripcionServicio').value;
if(nombreServicio === "" || descripcionServicio=== ""){
    alert('Ningún dato puede quedar vacío');
    window.location.reload();
    return false;
}
}
function imprimir() {
    if (window.print) {
        // var button;
        // button = Document.getElementById('button').value;
        // document.getElementById('button').visibility="hidden";
        window.print();
    } else {
        alert("La función de impresión no está soportada por su navegador.");
    }
}