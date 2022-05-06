import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import Footer from "./footer";
import { Link } from "react-router-dom";
//import "./personal.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "./button.css";
const buttonstyle = {
  marginLeft: 480,
  paddingBottom: 0.4,
};
const button = {
  marginLeft: 4,
  paddingBottom: 0.4,
};
const h6style = {
  marginLeft: 500,
};
const borderstyle = {
  border: "1px solid black",
  paddingTop: 2,

  paddingBottom: "30px",
  margin: "8px 100px 100px 100px",
};
const styling = {
  border: "1px solid black",
  marginTop: 2,
  marginBottom: 20,
  marginLeft: 4,
  marginRight: 4,
  paddingTop: "10px",
  paddingBottom: "10px",
  paddingLeft: "500px",
};
const formstyle = {
  paddingLeft: "30px",
  paddingRight: "30px",
};
function Project() {
  return (
    <div style={borderstyle}>
      <h5 style={styling}>Projects Devoloped</h5>
      <form style={formstyle}>
        <h6 style={h6style}>Project 1</h6>
        <input
          type="text"
          class="form-control"
          placeholder="Title*"
          name="pr1title"
          required
        />
        <br></br>
        <input
          type="text"
          class="form-control"
          placeholder="Link*"
          name="pr1link"
          required
        />
        <br></br>
        <input
          type="text"
          class="form-control"
          placeholder="Description*"
          name="pr1description"
          required
        />
        <hr></hr>
        <h6 style={h6style}>Project 2</h6>
        <input
          type="text"
          class="form-control"
          placeholder="Title*"
          name="pr2title"
          required
        />
        <br></br>
        <input
          type="text"
          class="form-control"
          placeholder="Link*"
          name="pr2link"
          required
        />
        <br></br>
        <input
          type="text"
          class="form-control"
          placeholder="Description*"
          name="pr2description"
          required
        />
        <br></br>
      </form>
      <div class="row">
        <div class="col">
          <Link to="/education">
            <button type="button" class="btn btn-danger" style={buttonstyle}>
              <h6>&lt;&nbsp;&nbsp;Back</h6>
            </button>
          </Link>
        </div>
        <div class="col">
          <Link to="/experience">
            <button type="button" class="btn btn-danger" style={button}>
              <h6>Next &nbsp;&nbsp;&gt;</h6>
            </button>
          </Link>
        </div>
      </div>
      <Footer />
    </div>
  );
}
export default Project;
