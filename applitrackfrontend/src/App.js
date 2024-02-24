import './App.css';
import {
  BrowserRouter as Router,
  Routes,
  Route,
} from "react-router-dom";

import LandingPage from "./pages/LandingPage";
import SignUp from "./pages/SignUp";
import SignIn from "./pages/SignIn";

function App() {
  return (
    <Router>
        <Routes>
            <Route exact path="/" element={<LandingPage />} />
            <Route exact path="/sign_up" element={<SignUp />} />
            <Route exact path="/sign_in" element={<SignIn />} />
        </Routes>
    </Router>
  );
}

export default App;