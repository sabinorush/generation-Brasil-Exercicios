import React, { useState, useEffect, ChangeEvent } from 'react';
import { Grid, Box, Typography, TextField, Button } from '@material-ui/core';
import { Link, useHistory } from 'react-router-dom';
import UserLogin from '../../models/UserLogin';
import { login } from '../../services/Service';
import './Login.css';
import { useDispatch } from 'react-redux';
import { addToken } from '../../store/tokens/actions';

function Login() {
  let history = useHistory();
  const dispatch = useDispatch();
  const [token, setToken] = useState('');
  const [userLogin, setUserLogin] = useState<UserLogin>(
    {
      id: 0,
      usuario: '',
      senha: '',
      token: ''
    }
  )

  function updatedModel(e: ChangeEvent<HTMLInputElement>) {
    setUserLogin({
      ...userLogin,
      [e.target.name]: e.target.value
    })
  }
  useEffect(() => {
    if (token != '') {
      dispatch(addToken(token))
      history.push('/home')
    }
  }, [token])

  async function onSubmit(e: ChangeEvent<HTMLFormElement>) {
    e.preventDefault();
    try {
      await login(`/usuarios/logar`, userLogin, setToken)

      alert('Usuario logado com sucesso!');
    } catch (error) {
      alert('Dados do usuário inconsistentes. Erro ao logar!');
    }
  }

  return (
    <Grid container direction='row' justifyContent='center' alignItems='center'>
      <Grid alignItems='center' xs={6}>

        <Box paddingX={20}>

          <form onSubmit={onSubmit}>
            <Typography
              variant='h3'
              gutterBottom color='textPrimary'
              component='h3'
              align='center'
              className='textos-login'>Entrar
            </Typography>

            <TextField
              id='usuario'
              value={userLogin.usuario}
              onChange={(e: ChangeEvent<HTMLInputElement>) => updatedModel(e)}
              label='usuario'
              variant='outlined'
              name='usuario'
              margin='normal'
              fullWidth
            />

            <TextField
              id='senha'
              value={userLogin.senha}
              onChange={(e: ChangeEvent<HTMLInputElement>) => updatedModel(e)}
              label='senha'
              variant='outlined'
              name='senha'
              margin='normal'
              type='password'
              fullWidth
            />

            <Box marginTop={2} textAlign='center'>
              <Button type='submit' variant='contained' color='primary'>
                Logar
              </Button>
            </Box>
          </form>

          <Box display='flex' justifyContent='center' marginTop={2}>
            <Box marginRight={1}>
              <Typography
                variant="subtitle1"
                gutterBottom
                align='center'
                className='textos-login'>Não tem uma conta?
              </Typography>

            </Box>
            <Link to='/cadastrousuario'>
              <Typography
                variant="subtitle1"
                gutterBottom
                align='center'
                className='textos-login' >Cadastre-se
              </Typography>
            </ Link>


          </Box>
        </Box>
      </Grid>
      <Grid xs={6} className='imagem'>
      </Grid>
    </Grid>
  );
}

export default Login;