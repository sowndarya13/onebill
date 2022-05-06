import React from "react";
import { BrowserRouter as Router, Link, Route } from "react-router-dom";
import Personal from "./personal";
import Education from "./education";
import Experience from "./experience";
import Project from "./projects";
import Extra from "./extra";
const Routing = (
  <div>
    <Router>
      <Link to="/"></Link>
      <Route exact path="/" component={Personal}></Route>
      <Route path="/education" component={Education}></Route>
      <Route path="/project" component={Project}></Route>
      <Route path="/experience" component={Experience}></Route>
      <Route path="/extra" component={Extra}></Route>
    </Router>
  </div>
);
export default Routing;
