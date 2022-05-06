import React from "react";
import Toolbar from "@material-ui/core/Toolbar";
import AppBar from "@material-ui/core/AppBar";
import Typography from "@material-ui/core/Typography";
import IconButton from "@material-ui/core/IconButton";
import Button from "@material-ui/core/Button";
import MenuIcon from "@material-ui/icons/Menu";
const styling = {
  paddingLeft: "550px",
};
const App1 = () => {
  return (
    <div>
      <AppBar position="static">
        <Toolbar>
          <IconButton
            edge="start"
            style={{
              marginRight: 20,
            }}
            color="inherit"
            aria-label="menu"
          >
            <MenuIcon />
          </IconButton>
          <Typography
            variant="h6"
            style={{
              flexGrow: 1,
            }}
          >
            <h6 style={styling}>Resume Builder</h6>
          </Typography>
          <Button color="inherit">LogIn</Button>
        </Toolbar>
      </AppBar>
    </div>
  );
};
export default App1;
