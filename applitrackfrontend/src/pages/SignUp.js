import * as React from 'react';
import Button from '@mui/material/Button';
import CssBaseline from '@mui/material/CssBaseline';
import TextField from '@mui/material/TextField';
import Link from '@mui/material/Link';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import AlertMessage from '../components/AlertMessage';
import { useState } from 'react';

const logoStyle = {
  width: '120px',
  height: 'auto',
};

function Copyright(props) {
  return (
    <Typography variant="body2" color="text.secondary" align="center" {...props}>
      {'Copyright © '}
        AppliTrack
      {' '}
      {new Date().getFullYear()}
      {'.'}
    </Typography>
  );
}

export default function SignUp() {
  const [alertMessage, setAlertMessage] = useState('');
  const [alertSeverity, setAlertSeverity] = useState('success');
  const [showAlert, setShowAlert] = useState(false);

  const handleSubmit = async (event) => {
    event.preventDefault();
    const sign_up_data = new FormData(event.currentTarget);
    
    const request_body = {
      username : sign_up_data.get('username'),
      email : sign_up_data.get('email'),
      password : sign_up_data.get('password')
    };

    try
    {
      const response = await fetch("http://localhost:8081/sign_up", {
        method : "POST",
        headers : {
          "Content-Type" : "application/json",
        },
        body : JSON.stringify(request_body),
      });

      if(response.ok)
      {
        setAlertSeverity('success');
        setAlertMessage('User signed up successfully');
      }
      else
      {
        setAlertSeverity('error');
        setAlertMessage('Failed to sign up');
      }
      setShowAlert(true);
    }

    catch (error)
    {
      console.error("Error -> ", error);
      setAlertSeverity('error');
      setAlertMessage('An error occurred while signing up');
      setShowAlert(true);
    }
  };

  return (
    <Container component="main" maxWidth="xs">
    <CssBaseline />
    <Box
        sx={{
        marginTop: 8,
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        }}
    >
        <img
          src={
            'applitrackLogo.png'
          }
          style={logoStyle}
          alt="logo of applitrack"
        />
        <Typography component="h1" variant="h5">
        Create Your AppliTrack Account
        </Typography>

        <AlertMessage
            showAlert={showAlert}
            alertSeverity={alertSeverity}
            alertMessage={alertMessage}
            onClose={() => setShowAlert(false)}
        />

        <Box component="form" noValidate onSubmit={handleSubmit} sx={{ mt: 3 }}>
        <Grid container spacing={2}>
          <Grid item xs={12}>
            <TextField
                required
                fullWidth
                id="username"
                label="Username"
                name="username"
                autoComplete="off"
            />
            </Grid>
            <Grid item xs={12}>
            <TextField
                required
                fullWidth
                id="email"
                label="Email Address"
                name="email"
                autoComplete="off"
            />
            </Grid>
            <Grid item xs={12}>
            <TextField
                required
                fullWidth
                name="password"
                label="Password"
                type="password"
                id="password"
                autoComplete="off"
            />
            </Grid>
        </Grid>
        <Button
            type="submit"
            fullWidth
            variant="contained"
            sx={{ mt: 3, mb: 2 }}
        >
            Sign Up
        </Button>
        <Grid container justifyContent="flex-end">
            <Grid item>
            <Link href="/sign_in" variant="body2">
                Already have an account? Sign in
            </Link>
            </Grid>
        </Grid>
        </Box>
    </Box>
    <Copyright sx={{ mt: 5 }} />
    </Container>
  );
}