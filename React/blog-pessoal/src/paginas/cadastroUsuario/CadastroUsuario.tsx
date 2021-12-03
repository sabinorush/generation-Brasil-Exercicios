import { Box, Grid, TextField, Typography, Button } from '@material-ui/core';
import { userInfo } from 'os';
import React, { useState, useEffect, ChangeEvent } from 'react';
import { Link, useHistory } from 'react-router-dom';
import User from '../../models/User';
import { cadastroUsuario } from '../../services/Service';
import './CadastroUsuario.css';

function CadastroUsuario() {

  let history = useHistory();
  const [confirmarSenha, setConfirmarSenha] = useState<String>("")
  const [user, setUser] = useState<User>(
    {
      id: 0,
      nome: '',
      usuario: '',
      senha: ''
    })

  const [userResult, setUserResult] = useState<User>(
    {
      id: 0,
      nome: '',
      usuario: '',
      senha: ''
    })

  useEffect(() => {
    if (userResult.id != 0) {
      history.push("/login")
      console.log(userResult)
    }
  }, [userResult])

  function confirmarSenhaHandle(e: ChangeEvent<HTMLInputElement>) {
    setConfirmarSenha(e.target.value)
  }

  function updatedModel(e: ChangeEvent<HTMLInputElement>) {

    setUser({
      ...user,
      [e.target.name]: e.target.value
    })

  }

  async function onSubmit(e: ChangeEvent<HTMLFormElement>) {
    e.preventDefault()
    if (confirmarSenha == user.senha) {
      cadastroUsuario(`/usuarios/cadastrar`, user, setUserResult)
      alert('Usuario cadastrado com sucesso')
    } else {
      alert('Dados inconsistentes. Favor verificar as informações de cadastro.');
    }
  }

  return (
    <Grid container direction='row' justifyContent='center' alignItems='center'>
      <Grid xs={6} className='imagem-cadastro'> </Grid>
      <Grid xs={6}>
        <Box paddingX={10}>
          <form onSubmit={onSubmit}>
            <Typography
              variant='h3'
              gutterBottom color='textPrimary'
              component='h3'
              align='center'
              className='textos-cadastro'>Cadastre-se
            </Typography>

            <TextField
              id='nome'
              value={user.nome}
              onChange={(e: ChangeEvent<HTMLInputElement>) => updatedModel(e)}
              label='nome'
              variant='outlined'
              name='nome'
              margin='normal'
              fullWidth
            />

            <TextField
              id='usuario'
              value={user.usuario}
              onChange={(e: ChangeEvent<HTMLInputElement>) => updatedModel(e)}
              label='usuario'
              variant='outlined'
              name='usuario'
              margin='normal'
              fullWidth
            />

            <TextField
              id='senha'
              value={user.senha}
              onChange={(e: ChangeEvent<HTMLInputElement>) => updatedModel(e)}
              label='senha'
              variant='outlined'
              name='senha'
              margin='normal'
              type='password'
              fullWidth
            />

            <TextField
              id='confimarSenha'
              value={confirmarSenha}
              onChange={(e: ChangeEvent<HTMLInputElement>) => confirmarSenhaHandle(e)}
              label='Confirmar Senha'
              variant='outlined'
              name='confimarSenha'
              margin='normal'
              type='password'
              fullWidth
            />

            <Box marginTop={2} textAlign='center'>
              <Link to='/login' className='text-decorator-none'>
                <Button variant='contained' color='secondary' className='btnCancelar'>
                  Cancelar
                </Button>
              </Link>
              <Button variant='contained' type='submit' color='primary' >
                Cadastrar
              </Button>
            </Box>

          </form>
        </Box>
      </Grid>

    </Grid>
  );
}

export default CadastroUsuario;