/*
* getElementByTagName()
* getElementById()
* getElementsByName()
* getElementsByClassName()
* querySelector()
*/

let nome = window.document.getElementById('nome');
let email = document.querySelector('#email');
let assunto = document.querySelector('#assunto');
let nomeOK = false
let emailOK = false
let mapa = document.querySelector('#mapa')

nome.style.width = '100%'
email.style.width = '100%'



function validaNome() {
  let txtNome = document.querySelector('#txtNome')
  if(nome.value.length < 3) {
    txtNome.innerHTML = 'Nome inválido'
    txtNome.style.color = 'red'
    txtNome.style.display = "block"
  } else {
    txtNome.style.display = "none"
    nomeOK = true
  }
}

function validaEmail() {
  let txtEmail = document.querySelector('#txtEmail')

  if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
    txtEmail.innerHTML = "E-mail inválido"
    txtEmail.style.color = 'red'
    txtEmail.style.display = "block"
  } else {
    txtEmail.style.display = "none"
    emailOK = true
  }
}

function validaAssunto() {
  let txtAssunto = document.querySelector('#txtAssunto')

  if(assunto.value.length >= 100) {
    txtAssunto.innerHTML = "Texto muito grande, digite no máximo 100 caraceteres"
    txtAssunto.style.color = "red"
    txtAssunto.style.display = "block"
  } else {
    txtAssunto.style.display = "none"
    assuntoOK = true
  }
}

function enviar() {
  if(nomeOK == true && emailOK == true && assuntoOK == true) {
    alert("Formulário enviado com sucesso!")
  } else {
    alert("Preencha o formulário corretamente antes de enviar...")
  }
}

function mapaZoom() {
  mapa.style.width = "500px"
  mapa.style.height = "300px"
}

function mapaNormal() {
  mapa.style.width = "400px"
  mapa.style.height = "250px"
}