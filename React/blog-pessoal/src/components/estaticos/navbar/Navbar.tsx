import React from 'react';
import { AppBar, Box, Toolbar, Typography } from '@material-ui/core';
import { Link } from 'react-router-dom';
import { useHistory } from 'react-router-dom';
import useLocalStorage from 'react-use-localstorage';
import './Navbar.css';



function Navbar() {
  const [token, setToken] = useLocalStorage('token');
  let history = useHistory();

  function goLogout() {
    setToken('')
    alert('Usuario deslogado')
    history.push('/login')
  }

  return (
    <>
      <AppBar position="static" className="color-background">
        <Toolbar color-background variant="dense">
          <Box className='cursor'>
            <Typography variant="h5" color="inherit">
              BlogPessoal
            </Typography>
          </Box>

          <Box display="flex" paddingLeft={6} justifyContent="start">

            <Link to="/home" className="text-decorator-none">
              <Box mx={1} className='cursor'>
                <Typography variant="h6" color="inherit">
                  Home
                </Typography>
              </Box>
            </Link>

            <Link to="/posts" className="text-decorator-none">
              <Box mx={1} className='cursor'>
                <Typography variant="h6" color="inherit">
                  Postagens
                </Typography>
              </Box>
            </Link>

            <Link to="/temas" className="text-decorator-none">
              <Box mx={1} className='cursor'>
                <Typography variant="h6" color="inherit">
                  Temas
                </Typography>
              </Box>
            </Link>

            <Link to="/formularioTema" className="text-decorator-none">
              <Box mx={1} className='cursor'>
                <Typography variant="h6" color="inherit">
                  Cadastrar Tema
                </Typography>
              </Box>
            </Link>


            <Box mx={1} className='cursor' onClick={goLogout}>
              <Typography variant="h6" color="inherit">
                Logout
              </Typography>
            </Box>
          </Box>

        </Toolbar>
      </AppBar>
    </>
  )
}

export default Navbar;